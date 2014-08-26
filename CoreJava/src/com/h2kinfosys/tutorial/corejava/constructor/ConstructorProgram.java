package com.h2kinfosys.tutorial.corejava.constructor;

import com.h2kinfosys.tutorial.corejava.classes.Person;

public class ConstructorProgram {

	public static void main(String[] args) {
//		int i = 0;
		
		/*while(true){
			new Person("Jayram"+(i++), 3, 3);
		}*/
		
		for(int i = 0 ; i < 10000; i++){
			new Person("Jayram"+(i), 3, 3);
		}
		
		/*Person jayram = new Person("Jayram", 3, 3);
		jayram.details();
		*/
		/*Person radhika = new Person("Radhika", 4,4);
		Person anagha = new Person("Anagha",5, 16);
		System.out.println(" Radhika Name ="+radhika.name);
		
		System.out.println("Jayram Name =" + jayram.name);
		System.out.println(" Anagha Name ="+anagha.name);
		
		Person raj = new Person("Raj",5, 20, "Cobol Program",true);
		System.out.println("Raj Name = "+raj.name);*/
		
	}
}