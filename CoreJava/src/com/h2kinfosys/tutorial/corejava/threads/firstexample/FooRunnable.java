package com.h2kinfosys.tutorial.corejava.threads.firstexample;

//class FooRunnable extends Thread {
class FooRunnable implements Runnable {
	
	@Override
	public synchronized void run() {
		for (int x = 1; x < 5; x++) {
			System.out.println("Printing " + x + " Name : "
					+ Thread.currentThread().getName() +" State : " + Thread.currentThread().getState() );
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
	}
}

// to inherit parent
// make this class to participate in thread