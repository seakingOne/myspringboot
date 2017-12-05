package com.ynhuang.boke.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.ynhuang.boke.vivo.User;

@Service
public class UserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<User> getList() {
		String sql = "SELECT * FROM user";
		return jdbcTemplate.query(sql, new UserRowMapper());
	}

	/**
	 * 定义内部类实现RowMapper接口
	 */
	@SuppressWarnings("rawtypes")
	public class UserRowMapper implements RowMapper {
		@Override
		public Object mapRow(ResultSet rs, int num) throws SQLException {
			// TODO Auto-generated method stub
			// 对类进行封装
			User user = new User();
			user.setUserId(rs.getInt("userid"));
			user.setUserName(rs.getString("username"));
			user.setUserPwd(rs.getString("userpwd"));
			user.setUserAge(rs.getInt("userage"));
			return user;
		}
	}

}
