package com.h2kinfosys.tutorial.corejava.collections;

import java.util.ArrayList;
import java.util.List;

import com.h2kinfosys.tutorial.corejava.io.Person;

public class CollectionExample {
	public static void addMarksList(List<Integer> list) {
		int finalValue = 0;
		for(int i = 0 ; i < list.size() ; i++) {
			finalValue += (Integer)list.get(i);
		}	
		System.out.println("Final Value = "+ finalValue);
	}
	
	public static void main(String[] args) {
		Object [] obj = new Object[10];
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.get(10));
		
//		list.add("Jay");
		
		/*int finalValue = 0;
		for(int i = 0 ; i < list.size() ; i++) {
			finalValue += (Integer)list.get(i);
		}	
		System.out.println("Final Value = "+ finalValue);*/
		
		addMarksList(list);

		/*int i[] = new int[10];
		i[0] = 45;
		i[3] = 44;
		i[5] = 3;
		
//		i[6] = 56;
		Person p = new Person();
//		System.out.println(p);
		
		List list = new ArrayList(10);
//		list.add(1);
//		list.add(new Integer(2));
		list.add("H2k");
		list.add(p);
		
		System.out.println(list);
		System.out.println("Size =" + list.size());
		
		for(int j = 0 ; j < list.size() ; j ++) {
			Object myObj = list.get(j);
			if(myObj instanceof Integer) {
				Integer intWrapper = (Integer)myObj;
				System.out.println(intWrapper.intValue());
			} else if(myObj instanceof String){
				String myString = (String)myObj;
				System.out.println(myString.toLowerCase());
			}else if (myObj instanceof Person){
				Person myPerson = (Person)myObj;
				myPerson.getProfession();
			} 
		}*/
	}
}
