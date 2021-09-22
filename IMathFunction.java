package com.lambdaexpression;

@FunctionalInterface
public interface IMathFunction {
	int calculate(int a,int b);
	
	static void printResult(int a, int b, String function, IMathFunction obj) {
		System.out.println("Result of " + function + " is : " + obj.calculate(a, b));
	}
}
