package java_19_02_2023;

public class NumberIsPrimeOrNot {
	public static void main(String[] args) {

		int num=3;
		System.out.println(isPrimeOrNot(num));
	}

	public static boolean isPrimeOrNot(int num) {
		if (num == 0 || num == 1) {
			return false;
		} else if (num == 2) {
			return true;
		}
			for (int i = 2; i < num / 2; i++) {
				if (num % 2 == 0) {
					return false;
				}
			}


		return true;

	}
}
