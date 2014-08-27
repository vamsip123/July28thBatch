package com.h2kinfosys.tutorial.corejava.inheritance;

public class Employee {
	private int empID;
	private String empName; // JayramTuter
	private int ssn;
	/*public Employee(){
		
	}*/
	/**
	 * 
	 * @param empID
	 * @param empName
	 * @param ssn
	 */
	public Employee(int empID , String empName , int ssn) {
		this.empID = empID;
		this.empName = empName;
		this.ssn = ssn;
	}
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpID() {
		return empID;
	}

	public int getSsn() {
		return ssn;
	}
	
	public void workingDetails(){
		System.out.println("I work as an Employee worker");
	}
	
	public void wearTie(){
		System.out.println("I wear a Tie");
	}
}
