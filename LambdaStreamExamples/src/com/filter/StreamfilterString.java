package com.filter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamfilterString {
	
	public static void main(String[]args) {
		
		List<String> student = Arrays.asList("Mridul","Harry","Maya","Deepa","Rohit","Muna");
		filterAndsort(student);
		
	}

	private static void filterAndsort(List<String> student) {
		List<String>filteredList = student.stream().filter(name->name.charAt(0)=='M').map(x->x.toUpperCase())
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(filteredList.toString());
		
	}

}
