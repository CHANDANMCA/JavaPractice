package com.java8;

import java.util.Arrays;

public class ParrallelSortArray {
	public static void main(String[] args) {
		int[] array= {12,43,56,33,88,31};
		for(int a:array) {
			System.out.print(a+",");
		}
		Arrays.parallelSort(array);
		System.out.println("\nparallelSort array");
		for(int b:array) {
			System.out.print(b+",");
			
		}
		
	}

}
