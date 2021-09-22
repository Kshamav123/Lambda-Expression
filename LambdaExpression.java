package com.lambdaexpression;

public class LambdaExpression {
	public static void main(String[] args) {

		int a=0 ;
		int b=0 ;

		IMathFunction add = (x, y) -> x + y;
		IMathFunction mul = (x, y) -> x * y;
		IMathFunction div = (x, y) -> x / y;

		IMathFunction.printResult(20, 10, "addition", add);
		IMathFunction.printResult(20, 10, "multiplication", mul);
		IMathFunction.printResult(20, 10, "division", div);
		
		Iteration.printNumbers();
	}
	
}
