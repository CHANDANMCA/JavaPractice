package java_22_12_2022;

public class RemoveSpace {
public static void main(String[] args) {
	String name="chandan kumar swain";
	System.out.println(name.replace(" ", ""));
	String nameString="    chandan   ";
	System.out.println(nameString.strip());
}
}
