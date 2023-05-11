package com;

public class ReversePreservingString {
	static void reverse(String name) {
		char[] inputArray = name.toCharArray();
		char[] result = new char[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == ' ') {
				result[i] = ' ';
			}
		}
		int j = result.length - 1;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != ' ') {
				if (inputArray[j] == ' ') {
					j--;

				}
				result[j]=inputArray[i];
				j--;


			}

		}
		System.out.println(String.valueOf(result));
	}

	public static void main(String[] args) {
		reverse("chandan kumar swain");
	}
}
