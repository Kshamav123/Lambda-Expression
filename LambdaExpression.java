package com.lambdaexpression;

public class LambdaExpression {
	public static void main(String[] args) {

		int a = 20;
		int b = 10;

		IMathFunction add = (x, y) -> x + y;
		IMathFunction mul = (x, y) -> x * y;
		IMathFunction div = (x, y) -> x / y;
		System.out.println("Addition- " + add.calculate(a, b));
		System.out.println("Multiplication- " + mul.calculate(a, b));
		System.out.println("Division- " + div.calculate(a, b));
	}
}
