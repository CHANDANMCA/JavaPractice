package com.array;

public class ArrayEvenPosition {
	public static void main(String[] args) {
		int[] arr=new int[] {12,13,14,15,16,17,18};
		var list=java.util.List.of(12, 13, 14, 15, 16);
		var list1=java.util.List.of(45,12,11,67,88);
//		java.util.List.of(list,list1).stream().filter(num->num%2==0).forEach(System.out::print);
		list.stream().filter(num->num%2==0).forEach(System.out::println);
	}

}
