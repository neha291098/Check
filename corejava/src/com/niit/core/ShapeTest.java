package com.niit.core;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape shape=new Circle(10);
		//shape.draw();
		//System.out.println("area: "+shape.getArea());
		//switching from one implementation to another easily
		Shape shape1=new Rectangle(10,10);
		shape1.draw();
		System.out.println("area: "+shape1.getArea());
	}

}
