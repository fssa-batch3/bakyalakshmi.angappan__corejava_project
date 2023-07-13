package com.fssa.corejava.day04.solved.inheritancedemo2;

/**
 * @author Vinit Gore
 *
 **/
public class Animal {
	private int age;
	private String name;

	public Animal(String name) {
		System.out.println("Calling Parent Constructor");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
