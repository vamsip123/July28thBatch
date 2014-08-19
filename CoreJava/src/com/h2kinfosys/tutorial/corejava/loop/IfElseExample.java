package com.h2kinfosys.tutorial.corejava.loop;

public class IfElseExample {

	public static void main(String[] args) {
		
		int i = Integer.parseInt(args[0]);
		
		if(i == 1) {
			System.out.println("ONE");
		}else if(i == 2) {
			System.out.println("TWO");
		}else if(i == 3) {
			System.out.println("THREE");
		}else {
			System.out.println("SOMETHING ELSE");
		}

	}
}
