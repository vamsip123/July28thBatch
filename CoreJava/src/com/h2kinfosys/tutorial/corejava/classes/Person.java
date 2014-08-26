package com.h2kinfosys.tutorial.corejava.classes;

public class Person {
	
	public String name = "";
	public int height = 0; // Instance Variable
	public int age = 0;
	public String occupation = "";
	public boolean isWorking;
	
	/*public Person() {
		System.out.println("I m here... in default Constructor");
	}*/
	
	public Person(String name , int height , int age) {
		this.name = name;
		this.height = height;
		this.age = age;
		System.out.println("Object Created is =" + name);
	}
	
	public Person(String myName , int myHeight , int myAge, String myOccupation) {
		this(myName,myHeight, myAge);
		occupation = myOccupation;
		System.out.println("I m in the parameterized Constructor...");
	}
	
	public Person(String myName , int myHeight , int myAge, String myOccupation, boolean working) {
		this(myName,myHeight, myAge,myOccupation);
		
		occupation = myOccupation;
		System.out.println("I m in the parameterized Constructor...");
	}
	
	
	/*
	 * Behaviour
	 * Method function API
	 */
	public void details(){
		System.out.println("name= "+name +" height = "+ height +" age =" + age);
	}
	
	public void calculateWeight(){
		System.out.println("my weight shud be" + (height+age));
	}
	
	protected void finalize() throws Throwable {
		System.out.println("Object Destroyed is =" + name);
	}
}