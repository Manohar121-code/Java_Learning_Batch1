package oops.privateStaticFinal;

public class B extends A {
	public void normalMethod() {
		System.out.println("Child m1() called");
	}
	
	private void privateMethod() {
		System.out.println("parent privateMethod() called");
	}
	
	public static void staticMethod() {
		System.out.println("Child staticMethod() called");
	}
	
}
