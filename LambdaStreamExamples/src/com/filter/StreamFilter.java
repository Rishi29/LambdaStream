package com.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
	
	public static void main(String[]args) {
		
		List<Integer> myList = Arrays.asList(1,2,4,3,5,6,8,2,9,23,45,23);
		
		findNumberHigherThan(myList, 9);
		
		
		 
	}

	private static void findNumberHigherThan(List<Integer> myList, int i) {
		
		List<Integer>filteredList = myList.stream().filter(p->p>i).collect(Collectors.toList());
		System.out.println(" numbers greater than "+ i+" " + filteredList.toString());
	}

}
