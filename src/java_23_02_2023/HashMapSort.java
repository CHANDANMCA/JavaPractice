package java_23_02_2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSort {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("chadnan", 1);
		hashMap.put("kanha", 43);
		hashMap.put("badal", 3);
		hashMap.put("ghania", 54);

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Map.Entry<String, Integer> entity : hashMap.entrySet()) {
			list.add(entity.getValue());
		}
		Collections.sort(list, (o1, o2) -> o1 > o2 ? -1 : o1 < o2 ? 1 : 0);
		System.out.println(list);
		LinkedHashMap<String, Integer> lisnHashMap = new LinkedHashMap<String, Integer>();
		for (int num : list) {
			for (Entry<String, Integer> entry : hashMap.entrySet()) {
				if (entry.getValue().equals(num)) {
					lisnHashMap.put(entry.getKey(), num);
				}
			}
		}
		System.out.println(lisnHashMap);
	}

}
