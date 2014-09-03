package com.h2kinfosys.tutorial.corejava.inheritance;

public class Kia extends Car {
	
	public void mileage(){
		System.out.println(" Gives 20 Miles / Galon");
	}
	
	@Override
	public String toString() {
		return "This is Kia Car";
	}
}