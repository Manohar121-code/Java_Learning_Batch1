package oops.object;

public class ObjectExample {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(10);
		e1.setName("abc");
		
		Employee e2 = new Employee();
		e2.setId(20);
		e2.setName("mno");
		
		Employee e3 = new Employee();
		e3.setId(30);
		e3.setName("xyz");
		
		System.out.println(e1.getId());
		System.out.println(e2.getId());
		System.out.println(e3.getId());
		
		int i = 80;
		System.out.println(i);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
