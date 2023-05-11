package java_06_02_2023;

public class InterviewQ {
	public static void main(String[] args) {
		String name = "chadnan!@#";
		int count = 0;
		String removedString="";

		for (int i = 0; i < name.length(); i++) {
			if (!Character.isDigit(name.charAt(i)) && !Character.isLetter(name.charAt(i)) &&
					!Character.isWhitespace(name.charAt(i))) {
				count++;
			}else {
				removedString=removedString+name.charAt(i);
			}

		}

		if (count == 0) {
System.out.println("no special character count");
		}else {
			System.out.println("special character count : "+count);
		}
		System.out.println(removedString);
	}

}
