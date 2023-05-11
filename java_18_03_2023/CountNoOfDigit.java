package java_18_03_2023;

public class CountNoOfDigit {
	public static void main(String[] args) {
		int count = 0;
		int number = 000234531;
		while (number != 0) {
			number /= 10;
			count++;
		}
		System.out.println(count);
	}
}
