package java_05_03_2023;

public class PrivateMethodInterface9 {

}

interface CustomInterface {

	public abstract void abstractMethod();

	default void defaultMethod() {
		privateMethod();
		staticMethod();
		System.out.println("default method");
	}

	public static void staticMethod() {
		privateStaticMethod();
		System.out.println("static method");
	}

	private void privateMethod() {
		System.out.println("private method interface");
	}

	private static void privateStaticMethod() {
		System.out.println("private static method interface");
	}
}