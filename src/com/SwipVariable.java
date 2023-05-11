package com;

public class SwipVariable {
	public static void main(String[] args) {
		int a=321;
		int b=543;
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println(a+" "+b);
		String a1="hello";
		String b1="chandan";
		a1=a1+b1;
		b1=a1.substring(0,a1.length()-b1.length());
		a1=a1.substring(b1.length());
		System.out.println(b1+" :"+a1);


	}

}
