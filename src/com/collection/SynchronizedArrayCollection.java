package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayCollection {
	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("chandn");
	list.add("chandn");
	list.add("chandn");
	list.add("chandn");
	list.add("chandn");
	List<String> synchronizedList = Collections.synchronizedList(list);
	System.out.println(synchronizedList);
	}

}