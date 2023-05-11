package java_11_03_2023;

public class RotationString {
	public static boolean checkRotation(String st1, String st2) {
		if (st1.length() != st2.length()) {
			return false;
		}

		String str3 = st1 + st1;
		if (str3.contains(st2)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
String name1="avajava";
String name2="javaava";

if(checkRotation(name1, name2)){
	System.out.println("yes "+name2+" rotation of "+name1);
}else
	System.out.println("No "+name2+" rotation of "+name1);
	}
}
