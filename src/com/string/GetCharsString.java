package com.string;

public class GetCharsString {
public static void main(String[] args) {
	String nameString="chandan";
	char[] cha=new char[12];
	try {
	nameString.getChars(0, 4, cha, 0);
	System.out.println(cha);

	} catch (Exception e) {
		// TODO: handle exception
		e.getStackTrace();
	}
}
}
