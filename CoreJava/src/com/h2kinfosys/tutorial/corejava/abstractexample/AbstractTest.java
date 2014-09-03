package com.h2kinfosys.tutorial.corejava.abstractexample;

public class AbstractTest {

	public static void main(String[] args) {
		WiproEmployee wipro = new WiproEmployee();
		wipro.tieColor();

		H2kEmployee itStaff = new H2kITStaff();
		System.out.println(itStaff.yearWorkingWithH2k());
		// itStaff.singSolo();

		H2kTeachingStaff teachingStaff = new H2kTeachingStaff();
		teachingStaff.commonFeature();

		Singable sing = new H2kITStaff();
//		sing.singSolo();

		invokeMeForSinging(sing);
	}
	
	
	public static void invokeMeForSinging(Singable sing) {
		sing.singSolo();
	}
	
	// what is the harm in using child class ref variable instead of parent
	// class ref variable to refer child class object?

}