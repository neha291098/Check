package com.niit.core;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String languages[]= {"c","c++","java","perl","python"};
		try {
			for(int c=1;c<=5;c++) {
				System.out.println(languages[c]);
			}
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
