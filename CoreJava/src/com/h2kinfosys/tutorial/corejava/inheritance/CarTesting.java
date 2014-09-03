package com.h2kinfosys.tutorial.corejava.inheritance;

public class CarTesting {

	public static void main(String[] args) {
		Car bmw = new BMW();
		bmw.setCarName("BMW");
		bmw.mileage();
		bmw.commonFeature();
		
		Car honda = new HondaCRV();
		honda.setCarName("HOnda CRV");
		honda.mileage();
		honda.commonFeature();
		
		Car kia = new Kia();
		kia.setCarName("Kia");
		kia.mileage();
		kia.commonFeature();
		
//		System.out.println(kia.horsePower);
		
		System.out.println("TO String == "+kia);
	}
}