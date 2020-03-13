package com.niit.core;
import sun.*;
import oracle.*;
public class SoftwareList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sun.Softwares objSun=new sun.Softwares();
		objSun.listSoftwares();
		oracle.Softwares objOracle=new oracle.Softwares();
		objOracle.printSoftware();
	}

}
