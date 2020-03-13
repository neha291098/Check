package com.niit.core;
import java.util.*;
public class CollectionMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("java for developers");
		al.add("friends");
		al.add("dear");
		al.add("is");
		al.add("superb");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("list after use of Collections.sort(): "+al);
		int pos=Collections.binarySearch(al, "is");
		System.out.println("the position of \"superb\" in arrayList is: "+pos);
		Collections.reverse(al);
		System.out.println("list after reversing: "+al);
		Collections.swap(al, 4, 1);
		System.out.println("list after swapping: "+al);
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("tomcat");
		a2.add("jbos");
		System.out.println(a2);
		Collections.copy(al, a2);
		System.out.println(al);
		
		
	}

}
