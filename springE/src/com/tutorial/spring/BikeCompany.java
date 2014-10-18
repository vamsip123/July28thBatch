package com.tutorial.spring;

public class BikeCompany implements Company {

	public BikeCompany(){
		System.out.println("BikeCompany.BikeCompany()");
	}
	
	@Override
	public int strength() {
		return 100;
	}

	@Override
	public String logoName() {
		return "We are BikeCompany";
	}
}