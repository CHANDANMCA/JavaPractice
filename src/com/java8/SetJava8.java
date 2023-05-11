package com.java8;

import java.util.TreeSet;

public class SetJava8 {
	public static void main(String[] args) {
		TreeSet<Integer> c=new TreeSet<Integer>((a,b)->(a>b)?-1:(a<b)?1:0);
		c.add(12);
		c.add(34);
		c.add(11);
		c.add(54);
		System.out.println(c);
	}
	

}
