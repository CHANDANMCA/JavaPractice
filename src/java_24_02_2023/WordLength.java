package java_24_02_2023;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordLength {
	public static void main(String[] args) {
//	List<String> list=new ArrayList<String>;
		List<String> asList = Arrays.asList("There", "are" ,"around", "modules", "which", "are" ,"generalized" ,"into" ,"the");
Map<Integer, List<String>> collect = asList.stream().collect(Collectors.groupingBy(String::length));
System.out.println(collect);
	}

}
