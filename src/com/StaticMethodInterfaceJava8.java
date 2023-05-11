package com;

interface inf{
	public static void method2(int a,int b) {
		System.out.println(a+b);
	}
}
public class StaticMethodInterfaceJava8 {

	public static void main(String[] args) {
		inf.method2(12, 11);
	}
}
