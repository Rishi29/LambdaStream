package com.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
	
	public static void main(String[]args) {
		
		Integer arr[] = {1,2,3,4,5};
		
		List<Integer>myList = Arrays.asList(arr);
		Optional<Integer> intOptional = myList.stream().reduce((i,j)->{return i*j;});
		if(intOptional.isPresent())
			System.out.println("Multiplication result "+ intOptional.get());
	}

}
