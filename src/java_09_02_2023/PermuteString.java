package java_09_02_2023;

public class PermuteString {
	public static void main(String[] args) {

		String name="ABCDEF";
		int length = name.length();
		generateString(name, 0, length);

	}

	public static String SwapString(String a, int i, int j) {
		char[] charArray = a.toCharArray();
		char ch;
		ch = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = ch;
		return String.valueOf(charArray);

	}

	public static void generateString(String a, int starting, int ending) {

		if(starting==ending-1) {
			System.out.println(a);
		}else {
			for(int i=starting;i<ending;i++) {
				a=SwapString(a, starting, i);
				generateString(a, starting+1, ending);
				a=SwapString(a, starting, i);
			}
		}
	}

}
