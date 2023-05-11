package java_06_02_2023;

import java.util.HashSet;

public class IntersectionJava {
	public static void main(String[] args) {
		int[] arr1= {12,23,43,55,65};
		int[] arr2= {12,44,55,42};
intersectionJava(arr1, arr2);
	}

	public static void intersectionJava( int arr1[], int arr2[]) {
		HashSet<Integer> hs=new HashSet<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);
		}
		for (int j = 0; j < arr2.length; j++) {
			if(hs.contains(arr2[j])) {
				System.out.println(arr2[j]);
			}
		}
	}

}
