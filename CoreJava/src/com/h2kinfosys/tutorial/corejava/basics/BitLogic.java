package com.h2kinfosys.tutorial.corejava.basics;
class BitLogic {
	public static void main(String args[]) {
		/*String name = "Jayram";
		String names[] = {"Jayram","Raj"};
		
		System.out.println("BitLogic.main()   " + names[1]);
		
		System.out.println("name = " + name);*/
		String binary[] = {
				"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
		};
		
		int a = 3; // 0 + 2 + 1 or 0011 in binary
		int b = 6; // 4 + 2 + 0 or 0110 in binary
		int c = a | b;
		System.out.println("BitLogic.main()" + c);
		
//		int d = a & b;
//		int e = a ^ b;
//		int f = (~a & b) | (a & ~b);
//		int g = ~a & 0x0f;
//		System.out.println(" a = " + binary[a]);
//		
//		System.out.println(" b = " + binary[b]);
//		System.out.println(" a|b = " + binary[c]);
//		System.out.println(" a&b = " + binary[d]);
//		System.out.println(" a^b = " + binary[e]);
//		System.out.println("~a&b|a&~b = " + binary[f]);
//		System.out.println(" ~a = " + binary[g] + "  "+ g);
//		System.out.println((0x0f));
	}
}
