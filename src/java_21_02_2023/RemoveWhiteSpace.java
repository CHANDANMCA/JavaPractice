package java_21_02_2023;

public class RemoveWhiteSpace {

	public static void removeWhiteSpace(String name) {

		for(int i=0;i<name.length();i++) {
		if(!Character.isWhitespace(name.charAt(i))) {
			System.out.print(name.charAt(i));
		}
	}
	}

	public static void main(String[] args) {

		String name="hello chandan kumar";
		removeWhiteSpace(name);
	}

}
