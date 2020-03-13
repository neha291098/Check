package com.niit.core;

import java.util.*;

public class Student12 implements Comparable<Student> {

	
		// TODO Auto-generated method stub
		int roll_no;
		String name;
		int age;
		Student12(int roll_no,String name,int age){
			this.roll_no=roll_no;
			this.name=name;
			this.age=age;
		}
		public int compareTo(Student12 st2) {
			if(age==st2.age) {
				return 0;
			}
			else if(age>st2.age) {
				return 1;
			}
			else {
				return -1;
			}
		}
}


