package com.niit.core;
import java.util.*;
public class EmployeeHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map emp=new HashMap();
		emp.put("a1234 ","Steve Jobs");
		emp.put("a1235 ","Scott McNealy  ");
		emp.put("a1236 ","Jeff Bezos ");
		emp.put("a1237 ","Larry Ellison ");
		emp.put("a1238 ","Bill Gates ");
		
		System.out.println(emp.get("a1234"));
		Set s=emp.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
	         Map.Entry me = (Map.Entry)it.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		String inp=sc.next();
		System.out.println(inp);
		System.out.println(emp.get(inp));
		
		
	}

}
