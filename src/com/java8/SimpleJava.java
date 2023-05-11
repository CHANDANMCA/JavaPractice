package com.java8;

public class SimpleJava {
	public static void main(String[] args) {
		/*
		 * int i=0; int num=0; while(i<4) { num=(i++*5); System.out.println(num); }
		 * 
		 * int x = 4; int y = 2; x -= y /= x * y; System.out.println(x + " " + y);
		 */
		
		String str = "Saket Saurav";
        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
        String revString="";
        for(int i= chars.length-1; i<=0; i--) {
            revString+=chars[i];
        }
System.out.println(revString);
	}

}
