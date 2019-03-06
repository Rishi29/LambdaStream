package com.lambdastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rishi
 * 
 * Sort using Stream
 *
 */
public class StreamSort {

	public static void main(String[] args) {

		Integer arr[] = { 1, 4, 3, 5, 6, 2, 7, 9, 8, 5 };
		List<Integer> newList = Arrays.asList(arr);

		List<Integer> sortedList = newList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted array " + sortedList.toString());
	}

}
