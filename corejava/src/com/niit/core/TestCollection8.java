package com.niit.core;
import java.util.*;
public class TestCollection8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("jim");
		al.add("jerry");
		al.add("john");
		al.add(1,"jive");
		System.out.println("element at 2nd pos: "+al.get(2));
		ListIterator<String> itr=al.listIterator(al.size());
		System.out.println("traversing in forward direction");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("traversing in backward direction");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		//System.out.println(al.get(0));
		
	}

}
