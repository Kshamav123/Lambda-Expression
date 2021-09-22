package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

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
		System.out.println("Method5: forEach lambda imple value " + t);
	});

}
}
