package java_10_03_2023;

public class CapitalWord1 {
	public static void main(String[] args) {
		String name="hello chandan kumar swain";
		String[] split = name.split("\\s");
		String capitalWordString="";
		for(String name1:split) {
			String substring = name1.substring(0,1);
			String substring2 = name1.substring(1);
			capitalWordString+=substring.toLowerCase()+substring2.toUpperCase()+" ";

		}
		System.out.println(capitalWordString);
	}

}
