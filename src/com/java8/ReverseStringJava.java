package com.java8;

public class ReverseStringJava {
	public static void main(String[] args) {
		System.out.println(reverString("chandan"));
		System.out.println("hello");
	}
	
	static String reverString(String str) {
		
		//String nameString="chandann";
		char[] charArray = str.toCharArray();
		String revString="";
		for (int i =charArray.length-1; i >=0; i--) {
			revString+=charArray[i];
			
		}
		
		return revString;
		
	}

}
