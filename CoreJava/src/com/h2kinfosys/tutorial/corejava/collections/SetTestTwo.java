package com.h2kinfosys.tutorial.corejava.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTestTwo {

	public static void main(String[] args) {
		treeSet();
//		arrayListToTreeSet();
//		hashSset();
	}
	
	public static void  hashSset(){
		Set hashSet = new HashSet();
		hashSet.add("Apple");
		hashSet.add("Apple");
		hashSet.add("Orange");
		hashSet.add("Banana");
		System.out.println(hashSet);
	}
	
	public static void treeSet(){
		Set treeSet = new TreeSet();
		treeSet.add("Apple");
		treeSet.add("Apple");
		treeSet.add("Orange");
		treeSet.add("Banana");
		
		System.out.println(treeSet);
	}
	
	public static List getListOfFruits(){
		ArrayList list =  new ArrayList();
		list.add("12121");
		list.add("Apple");
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");
		return list;
	}
	
	public static void arrayListToTreeSet(){
		List fruitList = getListOfFruits();
		
		Set hashSet = new HashSet(fruitList);
		
		Set treeSet = new TreeSet(fruitList);
		
//		System.out.println(list);
		System.out.println(hashSet);
		System.out.println(treeSet);
		
		//so if I have a file of 500MB text file, 
		//how do you propose I save each line and look for duplicate values?

	}
}
