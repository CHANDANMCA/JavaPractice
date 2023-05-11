package java_10_03_2023;

public class SplitString {
	public static void main(String[] args) {
		String name = "hello java programming language";
		String[] split = name.split("\\s");
		for (String name1 : split) {
			System.out.println(name1);

		}
	}

}
