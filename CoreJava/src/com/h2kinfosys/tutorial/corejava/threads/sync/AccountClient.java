package com.h2kinfosys.tutorial.corejava.threads.sync;

public class AccountClient {
	public static void main(String[] args) {
		AccountHolderCard r = new AccountHolderCard();
		
		Thread king = new Thread(r);
		king.setName("King");
		king.start();
		
		Thread queen = new Thread(r);
		queen.setName("Queen");
		queen.start();
	}
}