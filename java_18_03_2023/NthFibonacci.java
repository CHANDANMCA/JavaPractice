package java_18_03_2023;

public class NthFibonacci {
	public static void fibonacci(int num) {
		int a=0,b=1;
		int c;
		System.out.print(a+","+b);
		for(int i=2;i<=num;i++) {

			c=a+b;
			a=b;
			b=c;
System.out.print(","+c);
		}
	}
	public static void main(String[] args) {
		fibonacci(10);
	}

}
