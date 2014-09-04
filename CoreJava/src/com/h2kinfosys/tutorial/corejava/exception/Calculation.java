package com.h2kinfosys.tutorial.corejava.exception;

public class Calculation {

	public static void main(String[] args) throws MyOwnException {
		// input 1 2 3 4
		// 12 , 10 , 4 , 6
		// add 1 n 2
		// divide 3 n 4
		// then add the number;

		// First ad
		System.out.println("I am here...one");
		int addition = add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println("I am here...two");
		
		int myvalue = 12/0;
		if(true){
			throw new MyOwnException("");
		}
		
		int division = 0;
		try {
			division = divide(Integer.parseInt(args[2]),
					Integer.parseInt(args[3])); // (Integer.parseInt(args[2])/
												// Integer.parseInt(args[3]));
												// //
												// divide(Integer.parseInt(args[2]),Integer.parseInt(args[3]));
		} catch (ArithmeticException e) {
			e.printStackTrace();
			division = 5;
			/*try {
				division = 5 / Integer.parseInt(args[4]);
			} catch (Exception e2) {
				division = 3;
			}*/
		} catch (NumberFormatException e) {
//			e.printStackTrace();
			division = 7;
			throw new MyOwnException(args[3]);
		} catch (Exception e) {
			division = 2;
		} finally {
			division = 100;
		}

		try {

		} catch (Exception e) {
			
		}finally{
			
		}

		
		try{
			
		}finally {
			
		}
		
		
		int i[] = { 3, 4, 5, 6, 7 };

		int arrayValue = 0;
		/*try {
			arrayValue = i[division];
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}*/

		System.out.println("i[0]  " + arrayValue);

		System.out.println("I am here...three");
		System.out.println((addition + division + arrayValue));

		float finalValue = (addition + division + arrayValue);
		System.out.println("Calculate my tax....");
		calculateTax(finalValue);
	}

	public static void calculateTax(float valueToCalcuate) {
		System.out.println("Tax I have to pay is " + (valueToCalcuate + 100));
	}

	public static int add(int i, int j) {
		return i + j;
	}

	public static int divide(int i, int j) {
		return i / j;
	}

	public void processRecord() {
		int empId[] = { 12, 13, 14, 0, 16, 17 };
		for (int empI : empId) {
			try {
				System.out.println(10 / empI);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
	}
}