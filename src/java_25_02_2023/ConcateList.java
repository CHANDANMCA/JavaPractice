package java_25_02_2023;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcateList {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6);
		List<Integer> asList2 = Arrays.asList(5,6,7,8,9);

	Stream<Integer> concateStream=	Stream.concat(asList.stream(), asList2.stream());
	//List<Integer> collect = concateStream.collect(Collectors.toList());
	//System.out.println(collect);
java.util.Set<Integer> collect2 = concateStream.collect(Collectors.toSet());
System.out.println(collect2);

	}

}
