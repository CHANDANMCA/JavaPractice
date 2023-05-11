package com.simple;

public class Simple {
	public static void main(String[] args) throws ClassNotFoundException {
	byte a=1;
	byte b=2;
	int c= (a+b);
	Thread t=new Thread();
	Object o=new Object();
	String s=new String();
	System.out.println(s==o);
	System.out.println(s.getClass().getName());
	System.out.println(t instanceof Thread);
	
	}

}
