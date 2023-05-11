package java_22_12_2022;

public class SwapNumber {
	public static void main(String[] args) {
		int a=123;
		int b=234;
		b=b+a;
		a=b-a;
		b=b-a;
		System.out.println(a+","+b);
	}

}
