package java_24_02_2023;

public class PalindromString {
	public static void main(String[] args) {
		String name = "mam";
		String revrse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			char charAt = name.charAt(i);
			revrse += charAt;
		}
		if (name.equals(revrse)) {
			System.out.println("it is palindrom");
		} else {
			System.out.println("not palindrom");
		}

	}
}
