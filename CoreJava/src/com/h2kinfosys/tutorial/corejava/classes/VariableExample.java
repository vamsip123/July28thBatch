package com.h2kinfosys.tutorial.corejava.classes;

public class VariableExample {
	static String instanceName = "Jayram";
	
	public static void callMe(){
		System.out.println("callme");
	}
	int age = 10;
	Person per = new Person("");
	
	// you cannot access non static methods or varables inside a static method.
	
	public static void main(String[] args) {
		System.out.println(instanceName);
		VariableExample ex = new VariableExample();
		
		ex.callMe();
		callMe();
		
/*		String localName = "Raj";
		Person jayram = new Person("Jayram");
		Person purvi = new Person("Purvi");
		
		System.out.println(jayram.name);
		jayram.name = "Rout";
		System.out.println(jayram.name);
		System.out.println(jayram.car);
		jayram.car = "BMW";
		
		System.out.println(jayram.car);
		
		System.out.println("=======================");
		System.out.println(purvi.name);
		purvi.name = "PurviSurName";
		System.out.println(purvi.name);
		System.out.println(purvi.car);
*/		
	}

}
