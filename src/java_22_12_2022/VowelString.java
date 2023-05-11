package java_22_12_2022;

public class VowelString {
	public static void main(String[] args) {
		String nameString="chandan";
	System.out.println(stringContainsVowels(nameString));
	}

	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}
}
