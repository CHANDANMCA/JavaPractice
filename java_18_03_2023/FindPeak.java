package java_18_03_2023;

public class FindPeak {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 5, 4, 6, 8 };
		int n = arr.length;
		System.out.println(peak(arr, n));
	}

	public static int peak(int arr[], int n) {
		if (n == 1)
			return 0;

		if (arr[0] >= arr[1])
			return 0;
		if (arr[n - 1] >= arr[n - 2])
			return n - 1;

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
				return i;
			}
		}
		return 0;
	}

}