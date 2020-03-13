package com.niit.core;

public class Rectangle implements Shape{
	private double width;
	private double height;
	public Rectangle(double w,double h) {
		this.width=w;
		this.height=h;
	}
	public double getArea() {
		return this.height*this.width;
	}
	public void draw() {
		System.out.println("drawing rectangle");
	}
	
	
	
}
