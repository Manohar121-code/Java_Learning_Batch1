package oops.privateStaticFinal;

public class A {
	public void normalMethod() {
		System.out.println("parent m1() called");
	}
	
	private void privateMethod() {
		System.out.println("parent privateMethod() called");
	}
	
	public final void finalMethod() {
		System.out.println("Parent finalMethod() called");
	}
	
	public static void staticMethod() {
		System.out.println("Parent staticMethod() called");
	}
	
}
