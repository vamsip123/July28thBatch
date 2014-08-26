package com.h2kinfosys.tutorial.corejava.classes;

public class Calculation {
	int additionValue = 0;
	
	public void add(int i , int j){
		additionValue = (i+j);
		System.out.println("Addition of both #'s is ="+(i+j));
	}
	
	public int returnAddition(int i , int j){
		return (i+j);
	}
	
	
	/*public void add(float i , float j){
		System.out.println("Addition of both #'s is ="+(i+j));
	}*/
	
	public static void main(String[] args) {
		Calculation calc = new Calculation();
		int finalValue = 5+ calc.returnAddition(12, 3) + calc.returnAddition(10, 3);
		
		System.out.println("Final Value = "+ finalValue);
		
//		int i = calc.add(12, 3); // Type mismatch: cannot convert from void to int
		
//		calc.add(12.3f, 3.5f);
		
	}
}