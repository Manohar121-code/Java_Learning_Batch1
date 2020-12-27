package oops.composition;

public class CompositionEx {
	public static void main(String[] args) {
		Company deloitte = new Company("Deloitte", 76576);
		Address karthikAddress = new Address(1617, "India");
		
		Employee karthik = new Employee(10, "Karthik", deloitte, karthikAddress);
		System.out.println(karthik);
		
		int id = karthik.getId();System.out.println(id);
		String name = karthik.getName();System.out.println(name);
		Company company = karthik.getCompany();
		System.out.println(company);
		String companyName = company.getName();
		System.out.println(companyName);
		
	}
}
