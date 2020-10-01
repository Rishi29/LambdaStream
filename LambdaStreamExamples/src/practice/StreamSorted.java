package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamSorted {

	public static void main(String[] args) {

		List<String> myList = Arrays.asList("apple", "orange", "grapes", "pineapple");

		sortTheList(myList);
		sortReverseOrder(myList);
	}

	// sorting in asc order
	private static void sortTheList(List<String> myList) {
		Stream<String> sortedStream = myList.stream().sorted();
		System.out.println("sorting in asc order");
		sortedStream.forEach(System.out::println);
		System.out.println("");

	}

	// sorting in Reverse order
	
	private static void sortReverseOrder(List<String> myList) {
		
		Stream<String> sortReverseOrder = myList.stream().sorted(Comparator.reverseOrder());
		System.out.println("sorting in Reverse order");
		sortReverseOrder.forEach(System.out::println);

	}

}
