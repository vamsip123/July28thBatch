package com.h2kinfosys.tutorial.corejava.array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int heightAge[][] = new int[3][3];
		
		heightAge[0][0] = 0;
		heightAge[0][1] = 1;
		heightAge[0][2] = 2;
		
		heightAge[1][0] = 3;
		heightAge[1][1] = 4;
		heightAge[1][2] = 5;
		
		heightAge[2][0] = 6;
		heightAge[2][1] = 7;
		heightAge[2][2] = 8;
		
//		System.out.println(heightAge[1][2]);
		
		for(int heAg[] : heightAge) {
			for(int ha : heAg) {
				System.out.println(ha);
			}
		}
		
	}

}
