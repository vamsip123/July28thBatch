package com.h2kinfosys.tutorial.corejava.threads.producerconsumer;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		Basket basket = new Basket();
		Producer p1 = new Producer(basket, 1);
		Consumer c1 = new Consumer(basket, 1);
		p1.start();
		c1.start();
	}
}