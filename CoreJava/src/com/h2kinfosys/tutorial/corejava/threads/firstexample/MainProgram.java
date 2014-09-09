package com.h2kinfosys.tutorial.corejava.threads.firstexample;

public class MainProgram {

	public static void main(String[] args) {

		System.out.println("Running Main Thread..."
				+ Thread.currentThread().getName());

		/*
		 * for (int x = 0; x < 3; x++) { System.out.println("Printing " + x +
		 * " Name : " + Thread.currentThread().getName()); try {
		 * Thread.sleep(2000); } catch (InterruptedException e) {
		 * e.printStackTrace(); } }
		 */

		System.out.println("Running Main Thread..."
				+ Thread.currentThread().getName());

		FooRunnable sprintRunner1 = new FooRunnable();
//		sprintRunner1.start();
		
		Thread thread1 = new Thread(sprintRunner1);
		thread1.start();

		/*FooRunnable sprintRunner3 = new FooRunnable();
		sprintRunner3.start();
*/
		
		FooRunnable sprintRunner = new FooRunnable();
		Thread bhupinder = new Thread(sprintRunner);
		bhupinder.setName("Bhupinder");

//		Thread amudha = new Thread(sprintRunner);
//		amudha.setName("Amudha");
//
//		Thread harpreet = new Thread(sprintRunner);
//		harpreet.setName("Harpreet");

		bhupinder.start();
//		amudha.start();
//		harpreet.start();
		bhupinder.getState();
		
		System.out.println(bhupinder.isAlive());
		
		/*System.out.println("Going to sleep");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		bhupinder.start();*/
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(bhupinder.isAlive());
	}
}