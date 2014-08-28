package com.h2kinfosys.tutorial.corejava.inheritancetwo;

public class LongPerson extends Person {
	
	private boolean looksDangerous;

	public LongPerson(String name, int height , int ssn) {
		super(name, height, ssn);
	}
	
	public boolean isLooksDangerous() {
		return looksDangerous;
	}

	public void setLooksDangerous(boolean looksDangerous) {
		this.looksDangerous = looksDangerous;
	}
	
}