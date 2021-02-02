package oops.interfaces;

public class ImplementationClassA extends Sample implements InterfaceA {

	@Override
	public void test() {
		System.out.println("test() implemented");
	}

	@Override
	public void test2() {
		System.out.println("test2() implemented");
	}

}
