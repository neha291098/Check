package com.niit.core;

public class TestTollBooth {
	public static void main(String [] args){

		TollBooth booth = new AlleghenyTollBooth();
		System.out.println("ford has come..");
		Truck ford = new FordTruck(5, 12000); // 5 axles and 12000 kilograms
		System.out.println("No. of axels: "+ford.axles);
		System.out.println("weight: "+ford.kilograms);
		int ford_toll=booth.calculateToll(ford);
		System.out.println("ford toll total: "+ford_toll);
		System.out.println("overall toll data: ");
		booth.displayData(); 
		System.out.println("----");
		System.out.println("nissan has come..");
		Truck nissan = new NissanTruck(2, 5000); // 2 axles and 5000kg Truck daewoo = new DaewooTruck(6, 17000); // ….
		System.out.println("No. of axels: "+nissan.axles);
		System.out.println("weight: "+nissan.kilograms);
		int nissan_toll=booth.calculateToll(nissan);
		System.out.println("nissan booth total: "+nissan_toll);
		System.out.println("overall toll data");
		booth.displayData();
		}
}
