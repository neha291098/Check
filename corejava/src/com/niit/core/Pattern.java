package com.niit.core;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upper half
		for(int i=0;i<5;i++) {
			int f=0;
			for(int j=0;j<5;j++) {
				if(j<5-i-1) {
					System.out.print(" ");
				}
				else if(j>=5-i-1 & j<5){
					System.out.print("*");
					}
				}
			while(f<i) {
				System.out.print("*");
				f++;
			}
			System.out.println();
			
		}
		//below half
		for(int i=0;i<4;i++) {
			int f=0;
			while(f<i+1) {
				System.out.print(" ");
				f++;
				}
			while(f<=7-i) {
				System.out.print("*");
				f++;
				}
			System.out.println();
			}
		}
}
