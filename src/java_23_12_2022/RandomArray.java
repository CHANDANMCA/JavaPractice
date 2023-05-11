package java_23_12_2022;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwip = random.nextInt(array.length);
			int temp = array[randomIndexToSwip];
			array[randomIndexToSwip] = array[i];
			array[i] = temp;
		}
		System.out.println(Arrays.toString(array));

	}

}
