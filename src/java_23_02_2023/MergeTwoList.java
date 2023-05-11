package java_23_02_2023;

import java.util.ArrayList;

public class MergeTwoList {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("12");
		list.add("11");
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("chandan");
		arrayList.add("badal");
		ArrayList<String> arrayList2=new ArrayList<>(list);
		arrayList2.addAll(arrayList);
		System.out.println(arrayList2);

	}

}
