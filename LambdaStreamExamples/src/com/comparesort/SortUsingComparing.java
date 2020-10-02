package com.comparesort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Sort using Comparing
public class SortUsingComparing {

	public static void main(String[] String) {

		List<Employee> emp = Arrays.asList(new Employee(1, "Dipesh"), new Employee(3, "David"), new Employee(2, "Dev"),
				new Employee(4, "Dimpy"));

		// sortEmployee(emp);
		// reverseSortEmployee(emp);

		// sortEmployeeI(emp);

		reverseSortEmployeeII(emp);

	}

	private static void reverseSortEmployeeII(List<Employee> emp) {

		Comparator<Employee> empComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());

		List<Employee> reversedEmp = emp.stream().sorted(empComparator.reversed()).collect(Collectors.toList());
		System.out.println(reversedEmp);

	}

	private static void sortEmployeeI(List<Employee> emp) {
		Comparator<Employee> empComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());

		List<Employee> sortedEmployeeI = emp.stream().sorted(empComparator).collect(Collectors.toList());
		System.out.println(sortedEmployeeI);

	}

	private static void sortEmployee(List<Employee> emp) {

		List<Employee> sortedList = emp.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		System.out.println(sortedList.toString());
	}

	private static void reverseSortEmployee(List<Employee> emp) {

		List<Employee> reversedSortedList = emp.stream().sorted(Comparator.comparing(Employee::getName).reversed())
				.collect(Collectors.toList());
		System.out.println(reversedSortedList);

	}

}
