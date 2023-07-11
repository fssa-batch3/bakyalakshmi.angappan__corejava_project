package com.fssa.corejava.day02.misc;

public class Student {

	String name;
	int id;
	String email;
	public static String academy;
	static int count = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCode() {
		return academy;
	}

	static {
		academy = Student.academy;
	}

	public Student() {
		Student.count++;
	}

}
