package java_19_02_2023;

public class SwapNumberUsingThirdVariable {
	public static void main(String[] args) {
		int a=32;
		int b=12;
		/*
		 * int c ;
		 *
		 * c=a; a=b; b=c;
		 */

		 a=a+b;
		 b=a-b;
a=a-b;
		System.out.println(a +" "+b);
	}

}
