package java_22_12_2022;

public class CheckStringIsPalindromOrNot {
	public static void main(String[] args) {

		String nameString = "maanm";
		String reverseString = "";
		/*
		 * for (int i = nameString.length() - 1; i >= 0; i--) { reverseString +=
		 * nameString.charAt(i); } if (reverseString.contentEquals(nameString)) {
		 * System.out.println("String is palindrom" + " " + nameString); } else {
		 * System.out.println("stirng is not palindrom " + " " + nameString); }
		 */
System.out.println(isPalindrom(nameString));
	}

	public static boolean isPalindrom(String nameString) {
		String reverString = "";
		for (int i = nameString.length() - 1; i >= 0; i--) {
			reverString+=nameString.charAt(i);
			if (reverString .equals( nameString)) {
				return true;
			}
		}
		return false;

	}

}
