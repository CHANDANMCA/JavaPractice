package com.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFirstIterator {
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> empMap=new ConcurrentHashMap<String, String>();
		empMap.put("name","chandan");
		empMap.put("email","cks25ab@gmail.com");
		empMap.put("add","godhan");
		Iterator iterator =empMap.keySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(empMap.get(iterator.next()));
			empMap.put("pass", "chadnan");
			
		}
	
		
	}

}
