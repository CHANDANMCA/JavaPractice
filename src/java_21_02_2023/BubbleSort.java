package java_21_02_2023;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {

		int temp;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < arr.length; j++) {

				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 12, 33, 2, 24, 56, 76, 11 };
		bubbleSort(arr);
		for (int array : arr) {
			System.out.println(array);
		}
	}

}
