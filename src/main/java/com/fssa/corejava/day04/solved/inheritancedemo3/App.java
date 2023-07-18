package com.fssa.corejava.day04.solved.inheritancedemo3;

public class App {

	public static void main(String[] args) throws Exception {

		Rectangle rectangle = new Rectangle(12, 12);

		System.out.println("area: " + rectangle.calculateArea());
		System.out.println("size: " + rectangle.getNumberOfSides());

		Square square = new Square(1);
		System.out.println("area of square: " + square.getNumberOfSides());

	}

}
