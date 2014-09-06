package com.h2kinfosys.tutorial.corejava.threads.sync;

class Account {
	private int balance = 50;
	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount) {
		balance = balance - amount;
	}
}