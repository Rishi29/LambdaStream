package com.stringlambdastream;

import java.util.Arrays;
import java.util.List;

public class StringMapToInt {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a1", "b3", "f4", "d2");
		stringMapToInt(myList);
	}
	// extract number form string and sort it 
	private static void stringMapToInt(List<String> myList) {

		myList.stream().map(s -> s.substring(1)).mapToInt(Integer::parseInt).sorted().forEach(System.out::println);
	}

}
