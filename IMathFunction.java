package com.lambdaexpression;

@FunctionalInterface
public interface IMathFunction {
	int calculate(int a,int b);
	
	/**
	 * 
	 * @param a it is the first operand a=20
	 * @param b it is the second operand b=10
	 * @param function particular operation like addition,multiplication,division
	 * @param obj object created for specific operation
	 */
	
	static void printResult(int a, int b, String function, IMathFunction obj) {
		System.out.println("Result of " + function + " is : " + obj.calculate(a, b));
	}
}
