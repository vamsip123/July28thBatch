package com.h2kinfosys.tutorial.corejava.classes;

public class ObjectAsParameter {
	int age ;
	String name ;
	public void getDetails(Person person){
		// got hit database..and get all the details...
		person.name = "Jayram"; // 
		person.age = 30; // 
	}
	
	public void getDetails(String ssn){
		// got hit database..and get all the details...
//		Person per = new Person();
//		per.name = "Jayram"; // 
//		per.age = 30; // 
	}
	
	/*public void printMe() {
		System.out.println("age ="+ age + "   name ="+ name);
	}*/
	
	public void manipulateNameAgeOfPerson(Person person){
		person.age = person.name.length()* 5;
		person.name = "Mohan";
	}
	
	public static void main(String[] args) {
//		ReturnTypeExample example = new ReturnTypeExample();
		ObjectAsParameter obj = new ObjectAsParameter();
		Person per = new Person("Jayram");
		System.out.println("name = " + per.name);
		obj.manipulateNameAgeOfPerson(per);
		System.out.println("name = " + per.name);
	}
}