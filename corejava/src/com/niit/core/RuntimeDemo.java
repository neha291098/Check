package com.niit.core;

public class RuntimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime objRun=Runtime.getRuntime();
		Process objProcess;
		try {
			objProcess=objRun.exec("Notepad.exe");
		}
		catch(Exception e) {
			System.out.println("error executing calculator");
		}
	}

}
