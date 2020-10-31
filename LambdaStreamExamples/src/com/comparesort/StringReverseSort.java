package com.comparesort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverseSort {

	public static void main(String[] args) {

		List<String> student = Arrays.asList("Maya", "Mike", "David", "Joseph", "Jasmine");
		sortStudent(student);
		reverseSortStudent(student);

	}

	private static void sortStudent(List<String> student) {
		List<String> sortedStudent = student.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedStudent);

	}

	private static void reverseSortStudent(List<String> student) {
		List<String> reversedSortedStudent = student.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(reversedSortedStudent);

	}

}
