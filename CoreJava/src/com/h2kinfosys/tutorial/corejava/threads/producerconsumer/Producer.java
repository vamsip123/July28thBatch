package com.h2kinfosys.tutorial.corejava.threads.producerconsumer;

class Producer extends Thread {
	private Basket basket;
	private int number;

	public Producer(Basket c, int number) {
		basket = c;
		this.number = number;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			basket.put(i);
			System.out.println("Producer #" + this.number + " put: " + i);
			try {
				sleep(2000);
//				sleep((int)(Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}
