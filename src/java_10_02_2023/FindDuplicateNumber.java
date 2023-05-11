package java_10_02_2023;

import java.util.HashSet;

public class FindDuplicateNumber {
	public static void main(String[] args) {
		int[] array= {1,23,34,45,6,1,23,7};
		HashSet<Integer> hashSet=new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			if(hashSet.add(array[i])==false) {
				System.out.println("duplicate number:"+array[i]);
			}
		}
	}

}
