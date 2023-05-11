package java_19_02_2023;

public class ReverseString {
	public static void main(String[] args) {
		String name="chandan";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
			char charAt = name.charAt(i);
			reverse+=charAt;
		}
		System.out.println(reverse);
	}

}
