package com.niit.core;


import java.util.*;

public class TestArrayList21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new ArrayList<String>();
		al.add("jim");
		al.add("michael");
		al.add("james");
		al.add("andy");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
