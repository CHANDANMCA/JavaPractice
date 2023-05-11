package com.array;

public class SecondHigestNumber {
	static int secondHigestNumber(int[]arr, int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for (int j = i+1; j < total; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		return arr[total-2];

	}
	public static void main(String[] args) {
		int[] arr= {12,32,43,11,6,77,65};
		System.out.println(secondHigestNumber(arr, arr.length));
	}

}
