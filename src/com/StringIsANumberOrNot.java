package com;

public class StringIsANumberOrNot {
	public static void main(String[] args) {
		String number="[0-9]+";
		String dataString="123456789";
		System.out.println(dataString.matches(number));

	}

}
