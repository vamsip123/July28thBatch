package com.tutorial.spring;

public class CarCompany implements Company {

	public CarCompany(){
		System.out.println("CarCompany.CarCompany()");
	}
	@Override
	public int strength() {
		return 200;
	}

	@Override
	public String logoName() {
		return "We are CarCompany";
	}

}
