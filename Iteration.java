package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Iteration {
	    /**
	    * Method to print list of numbers
	   */
	public static void printNumbers() {
		List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //Traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
        
		MyConsumer consumer = new MyConsumer();
		myList.forEach(consumer);

		// method 3 traversing with anonymous consumer interface
		myList.forEach(new Consumer<Integer>() {

		@Override
		public void accept(Integer t) {
		System.out.println("Method 3: forEach anonymous class value : " + t);
			}
		});

		// method4: explicit lambda function
		Consumer<Integer> consumer1 = t -> {
			System.out.println("Method 4: forEach Lambda impl value " + t);
		};
		myList.forEach(consumer1);

		// method 5:implicit lambda function
		myList.forEach(t -> {
			System.out.println("Method 5: forEach lambda imple value " + t);
		});
		
		// method 6: implicit lambda function to print double values
		Function<Integer, Double> doubleFunction = Integer::doubleValue;
		myList.forEach(n -> {
		System.out.println("Method 5: forEach lambda double value :: " + doubleFunction.apply(n));
		});

		// method 7: Implicit lambda function to print even no
		Predicate<Integer> isEvenFunction = n -> n % 2 == 0;
		myList.forEach(n -> {
		System.out.println("Method 5: forEach value of: " + n + " check for even: " + isEvenFunction.test(n));
		});

	}
}
