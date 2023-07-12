package com.fssa.corejava.day03.practice;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		user.setName("bakya");
		user.setEmailId("bakya@gmail.com");
		user.setPassword("bakya@623");

		User user1 = new User("bakyalakshmi", "bkya=@3bh", "bakya@gmail.com");

		System.out.println(user.toString());
		System.out.println(user1.toString());

	}

}
