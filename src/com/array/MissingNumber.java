package com.array;

public class MissingNumber {
	public static void main(String[] args) {

		int total;
		int[] numbers = new int[] { 1, 2, 3, 4, 6, 7, 8, 10 };
		total = 10;
		int expected_sum = total * ((total + 1) / 2);
		int num_sum = 0;
		for (int i : numbers) {
			num_sum += i;
		}

		System.out.print(expected_sum - num_sum);
	}

}
