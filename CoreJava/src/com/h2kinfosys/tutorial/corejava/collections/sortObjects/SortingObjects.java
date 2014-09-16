package com.h2kinfosys.tutorial.corejava.collections.sortObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class SortingObjects {

public static List getPersons(){
	List<Person> list = new ArrayList<Person>();
	
	list.add(new Person("A","Andaman","Army")); //0
	list.add(new Person("C","Camaron","Worker")); // 1
	list.add(new Person("B","Mass","Cook")); // 2
	list.add(new Person("D","Bombay","Army")); // 3
//	list.add(3, paramE);
	return list;
}

	public static void main(String[] args) {
		
		List list = getPersons();
		System.out.println(list);

//		Collections.sort(list);
		
	// If you want to have a thread Safe collection use Vector.
//		Vector vec = new Vector();
//		vec.add(paramE);
		
		Collections.sort(list, new ProfSort());
		Collections.synchronizedList(list);
		
		System.out.println(list);
		
		/*for(Object per : list){
			System.out.println((Person)per);
		}
		
		System.out.println(list);
		
		System.out.println("================");
		
		Collections.sort(list, new ProfSort());
		
		for(Object per : list){
			System.out.println((Person)per);
		}*/
//		System.out.println(list);
	}
}