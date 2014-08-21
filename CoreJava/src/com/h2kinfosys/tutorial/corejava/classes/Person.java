package com.h2kinfosys.tutorial.corejava.classes;

public class Person {
	
	String name = "";
	int height = 0; // Instance Variable
	int age = 0;
	
	/*
	 * Behaviour
	 * Method function API
	 */
	public void details(){
		System.out.println("name= "+name +" height = "+ height +" age =" + age);
		Person per = new Person();
		per.name = "Mohan";
		
		System.out.println(per.name);
	}
	
	public void calculateWeight(){
		System.out.println("my weight shud be" + (height+age));
	}
}