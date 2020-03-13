package com.niit.core;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class PlantHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set plants=new HashSet<String>();
		plants.add(" watermelon");
		plants.add(" banana ");
		plants.add(" cherry ");
		plants.add(" pear");
		plants.add(" cantaloupe ");
		plants.add(" blackberry ");
		plants.add(" ginseng ");
		plants.add(" strawberry ");
		plants.add(" iris ");
		plants.add(" potato ");
		Iterator it=plants.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
