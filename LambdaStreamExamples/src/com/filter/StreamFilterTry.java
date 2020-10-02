package com.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterTry {
	
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(1,3,4,6,7,8);
	int [] arr = {1,3,4,5,6,7};
	
	List<Integer> filtered = list.stream().filter(x->x%2==0).collect(Collectors.toList());
	System.out.println(filtered.toString());
	
	List<Integer>maped  =list.stream().map(x->x=x*x).collect(Collectors.toList());
	System.out.println(maped.toString());
	
	Integer reduced = list.stream().reduce((x,y)-> x+y).get();
	System.out.println(reduced);
	
	int val = Arrays.stream(arr).sum();
	System.out.println(val);
	
}

}
