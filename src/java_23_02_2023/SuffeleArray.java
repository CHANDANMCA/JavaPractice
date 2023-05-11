package java_23_02_2023;

import java.util.Arrays;
import java.util.Random;

public class SuffeleArray {
	public static void main(String[] args) {
		int[] arr ={ 12, 32, 4, 56 };

	Random random=new Random();
	for (int i = 0; i < arr.length; i++) {
		int randomarr=random.nextInt(arr.length);
		int temp=arr[randomarr];
		arr[randomarr]=arr[i];
		arr[i]=temp;
	}
	System.out.println(Arrays.toString(arr));

	}
}
