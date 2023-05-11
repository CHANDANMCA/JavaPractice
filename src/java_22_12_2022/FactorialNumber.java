package java_22_12_2022;

public class FactorialNumber {
	public static void main(String[] args) {
		System.out.println(factorialNumber(5));

	}

	public static int factorialNumber(int number) {
		if(number==1) {
			return 1;
		}else {
			return number* factorialNumber((number-1));
		}

	}

}
