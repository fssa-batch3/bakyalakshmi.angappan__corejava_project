package com.fssa.corejava.day03.practice;

public class User {

	private String name;
	private String password;
	private String emailId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public User() {
	}

	public User(String name, String password, String emailId) {
		this.name = name;
		this.password = password;
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "User [name=" + getName() + ", password=" + getPassword() + ", emailId=" + getEmailId() + "]";
	}

}
