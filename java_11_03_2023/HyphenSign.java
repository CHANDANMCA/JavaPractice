package java_11_03_2023;

public class HyphenSign {
	public static void main(String[] args) {
		String name="hello-chandan-kumar-swain";

		System.out.println(hypenSign(name));

	}

	public static String hypenSign(String sign) {

		String hypen="";
		for (int i = 0; i < sign.length(); i++) {
			if(sign.charAt(i)=='-') {
				hypen+=hypen+'-';

			}

		}
		sign=sign.replace("-"," ");

		return hypen+sign;
	}

}
