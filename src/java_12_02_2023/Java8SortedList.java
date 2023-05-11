package java_12_02_2023;

import java.util.ArrayList;
import java.util.Collections;

public class Java8SortedList {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(23);
		list.add(54);
		list.add(11);
		list.add(75);
		list.add(33);
		Collections.sort(list,(s1,s3)->s1<s3?1:s1>s3?-1:0);
		System.out.println(list);

	}

}
