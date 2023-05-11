package com.java8;

public class palindromJava {

	public static void main(String[] args) {
		/*
		 * int r, sum = 0, temp; int n = 1234; temp = n; while (n > 0) { r = n % 10; sum
		 * = (sum * 10) + r; n = n / 10; } if (temp == sum) {
		 * System.out.println("palindrom number"); } else {
		 * System.out.println("not a palindrom number");
		 *
		 * }
		 */

		String nameString="chanahc";
		String revString="";
		for(int i=nameString.length()-1;i>=0;i--) {
			revString+=nameString.charAt(i);
		}

		if(nameString.equals(revString))
			System.err.println("palindrom");
		else
			System.out.println("not palindrom");

	}
}
