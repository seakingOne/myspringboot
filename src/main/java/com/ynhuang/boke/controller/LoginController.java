package com.ynhuang.boke.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ynhuang.boke.service.UserService;
import com.ynhuang.boke.vivo.User;

@Controller
@RequestMapping(value = "/boke")
public class LoginController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/isLogin")
	public String isLogin() {
		return "login/login";
	}

	@ResponseBody
	@PostMapping(value = "/login")
	public Map<String, String> login(@RequestParam String username, @RequestParam String userpwd,
			HttpServletRequest req) {
		Map<String, String> result = new HashMap<String, String>();
		if ("admin".equals(username) && "admin".equals(userpwd)) {
			result.put("state", "0");
		} else {
			result.put("state", "1");
		}
		req.getSession().setAttribute("username", username);
		return result;
	}

	@GetMapping(value = "/main")
	public String main() {
		List<User> list = userService.getList();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getUserName());
		}
		return "login/index";
	}

}
