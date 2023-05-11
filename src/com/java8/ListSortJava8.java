package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
	
		return (o1>o2)?-1:(o1<o2)?1:0;
	}
	
}
public class ListSortJava8 {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(12);
		arrayList.add(54);
		arrayList.add(11);
		arrayList.add(23);
		//Collections.sort(arrayList,(a,b)->b.compareTo(a));
		arrayList.forEach(s->System.out.println(s));
		//Collections.sort(arrayList,new MyComparator());
		Collections.sort(arrayList,(arrayList1,arrayList2)->(arrayList1>arrayList2)?-1:(arrayList1<arrayList2)?1:0);
		//arrayList.forEach(s1->System.out.print(s1+" "));
		
	}

}
