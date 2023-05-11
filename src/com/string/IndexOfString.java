package com.string;

public class IndexOfString {
	public static void main(String[] args) {
		String name="hello chandan kumar swain";
		int startIndex=0;
		int count=0;
		for(;;) {
			int index= name.indexOf('a',startIndex);
			if(index>=0) {
				count=count+1;
				startIndex=index+1;
			}else {
				break;
			}
		}
		System.out.println("count a is:"+count);
	}

}
