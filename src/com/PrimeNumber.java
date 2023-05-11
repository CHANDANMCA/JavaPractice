package com;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int num=6;
		if(isPrame(num)) {
			System.out.println("is a prime number");
		}else {
			System.err.println("is not a prime number");
		}
		
	}
	 public static boolean isPrame(int num) {
		
		if(num<2) {
			return false;
		}
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
