package com.array;

public class TwoMaximumNumber {
	static void twoMaximumNumber(int[] num) {

		int first_max_num = 0;
		int second_max_num = 0;
		for (int n : num) {
			if (first_max_num < n) {
				second_max_num = first_max_num;
				first_max_num = n;
			} else if (second_max_num < n) {
				second_max_num = n;
			}

		}
		System.out.println(first_max_num);
		System.out.println(second_max_num);
	}

	public static void main(String[] args) {
		int[] arr = { 12, 3, 4, 55, 66, 76, 56, 78 };
		twoMaximumNumber(arr);
	}

}
