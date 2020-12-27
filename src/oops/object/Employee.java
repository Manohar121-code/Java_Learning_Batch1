package oops.object;

public class Employee {
	private int id;
	private String name;
	private long salary;
	private static int xyz;
	
	public Employee() {
		
	}

	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

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

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public static int getXyz() {
		return xyz;
	}

	public static void setXyz(int xyz) {
		Employee.xyz = xyz;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
