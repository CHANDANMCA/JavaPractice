package java_26_02_2023;

import java.util.Random;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		Stream<Integer> generate = Stream.generate(()->new Random().nextInt(100000)).limit(1);
		//System.out.println(generate);
	generate.forEach(System.out::println);


	}

}
