package com.h2kinfosys.tutorial.corejava.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.h2kinfosys.tutorial.corejava.collections.sortObjects.Person;

public class MapTestThree {

	public static void main(String[] args) {
		
		Person per1 = new Person("Jay","pune","Sw");
		Person per2 = new Person("Jay2","Hyd","db");
		List<Person> personList = new ArrayList<Person>();
		personList.add(per1);
		personList.add(per2);
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(0);
		intList.add(2);
		intList.add(10);
		//..
		intList.add(1000000);
		
		for(int i = 0 ; i < intList.size() ; i++) {
			if(intList.get(i) == 9999999) {
				System.out.println("Value present");
			}
		}
		
//		System.out.println(personList);
		
		
		Fruit apple = new Fruit("Apple","10");
		Fruit orange = new Fruit("Orange","11");
		List<Fruit> fruitList = new ArrayList<Fruit>();
		
//		Map objectMap = new HashMap();
		/*objectMap.put("person", personList);
		objectMap.put("fruitList", fruitList);*/
		
//		System.out.println(objectMap.get("person")); // 500
		
//		objectMap.get("Apple"); // 500
		
		Map objectMap = new Hashtable();
		
		
		objectMap.put("one", "HELLO");
		objectMap.put("one", "Hello Two");
		objectMap.put("two", "TWO");
		objectMap.put("three", "THREE");
		
		objectMap.put("five", "FIVE"); // 6000
		objectMap.put("seven", "Seven Hill"); // 6000
		
		objectMap.put(null, null);
		
		System.out.println(objectMap.get("one"));
		
		//Person
		
		/*List<Person> personList1 = (List<Person>)objectMap.get("personList");
		
		for(Person per : personList1){
			per.getAge();
		}*/
				
//		System.out.println(objectMap.get("personList"));
		
		Iterator iter = objectMap.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry mapEntry = (Map.Entry)iter.next();
			System.out.println(mapEntry.getKey() +"  Value = "+ mapEntry.getValue());
		}
		
		/*for(Object entry : objectMap.entrySet()){
			Map.Entry mapEntry = (Map.Entry)entry;
			System.out.println(mapEntry.getKey() +"  Value = "+ mapEntry.getValue());
		}
		
		System.out.println(objectMap.entrySet());
		System.out.println(objectMap.keySet());*/
		
		/*System.out.println(map.get("two"));
		System.out.println(map.get("three"));
		*/
		
		/*String name = new String("Jayram");
		String name2 = new String("Jayram");
		System.out.println(name.equals(name2));*/
		
//		System.out.println(map);
		
		/*Iterator iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry mapEntry = (Map.Entry)iter.next();
			System.out.println(mapEntry.getKey() +"  Value = "+ mapEntry.getValue());
		}*/
		
		/*for(Object entry : map.entrySet()){
			Map.Entry mapEntry = (Map.Entry)entry;
			System.out.println(mapEntry.getKey() +"  Value = "+ mapEntry.getValue());
		}*/
	}
}