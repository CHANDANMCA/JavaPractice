package com.simple;

public class FindArrayNumber {
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5,6,8,9,10};
		int sum=(10*11)/2;
		int actualsum = 0;
		for (int i = 0; i < arr.length; i++) {
		actualsum+=arr[i];
			
		}
		System.out.println("finding number:"+(sum-actualsum));
	}

}
