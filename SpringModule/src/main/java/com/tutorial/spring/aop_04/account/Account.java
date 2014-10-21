/**
 * 
 */
package com.tutorial.spring.aop_04.account;

/**
 * @author Jayram
 *
 */
public class Account {
	long currentAmount = 100;
	String name;
	public long deposit(long depositAmount) {
		currentAmount += depositAmount;
		return currentAmount;
	}

	public void callMeAround(long depositAmount){
		System.out.println("I m logging something...1 ");
		System.out.println("I m logging something... 2 ");
		System.out.println("I m logging something... 3" + depositAmount);
	}
	
	public void callMeDuringException(){
		
	}
	
	public void callMeBefore(long depositAmount){
		System.out.println("I m logging something...1 ");
		System.out.println("I m logging something... 2 ");
		System.out.println("I m logging something... 3" + depositAmount);
//		con.open();
	}
	public void callMeAfter(long currentAmount){
		System.out.println("I m logging something...1 ");
		System.out.println("I m logging something... 2 ");
		System.out.println("I m logging something... 3" + currentAmount);
		System.out.println("I m logging something... 4 ");
//		con.close();
	}
//	System.out.println("I m logging something...");
	public long withdraw(long withdrawalAmount,String name) {
		this.name = name;
		String user = getUser();
		System.out.println("I m logging something..."); // JOIN POINT // POINT CUT
		
        if (user.equals("BankAdmin")){
//        	con.open();
        // JOIN POINT
        	
        	if (withdrawalAmount <= currentAmount) {
    			currentAmount -= withdrawalAmount;
        	}
        	
        	//con.commit();
        	
        }
        System.out.println("Ia m loggin again...");
		return currentAmount;
	}
	//System.out.println("I m logging something..."); 
      public String getUser(){
    	 return name;
      }
}
