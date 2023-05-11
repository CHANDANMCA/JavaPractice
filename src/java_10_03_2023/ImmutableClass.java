package java_10_03_2023;

public final class ImmutableClass {
	final int id;
	final String name;


	public ImmutableClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}




	public int getId() {
		return id;
	}




	public String getName() {
		return name;
	}




	public static void main(String[] args) {
		ImmutableClass immutableClass =new ImmutableClass(12, "candan");
		String name2 = immutableClass.getName();
		System.out.println(name2);

	}

}
