/**
 * 
 */
package com.tutorial.spring.aop_04.account;

/**
 * @author Jayram
 *
 */
public class NormalClientOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Account account = new Account();
		account.withdraw(50,"client");
	}

}
