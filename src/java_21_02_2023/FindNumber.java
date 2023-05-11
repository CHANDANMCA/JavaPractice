package java_21_02_2023;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumber {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7);
		asList.stream().collect(Collectors.groupingBy(null));

	}

}
