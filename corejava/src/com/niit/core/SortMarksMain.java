package com.niit.core;

import java.util.*;

public class SortMarksMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(new Student17(1,"Neha","B-TECH",67));
		a.add(new Student17(2,"Raxit","MCA",51));
		a.add(new Student17(3,"Mansi","BCA",59));
		a.add(new Student17(2,"Harshita","MCA",90));
		System.out.println("before sorting...");
		System.out.println(a);
		Collections.sort(a);
		System.out.println("after sorting...");
		System.out.println(a);
	}

}
