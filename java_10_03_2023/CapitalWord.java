package java_10_03_2023;

public class CapitalWord {
	public static void main(String[] args) {
		String name="hello java tpoint";
		String[] split = name.split("\\s");
		String capitalizedname="";

		for(String name1:split) {
			String substring = name1.substring(0,1);
			String substring2 = name1.substring(1);
			capitalizedname+=substring.toUpperCase()+substring2+" ";

		}
		System.out.println(capitalizedname);
	}

}
