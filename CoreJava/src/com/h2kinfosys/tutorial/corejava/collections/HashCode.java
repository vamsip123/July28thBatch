package com.h2kinfosys.tutorial.corejava.collections;

public class HashCode {

	public static void main(String[] args) {
		HashCode code = new HashCode();
		HashCode code2 = new HashCode();
		
		System.out.println(code.hashCode());
		System.out.println(code2.hashCode());
		
		
		String one = new String("ONE");
		String two = new String("ONE");
		
		System.out.println(one.equals(two));
	}
}