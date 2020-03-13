package com.niit.core;

class Test<T>{
	T obj;
	Test(T obj){
		this.obj=obj;
	}
	public T getObject() {
		return this.obj;
	}
}
public class GenericsClassDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<Integer> iObj=new Test<Integer>(15);
		System.out.println(iObj.getObject());
		Test<String> sObj=new Test<String>("generics");
		System.out.println(sObj.getObject());
		Test<Float> fObj=new Test<Float>(7.8f);
		System.out.println(fObj.getObject());
	}

}
