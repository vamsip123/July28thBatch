package com.h2kinfosys.tutorial.corejava.abstractexample;

public class H2kTeachingStaff extends H2kEmployee{
	public int yearWorkingWithH2k(){
		return 3;
	}
	
	@Override
	public void tieColor() {
		System.out.println("Tie Color is Black....");
		
	}
}
