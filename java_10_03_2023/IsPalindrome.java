package java_10_03_2023;

public class IsPalindrome {
	public static void main(String[] args) {

		String name = "hello";

		System.out.println(isPalindrome(name));
	}

	public static boolean isPalindrome(String name) {
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			char charAt = name.charAt(i);
			reverse += charAt;
		}
		if (name.equals(reverse)) {
			return true;

		} else {
			return false;
		}
	}

}
