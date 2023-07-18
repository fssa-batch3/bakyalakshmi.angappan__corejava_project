package com.fssa.corejava.day04.solved.inheritancedemo3;

//super class
public abstract class Polygon {
	protected int numberOfSides;

//	constructor of superclass
	public Polygon(int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		} else {
			this.numberOfSides = numberOfSides;
		}
		System.out.println("size :" + this.numberOfSides);
	}

	public abstract double calculateArea();

}