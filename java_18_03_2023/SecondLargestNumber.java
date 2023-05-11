package java_18_03_2023;

import java.util.Arrays;

public class SecondLargestNumber {
	public static int secondLargest(int arr[], int total) {

//		int temp;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[i]>=arr[j]) {
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//
//
//			}
//		}
		Arrays.sort(arr);

		return arr[1];
	}
	public static void main(String[] args) {
		int arr[] = {1,4,5,2,7,8,6};
		int total=arr.length;
		System.out.println(secondLargest(arr, total));
	}

}
