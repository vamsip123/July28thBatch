package com.h2kinfosys.tutorial.corejava.loop;

public class DoWhile {
	
	public static void main(String[] args) {
		String binary[] = {
				"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
		};
		System.out.println(binary.length);
		
		int i = 0;
		int index = 0 ;
		/*while (i < binary.length) {
			System.out.println(i +"   "+  binary[i]  + " " + (index++));
			i++;
		}*/
		
		do {
			System.out.println(i +"   "+  binary[i] );
			i++;
		} while (i < binary.length);
		
	}
}