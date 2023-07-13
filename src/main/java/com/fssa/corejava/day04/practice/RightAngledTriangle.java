package com.fssa.corejava.day04.practice;

public class RightAngledTriangle extends Square {

	protected double breadth;
	protected double height;

	protected double a;
	protected double b;
	protected double c;

	public RightAngledTriangle(double a, double b, double c) throws Exception {
		super(3);
		if (a <= 0 || b <= 0 || c <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double calculateArea() {
		return (this.breadth * this.height) / 2;
	}

	@Override
	public int getNumberOfSides() {
		return super.numberOfSides;
	}

	@Override
	public double Circumference() {
		return this.a + this.b + this.c;
	}
}
