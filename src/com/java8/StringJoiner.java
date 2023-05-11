package com.java8;

public class StringJoiner {

	public static void main(String[] args) {
java.util.StringJoiner  stringJoiner=new java.util.StringJoiner(",","[","]");
stringJoiner.add("chadan");stringJoiner.add("kumar");stringJoiner.add("swain");
System.out.println(stringJoiner);
java.util.StringJoiner stringJoiner2=new java.util.StringJoiner(",");
stringJoiner2.add("a");
stringJoiner2.add("b");
System.out.println(stringJoiner2);
java.util.StringJoiner merge = stringJoiner.merge(stringJoiner2);
System.out.println(merge);


	}

}
