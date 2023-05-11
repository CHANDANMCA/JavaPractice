package java_22_12_2022;

import java.util.LinkedList;

public class ReverseLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		linkedList.add(12);
		linkedList.add(10);
		linkedList.add(23);
		linkedList.add(21);
		LinkedList<Integer> list=new LinkedList<Integer>();
		linkedList.descendingIterator().forEachRemaining(list::add);;
		System.out.println(list);

	}

}
