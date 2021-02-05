package oops.interfaces;

public class ImplementationClass1 extends Sample implements InterfaceA {

	@Override
	public void test() {
		System.out.println("test() implemented");
	}

	@Override
	public void test2() {
		System.out.println("test2() implemented");
	}

	@Override
	public void baseMethod() {
		System.out.println("baseMethod() implemented");
	}

}
