package com.lambdastream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rishi using map to increase each number in the arraylist by the given
 *         number
 */
public class StreamUsingMap {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(2);
		myList.add(4);
		myList.add(1);
		myList.add(5);
		myList.add(6);
		myList.add(10);

		addGivenValueToEachNumber(myList, 5);

	}

	private static void addGivenValueToEachNumber(ArrayList<Integer> myList, int i) {

		List<Integer> newList = myList.stream().map(n -> n + i).collect(Collectors.toList());

		System.out.println(newList);

	}

}
