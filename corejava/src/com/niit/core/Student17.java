package com.niit.core;
import java.util.*;
public class Student17 implements Comparable<Student17>{
	int rollno; 
	String name; 
	String course; 
	int marks;
	public Student17(int rollno, String name, String course, int marks) {
		this.rollno=rollno;
		this.name=name;
		this.course=course;
		this.marks=marks;
	}
	public int compareTo(Student17 s) {
		return marks-s.marks;
	}
	 public String toString() // LINE B
	    {
	        return "{rollno : " + rollno+ " name : " + name + " course : " + course+ " marks : "+marks+ "}";
	    }
}
