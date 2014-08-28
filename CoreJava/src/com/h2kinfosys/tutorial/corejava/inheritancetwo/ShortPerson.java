package com.h2kinfosys.tutorial.corejava.inheritancetwo;

public class ShortPerson extends Person {
	private int runningSpeed;
	
	public ShortPerson(String name, int height , int ssn) {
		super(name, height, ssn);
	}
	public int getRunningSpeed() {
		return runningSpeed;
	}

	public void setRunningSpeed(int runningSpeed) {
		this.runningSpeed = runningSpeed;
	}
}
