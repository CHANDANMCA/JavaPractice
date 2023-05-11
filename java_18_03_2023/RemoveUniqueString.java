package java_18_03_2023;

import java.util.HashSet;

public class RemoveUniqueString {
	public static void main(String[] args) {
		String name="heallo jjava";
		HashSet<Character> hashSet=new HashSet<>();
		for (int i = 0; i < name.length()-1; i++) {
			if(hashSet.contains(name.charAt(i))==true) {
				hashSet.remove(name.charAt(i));
			}else {
				hashSet.add(name.charAt(i));
			}

		}
		if (hashSet.size()==0) {
			System.out.println("there is no unique character");

		}
		for(Character ch:hashSet) {
			System.out.println(ch+" ");
		}
	}

}
