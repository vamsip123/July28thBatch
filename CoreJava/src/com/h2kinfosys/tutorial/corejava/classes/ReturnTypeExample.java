package com.h2kinfosys.tutorial.corejava.classes;

public class ReturnTypeExample {
	
	public Person returnPerson(String name){
//		Person per = new Person(name);
//		return per;
		return new Person(name);
	}
	
	public void printDetails(String name){
		System.out.println(" Hello "+ name);
	}
	
	//Create a method which will give me a person object by passing a name to it.
	
	public static void main(String[] args) {
		ReturnTypeExample example = new ReturnTypeExample();
		Person per = example.returnPerson("Jayram");
		System.out.println(per.name);
	}
}