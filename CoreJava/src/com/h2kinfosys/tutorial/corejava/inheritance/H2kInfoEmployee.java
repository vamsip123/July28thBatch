package com.h2kinfosys.tutorial.corejava.inheritance;

public class H2kInfoEmployee extends Employee {
	
	public H2kInfoEmployee(int empID , String empName , int ssn) {
		super(empID,empName,ssn);
	}
	
	@Override
	public void wearTie() {
		System.out.println(" I wear a Red Tie");
	}
	
	public void wearTie(String name) {
		System.out.println(" I wear a Red Tie");
	}
	
}