package oops.typecasting;

public class ClassCastingEx {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		Child c = new Child();
		
		
		Parent p1 = new Child(); // upcasting
		p1.m1();
		
		Child c2 = (Child) p1; // downcasting
		c2.m1();
		
		if (p instanceof Child) {
			System.out.println("----**---");
			Child c3 = (Child) p; //downcasting
		}
		
		if (p1 instanceof Child) {
			System.out.println("-------");
			Child c3 = (Child) p1; //downcasting
		}
	}
}
