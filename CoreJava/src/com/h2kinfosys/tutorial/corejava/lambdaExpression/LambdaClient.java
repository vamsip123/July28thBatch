package com.h2kinfosys.tutorial.corejava.lambdaExpression;

public class LambdaClient {

	public static void main(String[] args) {
		
		WorkerInterface wi = new ITWorker();
		wi.working();
		
		WorkerInterface wi2 = new ITWorker(){
			@Override
			public void working() {
				System.out.println("I am worker....");
			}
		};
		wi2.working();
		
		
		WorkerInterface wi3 = () ->
		{
			System.out.println("I am worker for lambda Expression....");
			System.out.println("I am worker for lambda Expression2....");
		};
				
		wi3.working();// This needed
		
		Calculate calc  = new Add();
		System.out.println(calc.calc(2,3));
		
		Calculate nikhilSub  = (a,b) -> a-b;
		System.out.println(nikhilSub.calc(5,3));
	}
}