package com.streamfundamentals;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Examples 
 **/
public class CreatingStream {
	
	public static void main(String[]args) {
		
		System.out.println("creating stream of number");
		Stream<Integer> streamNum = Stream.of(1,2,3,4);
		streamNum.forEach(y->System.out.print(y));
		
		System.out.println();
		
		//creating stream using array
		// we cannot use primitive type while creating stream
		System.out.println("creating stream using array");
		Stream<Integer> streamArr = Stream.of(new Integer[] {1,2,3,4,5});
		streamArr.forEach(System.out::print);
		
		System.out.println();
		
		
		//Creating sequential Stream and parallelStream from List
		System.out.println("Creating sequential Stream  from List");
		
		List<Integer> myList = new ArrayList<>();
		for(int i= 1; i<10; i++) {myList.add(i);}
		
		Stream<Integer> sequentialStream = myList.stream();
		sequentialStream.forEach(System.out::print);
		
		System.out.println();
		
		
		
		//creating parallel stream.
		System.out.println("creating parallel stream.");
		
		Stream<Integer>  parallelStream = myList.parallelStream();
		parallelStream.forEach(System.out::print);
		
		
		
	}

}
