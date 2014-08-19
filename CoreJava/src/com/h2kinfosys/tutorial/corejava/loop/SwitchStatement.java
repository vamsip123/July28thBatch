package com.h2kinfosys.tutorial.corejava.loop;

public class SwitchStatement {

	public static void main(String[] args) {
		
//		int one = Integer.parseInt("1");
		
		
		int i = Integer.parseInt(args[0]);
		
		switch (i) {
		case 1:
			System.out.println("ONE");
//			break;

		case 2:
			System.out.println("TWO");
			break;

		case 3:
			System.out.println("THREE");
//			break;

		default:
			System.out.println("SOMETHING");
			break;
		}
		System.out.println("I m out...");
	}
}