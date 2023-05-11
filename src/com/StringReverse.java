package com;

public class StringReverse {
	public static void main(String[] args) {
String nameString="hello";
String reverseString="";
for(int i=nameString.length()-1;i>=0;i--) {
	reverseString+=nameString.charAt(i);
}
System.out.println(reverseString);
	}

}
