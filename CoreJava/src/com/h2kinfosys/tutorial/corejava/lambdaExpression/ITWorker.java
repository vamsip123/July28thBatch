package com.h2kinfosys.tutorial.corejava.lambdaExpression;

public class ITWorker implements WorkerInterface {

	@Override
	public void working() {
		System.out.println("I am a default Implementation");
		System.out.println("I am a default Implementation2");
		System.out.println("I am a default Implementation3");
	}
}