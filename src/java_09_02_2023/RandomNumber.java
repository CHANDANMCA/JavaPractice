package java_09_02_2023;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

	public static void main(String[] args) {
;
System.out.println(randomNumber(10, 99));
	}

	public static int randomNumber(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max);
	}
}
