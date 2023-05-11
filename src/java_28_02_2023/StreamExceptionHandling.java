package java_28_02_2023;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamExceptionHandling {
	public static void main(String[] args) {

		List<String> asList = Arrays.asList("123", "hello", "789");
		List<Integer> asList2 = Arrays.asList(1,3,4,5,6,7,8);
		asList2.stream().forEach(exceptionConsumer(x->System.out.println(100/x),ArithmeticException.class));
	}

	static  <Target,ExObjct extends Exception> Consumer<Target> exceptionConsumer(Consumer<Target> unhandling , Class<ExObjct> exceptionClass){
		return obj->{
			try {
			unhandling.accept(obj);

			} catch (Exception e) {
				// TODO: handle exception
				try {

					exceptionClass.cast(obj);
				} catch (Exception e2) {
					// TODO: handle exception
				}

				System.err.println("can't format this string");
			}
		};
	}

}
