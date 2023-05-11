package java_14_03_2023;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
	private static final Object Hibernate = null;

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Java","JavaScript","Python","Spring","Hibernate");
		String collect = asList.stream().map(x->x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(collect);
	}

}
