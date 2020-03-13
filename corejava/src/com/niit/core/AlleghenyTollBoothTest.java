package com.niit.core;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlleghenyTollBoothTest {

	private NissanTruck nis;
	TollBooth atb = new AlleghenyTollBooth();
	@Before
	public void setUp() throws Exception {
		nis=new NissanTruck(2, 5000);
		//atb.calculateToll(nis);
	}

	@After
	public void tearDown() throws Exception {
		nis=null;
		atb=null;
	}

	@Test
	public void testCalculateToll() {
		double result=atb.calculateToll(nis);
		assertEquals(120,result,0);
	}

	

}
