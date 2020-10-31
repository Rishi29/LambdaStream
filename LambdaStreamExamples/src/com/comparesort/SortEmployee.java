package com.comparesort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployee {

	public static void main(String[] args) {

		List<Employee> emp = Arrays.asList(new Employee(2, "Devi"), new Employee(1, "David"), new Employee(4, "Dasu"),
				new Employee(3, "Dimpy"));

		sortByName(emp);
		reverseSortByName(emp);

	}

	private static void sortByName(List<Employee> emp) {
		List<Employee> sortedEmpList = emp.stream().sorted((x, y) -> x.getName().compareTo(y.getName()))
				.collect(Collectors.toList());

		System.out.println(sortedEmpList.toString());

	}

	private static void reverseSortByName(List<Employee> emp) {

		List<Employee> reverseSortByName = emp.stream().sorted((x, y) -> y.getName().compareTo(x.getName()))
				.collect(Collectors.toList());
		System.out.println(reverseSortByName);

	}

}
