package com;

public class FindDuplicateWord {
	public static void main(String[] args) {

		String name = "hello chandan kumar swain hello";
		String[] split = name.split(" ");
		int count;
		for (int i = 0; i < split.length; i++) {
			count = 1;
			for (int j = i+1; j < split.length; j++) {
				if (split[i].equals(split[j])) {
					count++;
					split[j]="0";
				}
			}

			if (count > 1 && split[i] != "0") {
				System.out.println(split[i]);
			}
		}

	}
}
