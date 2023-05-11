package java_22_02_2023;

public class Persion {
	int id;
	String name;
	String email;
	int salary;
	String department;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public Persion(int id, String name, String email, int d, String department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = d;
		this.department = department;
	}
	public Persion(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public Persion() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Persion [salary=" + salary + ", department=" + department + "]";
	}




}
