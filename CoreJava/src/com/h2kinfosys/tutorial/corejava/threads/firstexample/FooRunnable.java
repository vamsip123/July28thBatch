package com.h2kinfosys.tutorial.corejava.threads.firstexample;

class FooRunnable extends Thread {
	
	@Override
	public void run() {
		loop();
	}
	
	public synchronized void loop(){
		for (int x = 1; x < 5; x++) {
			System.out.println("Printing " + x + " Name : "
					+ Thread.currentThread().getName());
		}
	}
}