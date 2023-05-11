package com.java8;

public class LamdaExpressionJava {
	public static void main(String[] args) {
		Drawable drawable=new Drawable() {
			
			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				int c=a+b;
				return c;
			}
		};
		
		System.out.println(drawable.sum(10, 13));
		
		Drawable drawable2=(a,b)->(a+b);
		System.out.println(drawable2.sum(20, 30));
	
		
	}

}
