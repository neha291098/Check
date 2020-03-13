package com.niit.core;

public class ThrowsDemo {
	void Division() throws ArithmeticException{
		int a= 45,b=0,rs;
		rs=a/b;
		System.out.println("\n\t the result is: "+rs);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsDemo T=new ThrowsDemo();
		try {
			T.Division();
		}
		catch(ArithmeticException e) {
		System.out.println("\n\t error: "+e.getMessage());
	}
		System.out.println("\n\t end of program");

}
}
