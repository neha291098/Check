package com.niit.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student12> al=new ArrayList<Student12>();
		al.add(new Student12(2,"neha",21));
		al.add(new Student12(1,"raxit",21));
		
		Collections.sort(al);
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}
