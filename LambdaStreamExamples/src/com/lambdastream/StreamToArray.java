package com.lambdastream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Rishi
 * convert Stream to array
 */
public class StreamToArray {
	
	public static void main (String[]args) {
		
		
		Stream<Integer> intStream = Stream.of(1,2,3,4,5);
		Integer[] intArray = intStream.toArray(Integer[]::new);
		System.out.println(Arrays.toString(intArray));
	}

}
