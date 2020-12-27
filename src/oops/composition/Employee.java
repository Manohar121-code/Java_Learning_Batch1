package oops.composition;

public class Employee {
	private int id;
	private String name;
	private Company company;
	private Address address;

	public Employee(int id, String name, Company company, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.address = address;
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

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", address=" + address + "]";
	}

}
