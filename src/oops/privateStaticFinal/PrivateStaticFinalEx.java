package oops.privateStaticFinal;

public class PrivateStaticFinalEx {
	public static void main(String[] args) {
		A obj = new B();
		obj.normalMethod();
		obj.finalMethod();
		obj.staticMethod();
		
		B.staticMethod();
		
		
	}
}
