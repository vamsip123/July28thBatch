package com.h2kinfosys.tutorial.corejava.inheritance;

public class ObjectTesting {

	public static void main(String[] args) {
		Car kia1 = new Kia();
		Car kia2 = kia1;
		Car kia3 = new Kia();
//		System.out.println(kia1.equals(kia2));
		
//		System.out.println(kia1.equals(kia3));
		
		System.out.println((kia1 == kia3));
		System.out.println((kia1 == kia2));
	}
}