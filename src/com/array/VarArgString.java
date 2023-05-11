package com.array;

public class VarArgString {

	static void varArg(String... strings ) {
		/*
		 * for(String info:strings) { System.out.println(info); }
		 */
		for (int i = 0; i < strings.length; i++) {
			String nameString=strings[i];
			System.out.println(nameString);

		}
	}
	public static void main(String[] args) {
		varArg("chandan","adir","badal","prakash");
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
	}

}
