package java_11_03_2023;

public class CountWord {
	public static int countWord(String word) {
		int count = 1;
		for (int i = 0; i < word.length() - 1; i++) {
			if (word.charAt(i) == ' ' && word.charAt(i+1) != ' ') {
				count++;
			}
		}

		return count;
	}
	public static void main(String[] args) {
		String name="hello java chandan";
		System.out.println(countWord(name));
	}

}
