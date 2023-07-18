package com.fssa.corejava.day05.solved;

public class RightAngledTriangle implements Polygon {

//	calculating area of a RightAngledTriangle

	@Override
	public double area(double a, double b) {
		System.out.println("Calculating RightAngledTriangle area");

//		area of triangle 1/2(a*b)
		return (0.5 * a * b);
	}

}
