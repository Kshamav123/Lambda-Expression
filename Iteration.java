package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
	}
}
