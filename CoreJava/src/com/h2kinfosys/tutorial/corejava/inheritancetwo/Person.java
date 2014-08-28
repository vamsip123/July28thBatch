package com.h2kinfosys.tutorial.corejava.inheritancetwo;

/**
 * 
 * @author Jayram
 *
 */
public class Person {
	private int height;
	private String name;
	private int ssn;
	
	public Person(String name, int height , int ssn) {
		this.name = name;
		this.height = height;
		this.ssn = ssn;
	}
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public void numberOfFingers(){
		System.out.println(name + " has 20 Fingers");
	}
	
	public void numberOfLegs(){
		System.out.println(name +" has 2 Legs");
	}
	
}
