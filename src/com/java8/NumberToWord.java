package com.java8;

public class NumberToWord {
	public static void main(String[] args) {
		Integer nub=22344;
		String simpleName = nub.getClass().getSimpleName();
		System.err.println(simpleName);
		String string = nub.toString();
		System.out.println(string.getClass().getSimpleName());

	}

}
