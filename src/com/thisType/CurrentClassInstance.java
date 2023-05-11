package com.thisType;

class A{
	A getMethod() {
		return this;
	}
	void message() {
		System.out.println("hello instance class");
	}
}
public class CurrentClassInstance {
	public static void main(String[] args) {
		A a=new A();
		a.message();
		StringBuffer sb=new StringBuffer("ashokkumar");
		sb.setCharAt(8,'A');
		System.out.println(sb);
	}

}
