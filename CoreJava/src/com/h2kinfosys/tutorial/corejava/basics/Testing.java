package com.h2kinfosys.tutorial.corejava.basics;

public class Testing {
	public static void main(String[] args) {
		int jayramAge = 10;
		int mohanAge = 20;
		int totalAge = jayramAge+mohanAge;
		int avgAge = totalAge/2;
		
		System.out.println("Value of Total Age = "+ (jayramAge+mohanAge));
		
		System.out.println("Testing.main()" + totalAge);
		
		System.out.println("Testing.main() Average Age "+ avgAge);
	}
}