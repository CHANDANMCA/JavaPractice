package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaCollection {
	String nameString;
	int id;
	double price;

	public JavaCollection(String nameString, int id, double price) {
		this.nameString = nameString;
		this.id = id;
		this.price=price;
	}

	public JavaCollection() {
		super();
		// TODO Auto-generated constructor stub
	}


}

class CollectionJava {
	public static void main(String[] args) {
		List<JavaCollection> list = new ArrayList<JavaCollection>();
		list.add(new JavaCollection("rice", 1, 23.40));
		list.add(new JavaCollection("dal", 2, 80.21));
		list.add(new JavaCollection("daliya", 3, 11.41));
		list.add(new JavaCollection("drink", 4, 45.34));
		Double collect = list.stream().collect(Collectors.summingDouble(x -> x.price));
		System.out.println(collect);

	}

}