package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteration {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		hashMap.put(12, "chandan");
		hashMap.put(13, "kumar");
		hashMap.put(14, "swain");
		hashMap.put(15, "ghania");
		System.out.println(hashMap.size());
		
		/*
		 * Iterator iterator=hashMap.entrySet().iterator(); while(iterator.hasNext()) {
		 * Map.Entry next = (Entry) iterator.next();
		 * System.out.println(next.getValue()+" "+next.getKey()); }
		 */
		for(Map.Entry entry:hashMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
