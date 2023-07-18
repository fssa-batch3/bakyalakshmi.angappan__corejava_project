package com.fssa.corejava.day05.solved;

public class Rectangle implements Polygon {
//	calcualting area of a rectangle 

	@Override
	public double area(double a, double b) {
//		System.out.println("numberOfSides :" + numberOfSides );
		System.out.println("Calculating Rectangle area");

		return a * b;
	}

}
