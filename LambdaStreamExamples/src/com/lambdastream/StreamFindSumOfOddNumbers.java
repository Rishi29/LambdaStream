package com.lambdastream;

import java.util.Arrays;

public class StreamFindSumOfOddNumbers {
		
	
	
	
	public static void main(String[]args) {
		
		
	int arr[] = {1,2,3,2,4,5,7,9,6};
	int sumOfOddNumber = Arrays.stream(arr).filter(n -> n%2!=0).sum();
	
	System.out.println("Sum of Odd Numbers "+ sumOfOddNumber);
	}
	
	
}
