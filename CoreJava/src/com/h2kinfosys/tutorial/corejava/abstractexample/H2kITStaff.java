package com.h2kinfosys.tutorial.corejava.abstractexample;

public class H2kITStaff extends H2kEmployee implements Singable {

	@Override
	public void tieColor() {
		System.out.println("Tie Color is Blue....");
	}

	@Override
	public int yearWorkingWithH2k() {
		return 10;
	}
	
	@Override
	public String singSolo() {
		return "It Staffs are vergood singers....";
	}
}

// so in the heirarchy, until the implementation is provided for an abstract
// method , the subclass will have to be abstract class!!
