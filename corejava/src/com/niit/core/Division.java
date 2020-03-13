package com.niit.core;
import java.util.*;
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("input two integers");
		a=sc.nextInt();
		b=sc.nextInt();
		try {
			result=a/b;
			System.out.println("result: "+result);
			
		}
		catch(ArithmeticException e) {
			System.out.println("exception caught: division by 0");
		}
		finally {
			sc.close();
			System.out.println("in finally block");
		}
	}

}
