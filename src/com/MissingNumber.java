package com;

public class MissingNumber {
	public static void main(String[] args) {
int[] missingNumber= {1,2,3,4,5,7,8,9};
int total=9;
int expectedNumber=total*(total+1)/2;
int actualNumber=0;
for (int i :missingNumber) {
	actualNumber=actualNumber+i;
}

System.out.println(expectedNumber-actualNumber);
	}
}
