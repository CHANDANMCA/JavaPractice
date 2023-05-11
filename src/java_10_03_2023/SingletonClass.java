package java_10_03_2023;

public class SingletonClass {

	private static SingletonClass singletonClass = new SingletonClass();

	private SingletonClass() {

	}
	public static SingletonClass getA() {
		return singletonClass;
	}

	public void method1() {
		System.out.println("do somthing");
	}
}
