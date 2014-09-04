package com.h2kinfosys.tutorial.corejava.inheritancetwo;

public class InheritanceTest {

	public static void main(String[] args) {
		/*Person per = new Person();
		per.setName("Jayram");
		System.out.println(per.getName());*/
		
		/*ShortPerson sp = new ShortPerson("Raj", 4, 23456);
		System.out.println(sp.getName());
		sp.numberOfLegs();
		sp.numberOfFingers();
		
		LongPerson lp = new LongPerson("Sukhraj",7, 33333);
		lp.setLooksDangerous(false);
		
		System.out.println(lp.isLooksDangerous());
		lp.numberOfLegs();
		lp.numberOfFingers();
		
		ExtraFingerPerson ep = new ExtraFingerPerson("Amudha",5, 34343);
		ep.numberOfLegs();
		ep.numberOfFingers();
		System.out.println(ep.isLuckly());*/
		
		
		Person per = new ExtraFingerPerson("Nikhil",5, 7777);
		per.numberOfFingers();
//		per.goodHandwriting();
		per = new LongPerson("Sukhraj",7, 33333);
		per.numberOfFingers();
	}
}
