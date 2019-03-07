package com.lambdastream;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author Rishi
 * Stream example to sort in reverse order
 */
public class StreamReverseSort {
	
	public static void main (String[]args) {
		
		List<Integer> myList = new LinkedList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(5);
		myList.add(3);
		myList.add(7);
		myList.add(8);
		myList.add(2);
		myList.add(0);
		myList.add(1);
		
		List<Integer> sortedList = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList);
	}

}
