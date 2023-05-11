package com.java8;

import java.util.TreeSet;

public class TreeSetJava {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>(new Comparator());
		treeSet.add("chandna");
		treeSet.add("adhir");
		treeSet.add("kanha");
		System.out.println(treeSet);
		
	}
}

class Comparator implements java.util.Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}