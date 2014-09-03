package com.h2kinfosys.tutorial.corejava.inheritance;

enum SteringSize {
	BIG,SMALL,MEDIUM;
}

public class Car {
	// State
	private String carName;
	private int numberOfWheels =4;
	private int steringSize;
	private String headLightType; // Halozen , Basic
	private String model;
	
	public int horsePower;
	
	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}	
	
	// Behavior
	public void mileage(){
		System.out.println( carName + " Gives 20 Miles / Galon");
	}
	
	final void commonFeature() {
		System.out.println(carName + " have seat Belts , Front WindSheild, Gears");
	}
}
