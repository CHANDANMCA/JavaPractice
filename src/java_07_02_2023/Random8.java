package java_07_02_2023;

import java.util.Random;

public class Random8 {
	public static void main(String[] args) {
		randomInts(1,100000,999999);
	}
	public static void randomInts(int nums , int origni, int bound) {
		Random random=new Random();
		random.ints(nums,origni,bound).forEach(System.out::println);
	}

}
