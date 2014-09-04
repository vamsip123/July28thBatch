package com.h2kinfosys.tutorial.corejava.exception;

public class CheckUncheckedException {

	public static void main(String[] args) {//throws MyOwnException , ImportantCalcException {
		int i = 10;
		int finalValue = i + divide(3,2);
		
		/*try {
			importantDivision(2,0);
		} catch (MyOwnException e) {
			e.printStackTrace();
			throw new MyOwnException(" Not proper");
		}*/
		try {
			importantDivision(2,0);
		} catch (MyOwnException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		try {
			importantCalcuation(3,4);
		} catch (ImportantCalcException e) {
			e.printStackTrace();
		}
		
	}
	
	public static int divide(int i , int j){
		return i/j;
	}
	
	public static int importantDivision(int i , int j) throws MyOwnException {
		return i/j;
	}
	public static int importantCalcuation(int i , int j) throws ImportantCalcException {
		return i/j;
	}

}
