package java_23_02_2023;

import java.util.HashMap;

public class CharCount {
	public static void main(String[] args) {
String nameString="HelloJavajavaJavaScript";
HashMap<Character, Integer> hashMap=new HashMap<Character, Integer>();
char[] charArray = nameString.toCharArray();
for(char ch:charArray) {
	if(hashMap.containsKey(ch)) {
		hashMap.put(ch, hashMap.get(ch)+1);
	}else {
		hashMap.put(ch, 1);
	}
}
System.out.println(hashMap);


	}
}
