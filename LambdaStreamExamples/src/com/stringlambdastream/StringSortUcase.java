package com.stringlambdastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSortUcase {

	public static void main(String[] args) {

		List<String> myList = Arrays.asList("c", "r", "q", "a", "b", "n", "d");

		// convert to stream, then to upper case then back to List and print it
		toUpperCaseList(myList);

		// convert to Stream , then to UpperCase and then print it
		myList.stream().map(String::toUpperCase).sorted().forEach(System.out::print);

	}

	private static void toUpperCaseList(List<String> myList) {

		List<String> myNewList = myList.stream().map(String::toUpperCase).sorted().collect(Collectors.toList());

		System.out.println(myNewList);

	}

}
