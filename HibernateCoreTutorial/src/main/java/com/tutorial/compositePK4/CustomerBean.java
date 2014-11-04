package com.tutorial.compositePK4;

public class CustomerBean {

	private CompKey key; // 2
	private float amount; //1 

	public void setKey(CompKey key) {
		this.key = key;
	}

	public CompKey getKey() {
		return this.key;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getAmount() {
		return this.amount;
	}

}
