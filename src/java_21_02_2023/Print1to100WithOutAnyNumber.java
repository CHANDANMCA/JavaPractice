package java_21_02_2023;

public class Print1to100WithOutAnyNumber {

	public static void printNumber(int num) {
		if(num>1) {
			printNumber(num-1);
			System.out.println(num);
		}
	}
	public static void main(String[] args) {

		printNumber(100);
	}
}
