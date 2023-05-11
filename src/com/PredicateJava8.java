package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateJava8 {
	public static void main(String[] args) {

		/*
		 * Predicate<String> iPredicate = a -> (a.length() > 10);
		 * 
		 * System.out.println(iPredicate.test("chdnnna"));
		 * 
		 * ArrayList<String> list = new ArrayList<String>(); list.add("chandan");
		 * list.add("kedar"); list.forEach(e->System.out.println(e));
		 * Stream<ArrayList<String>> of = Stream.of(list); System.out.println(of);
		 */
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> asList = Arrays.asList(12, 21, 34, 52, 31, 33, 11);
		;
		System.out.println(asList.stream().filter((a) -> a % 2 == 0).collect(Collectors.toList()));
		System.out.println(asList.stream().map(ab -> ab * 2).collect(Collectors.toList()));

		List<Integer> sorted = asList.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		List<Integer> collect = asList.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println(asList.stream().min((s3, s4) -> s3.compareTo(s4)).get());

		Integer[] array = asList.stream().toArray(Integer[]::new);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
			
			Stream<Integer> of = Stream.of(12,433,22,11,44,556,77,889);
			of.forEach(System.out::print);
		}
		
	}

}
