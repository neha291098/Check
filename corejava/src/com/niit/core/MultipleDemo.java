package com.niit.core;

interface Exam{
	void percent_cal();
}
class Student1{
	String name;
	int roll_no,mark1,mark2;
	Student1(String n,int r,int m1,int m2){
		name=n;
		roll_no=r;
		mark1=m1;
		mark2=m2;
	}
	void display() {
		System.out.println("name of student: "+name);
		System.out.println("roll number of student: "+roll_no);
		System.out.println("mark of subject 1: "+mark1);
		System.out.println("mark of subject 2: "+mark2);
	}
}
class Result extends Student1 implements Exam{
	Result(String n,int r,int m1,int m2){
		super(n,r,m1,m2);
	}
	public void percent_cal() {
		int total=mark1+mark2;
		float percent=total*100/200;
		System.out.println("percentage: "+percent+"%");
	}
	void display() {
		super.display();
	}
}



public class MultipleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result r=new Result("john",12,93,84);
		r.display();
		r.percent_cal();

	}

}
