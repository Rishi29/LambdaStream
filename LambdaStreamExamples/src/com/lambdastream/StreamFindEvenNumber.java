package com.lambdastream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rishi
 * Demo to find List of even number using stream from given arrayList
 */
public class StreamFindEvenNumber {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(2);
		myList.add(4);
		myList.add(1);
		myList.add(5);
		myList.add(6);
		myList.add(10);

		findEvenNumber(myList);

	}

	/**
	 * created Stream, applied filter to find out even number finally used collect
	 * to convert stream to List.
	 */
	private static void findEvenNumber(ArrayList<Integer> myList) {

		List<Integer> newList = myList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("List With even number " + newList);

	}

}
