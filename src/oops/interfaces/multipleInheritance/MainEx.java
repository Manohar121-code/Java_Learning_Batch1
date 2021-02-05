package oops.interfaces.multipleInheritance;

public class MainEx {
	public static void main(String[] args) {
		Interface1 obj1 = new ChildInterfaceImpl();
		
		Interface2 obj2 = new ChildInterfaceImpl();
		
		ChildInterface obj3 = new ChildInterfaceImpl();
		
		obj1.m1();
		obj2.m1();
		obj3.m1();
		System.out.println("-------------");
		
		Interface1 i1 = new ImplementationClassForI1AndI2();
		Interface2 i2 = new ImplementationClassForI1AndI2();
		
		i1.m1();
		i2.m1();
	}
}
