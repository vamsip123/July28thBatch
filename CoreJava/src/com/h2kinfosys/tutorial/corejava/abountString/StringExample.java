package com.h2kinfosys.tutorial.corejava.abountString;

import com.h2kinfosys.tutorial.corejava.classes.Person;

public class StringExample {
	int i = 0;
	String name = "";
	
	/**
	 * Manipulates the person Object
	 * 
	 * @param person
	 */
	public void changePersonProperties(Person person) { // STEP 4
		person.age = person.name.length() * 5;
		person.name = "Mohan";
	}

	public void changeStringValue(String name) {
		name = "Testing";
	}

	public static void main(String[] args) {
		StringExample stringExample = new StringExample();

		Person per = new Person("Jayram"); // STEP 1
		System.out.println("name = " + per.name); // STEP 2

		stringExample.changePersonProperties(per); // STEP 3
		System.out.println("name = " + per.name); // STEP5
	 		
		/*String myName = "Jayram";
		System.out.println("myName Before = "+myName);
		stringExample.changeStringValue(myName);
		System.out.println("myName After = "+myName);*/
		
//		String newCourse = new String("Dot NET");
		String myNumberValue = "0";
		myNumberValue = myNumberValue.concat("1");
		myNumberValue = myNumberValue.concat("2");
		myNumberValue = myNumberValue.concat("3");
		
		System.out.println(myNumberValue);
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("0");
		buffer.append("1");
		
		System.out.println(buffer);
		
		
		/*for(int i = 0 ; i < 50 ; i++) {
			buffer.append(i);
		}
		
		
		System.out.println(myNumberValue);*/
		
		/*String course = "Java";
		course = course + "with WebService";
		
		System.out.println(course);
		*/
	}
}