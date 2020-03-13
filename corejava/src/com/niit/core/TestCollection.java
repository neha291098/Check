package com.niit.core;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("abc");
		queue.add("john");
		queue.add("jim");
		queue.add("mary");
		queue.add("me");
		queue.add("raul");
		queue.add("abc");
		queue.add("Abc");
		queue.add("Abc");
		
		
		
		System.out.println(queue);
		System.out.println("head: "+queue.element());
		System.out.println("head: "+queue.peek());
		System.out.println("iterating the queue elements: ");
		Iterator it=queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator it2=queue.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
	}

}
