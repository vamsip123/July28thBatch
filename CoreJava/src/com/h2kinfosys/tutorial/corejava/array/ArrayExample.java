package com.h2kinfosys.tutorial.corejava.array;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		int ageOne = 10;
		int ageTwo = 20;
		int ageThree = 30;
		
		int age[] = new int[3];
		age[0] = 10;
		age[1] = 20;
		age[2] = 30;
		
		for(int ag : age){
			System.out.println(ag);
		}
		
//		int age[] = {10,20};
		
//		System.out.println(age[0] +"-----"+age[1]);
		
//		System.out.println(age[0] + " " + age[2] +" " + age[1]);
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		 */
//		System.out.println(age[3]);
		
//		System.out.println(ageOne);
		
		/*String binary[] = {
				"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
		};*/
		
//		System.out.println(age);
		
//		System.out.println(binary[5]);
		
		
		String binary[] = {
				"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
		};
		
		System.out.println(binary.length);
		
		/*for(int i = 0 ; i < binary.length ; i++) {
			System.out.println(i);
		}*/
	}

}
