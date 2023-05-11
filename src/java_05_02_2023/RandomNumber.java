package java_05_02_2023;

import java.util.function.IntSupplier;

public class RandomNumber {

	public static void main(String[] args) {
		/*
		 * Random random = new Random();
		 *
		 * System.out.println(random.nextInt(20));
		 */

	IntSupplier supplier= ()->(int)(Math.random()*10);
	String otp="";
	for(int i=0;i<6;i++) {
		otp=otp+supplier.getAsInt();
	}
	System.out.println(otp);

	}

}
