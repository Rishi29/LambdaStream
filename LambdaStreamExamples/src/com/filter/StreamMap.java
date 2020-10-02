package com.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMap {
	
	public static void main(String[]args) {
		
		
		List<String> myList = Arrays.asList("apple","orange", "grapes","lemon");
		changeToUpperCase(myList);
	}

	private static void changeToUpperCase(List<String> myList) {
		
		Stream<String> streamStr = myList.stream().map(p->p.toUpperCase());
		
		streamStr.forEach(System.out::println);
		
	}
	
}
