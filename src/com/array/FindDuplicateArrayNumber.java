package com. array;

public class FindDuplicateArrayNumber {
	public static void main(String[] args) {
		int[] arr = { 12, 13, 14, 11, 12, 15, 13, 16, 17 };
		int length = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
