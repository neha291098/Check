package com.niit.core;
import java.util.*;
public class ComparatorDemo 
	{
	       public static void main (String[] args)
	           {
	                ArrayList<Student29> ar = new ArrayList<Student29>();
	                ar.add(new Student29(111, "bbbb", "london"));
	                ar.add(new Student29(131, "aaaa", "nyc"));
	                ar.add(new Student29(121, "cccc", "jaipur"));

	                System.out.println("Unsorted");
	                for (int i=0; i<ar.size(); i++)
	                System.out.println(ar.get(i));

	                Collections.sort(ar, new Sortbyroll());

	                System.out.println("\nSorted by rollno");
	                for (int i=0; i<ar.size(); i++)
	                System.out.println(ar.get(i));

	                Collections.sort(ar, new Sortbyname());

	                System.out.println("\nSorted by name");
	                for (int i=0; i<ar.size(); i++)
	                System.out.println(ar.get(i));
	        }       
}
