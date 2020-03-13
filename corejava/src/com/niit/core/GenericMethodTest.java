package com.niit.core;

public class GenericMethodTest {

	public static<E> void printArray(E[] inputArray) {
		// TODO Auto-generated method stub
		for(E element:inputArray) {
			//System.out.printf("%s",element);
			System.out.print(element+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] intArray= {1,2,3,4,5};
		Double[] doubleArray= {1.1,2.2,3.3,4.4};
		Character[] charArray= {'H','E','L','L','O'};
		System.out.println("array integer contains:");
		printArray(intArray);
		System.out.println("\n array doubleArray contains: ");
		printArray(doubleArray);
		System.out.println("\n array characterArray contains: ");
		printArray(charArray);
	}
}
