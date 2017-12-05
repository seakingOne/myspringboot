package com.ynhuang.boke.vivo;

public class User {
	private String userName;

	private String userPwd;

	private int userId;

	private int userAge;

	public User() {
		
	}

	public User(String userName, String userPwd, int userId, int userAge) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.userId = userId;
		this.userAge = userAge;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

}
