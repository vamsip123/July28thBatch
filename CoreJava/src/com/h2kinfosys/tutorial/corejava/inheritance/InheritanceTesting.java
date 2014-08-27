package com.h2kinfosys.tutorial.corejava.inheritance;

public class InheritanceTesting {

	public static void main(String[] args) {
		H2kInfoEmployee emp = new H2kInfoEmployee(123,"Jayram",2345678);
		emp.wearTie();
		JayramEmployee jayEmp = new JayramEmployee();
		jayEmp.wearTie();
	}
}
