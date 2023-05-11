package java_09_03_2023;

public class Cloning implements Cloneable {

	int id;
	String name;

	public Cloning(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Cloning cloning = new Cloning(12, "chadnan");
		System.out.println(cloning.id + " " + cloning.name);
		Cloning clone = (Cloning) cloning.clone();

	}
}
