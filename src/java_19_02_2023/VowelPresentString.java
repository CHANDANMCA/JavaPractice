package java_19_02_2023;

public class VowelPresentString {
	public static String vowelString(String name) {
		String name1="";
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {


				return  name1+=name.charAt(i);
			}
		}
		return name1;
	}

	public static void main(String[] args) {

		String name="chandan";
		 System.out.println(vowelString(name));
	}

}
