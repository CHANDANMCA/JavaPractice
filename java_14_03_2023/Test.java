package java_14_03_2023;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(10,20,30,40,50);
		Integer reduce = asList.stream().reduce(0, Integer::sum);
		//System.out.println(reduce);
		asList.stream().map(x->x+reduce).forEach(System.out::println);;


	}

}
