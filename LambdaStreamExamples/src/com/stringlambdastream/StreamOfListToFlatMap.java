package com.stringlambdastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOfListToFlatMap {

	public static void main(String[] args) {

		Stream<List<String>> myStreamList = Stream.of(Arrays.asList("Rishi"), 
													  Arrays.asList("Ram", "Shyam"),
													  Arrays.asList("David", "Rose"), 
													  Arrays.asList("Michael", "Jack"));

		convertStreamOfListToFlatStream(myStreamList);

	}

	private static void convertStreamOfListToFlatStream(Stream<List<String>> myStreamList) {
		Stream<String> myFlatStream = myStreamList.flatMap(strList -> strList.stream());

		myFlatStream.forEach(System.out::println);

	}

}
