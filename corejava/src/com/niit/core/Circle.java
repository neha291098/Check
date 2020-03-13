package com.niit.core;

public class Circle implements Shape {
	private double radius;
	public Circle(double r) {
		this.radius=r;
	}
	public void draw() {
		System.out.println("drawing circle");
	}
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	public double getRadius() {
		return this.radius;
	}
}
