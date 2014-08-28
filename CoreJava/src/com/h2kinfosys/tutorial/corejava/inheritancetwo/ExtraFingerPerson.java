package com.h2kinfosys.tutorial.corejava.inheritancetwo;

public class ExtraFingerPerson extends Person {
	private boolean isLuckly = true;

	public ExtraFingerPerson(String name, int height , int ssn) {
		super(name, height, ssn);
	}
	public boolean isLuckly() {
		return isLuckly;
	}

	public void setLuckly(boolean isLuckly) {
		this.isLuckly = isLuckly;
	}
	
	@Override
	public void numberOfFingers(){
		System.out.println(super.getName() + " has 21 Fingers");
	}
	
	public void goodHandwriting(){
		System.out.println(super.getName() + " has bad Handwriting...");
	}
}
