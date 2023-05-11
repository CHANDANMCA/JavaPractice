package com.simple;

import java.util.Arrays;

public class ArraySortSecondHighest {
	public static void main(String[] args) {

		int[] arr = { 21, 11, 32, 12, 43 };
		int[] arr1 = { 11, 32, 12, 43, 21 };
		Arrays.sort(arr);
		Arrays.sort(arr1);
//		for (int a : arr) {
//			System.out.print(a + " ");
//		}

		int arrLength = arr.length;
		int arrLength1 = arr1.length;

		
			if(Arrays.equals(arr, arr1)) {
				System.err.println("this values are equals");
			}

		else {
			System.out.println("his values are not equals");
		}

	}
}
