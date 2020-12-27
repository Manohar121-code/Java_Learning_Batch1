package oops.composition;

public class Company {
	private String name;
	private int totalEmp;

	public Company(String name, int totalEmp) {
		super();
		this.name = name;
		this.totalEmp = totalEmp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalEmp() {
		return totalEmp;
	}

	public void setTotalEmp(int totalEmp) {
		this.totalEmp = totalEmp;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", totalEmp=" + totalEmp + "]";
	}

}
