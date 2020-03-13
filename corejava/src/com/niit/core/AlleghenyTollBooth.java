package com.niit.core;

import java.util.*;

public class AlleghenyTollBooth implements TollBooth {
	static int tolltotal=0;
	int toll;
	HashMap<String,Integer> truckListCost=new HashMap<String,Integer>();
	//Truck t=new Truck();
	@Override
	public int calculateToll(Truck obj) {
		// TODO Auto-generated method stub
		double ton_conv=obj.kilograms*0.00110231;
		toll=(int) ((obj.axles*5)+(20*ton_conv));
		tolltotal+=toll;
		String tname=obj.toString();
		truckListCost.put(tname,toll);
		return toll;
	}

	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		for(Map.Entry<String, Integer> dis:truckListCost.entrySet()) {
			int len=dis.getKey().substring(14).length();
			System.out.println("Truck type: "+dis.getKey().substring(14).substring(0, len-9) );
			
			System.out.println("Toll price: "+dis.getValue());
		}
		System.out.println("total fare collected: "+tolltotal);
	}

}
