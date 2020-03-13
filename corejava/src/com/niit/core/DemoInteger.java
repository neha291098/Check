package com.niit.core;
import java.util.*;
public class DemoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		num=sc.nextInt();
		Integer n=num;
		String hexNum=n.toHexString(num);
		String octNum=n.toOctalString(num);
		String binNum=n.toBinaryString(num);
		
		System.out.println("hex num: "+hexNum);
		System.out.println("oct num: "+octNum);
		System.out.println("bin num: "+binNum);
		
		String hex1="0xaa";
		
		System.out.println(Integer.decode(hex1));
		long sal=500000;
		Long salary=Long.valueOf(sal);
		System.out.println(salary);
	}

}
