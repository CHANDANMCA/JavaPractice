package java_23_02_2023;

import java.util.Arrays;
import java.util.List;

public class StartWithOne {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(12, 23, 11, 42, 54, 18, 15);
		//asList.stream().map(e->e.toString()).filter(e->e.startsWith("1")).forEach(System.out::println);
		asList.sort((o1,o2)->o1>o2?-1:o1<o2?1:0);
		System.out.println(asList);
	}
}
