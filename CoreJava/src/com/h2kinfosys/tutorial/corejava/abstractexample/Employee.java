package com.h2kinfosys.tutorial.corejava.abstractexample;

public abstract class Employee {
	
	private String name;
	private String profession;
	private int empId;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	final void commonFeature() {
		System.out.println(  " EmpID =" + empId+" His Profession is "+ profession);
	}
	
	public abstract void tieColor();
	
}
