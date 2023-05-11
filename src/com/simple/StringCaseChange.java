package com.simple;

public class StringCaseChange {
	public static void main(String[] args) {
		String nameString = "hello chandan kumar swain";
		int midString = nameString.length() / 2;
System.out.println(midString);
		String upperString = "";
		String lowerString = "";

		for (int i = 0; i < nameString.length(); i++) {
			if (i < midString) {
				upperString = upperString + nameString.toUpperCase().charAt(i);
			} else {
				lowerString = lowerString + nameString.toLowerCase().charAt(i);

			}
			
		}
		System.out.println(upperString+lowerString);
	}
}
