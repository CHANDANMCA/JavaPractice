package com.array;

public class CopyOneArrayToAnther {
	public static void main(String[] args) {
		int[] arr1 = { 12, 32, 11, 43, 55, 67, 32 };
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];

		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
