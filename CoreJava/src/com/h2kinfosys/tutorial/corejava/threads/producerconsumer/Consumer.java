package com.h2kinfosys.tutorial.corejava.threads.producerconsumer;

class Consumer extends Thread {
	private Basket basket;
	private int number;

	public Consumer(Basket c, int number) {
		basket = c;
		this.number = number;
	}

	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = basket.get();
			System.out.println("Consumer #" + this.number + " got: " + value);
		}
	}
}
