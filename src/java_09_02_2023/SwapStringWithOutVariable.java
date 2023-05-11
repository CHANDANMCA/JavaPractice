package java_09_02_2023;

public class SwapStringWithOutVariable {
	public static void main(String[] args) {
String name="chandan";
String middleName="kumar";

name=name+middleName;
System.out.println(name);
middleName=name.substring(0,name.length()-middleName.length());
System.out.println(middleName);
name=name.substring(middleName.length());
System.out.println(name+" "+middleName);
	}

}
