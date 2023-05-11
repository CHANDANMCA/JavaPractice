package com.java8;

public class SwapNumberWithOutVariable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("without swap number:"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}
}
