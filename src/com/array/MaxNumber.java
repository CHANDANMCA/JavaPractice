package com.array;

public class MaxNumber {
	public static void main(String[] args) {
		int[] arr= {12,22,32,44,55,45,67,87};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}


}
