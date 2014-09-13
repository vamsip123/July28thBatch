package com.h2kinfosys.tutorial.corejava.lambdaExpression;

@FunctionalInterface
public interface Calculate {
	int calc(int a, int b);
}

/*class Add implements Calculate{
	int calc(int a, int b){
		return a+b;
	}
}

class Substract implements Calculate{
	int calc(int a, int b){
		return a-b;
	}
}*/