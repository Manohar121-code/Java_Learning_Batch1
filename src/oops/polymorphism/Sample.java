package oops.polymorphism;

public class Sample {
	public static void m1() {
		System.out.println("m1() called");
	}
	
	public static void m1(int i) {
		System.out.println("m1(int i) called "+i);
	}
	
	public void m1(String s) {
		System.out.println("m1(String s) called "+ s);
	}
	
	public void m1(int i, String s) {
		System.out.println("m1(int i, String s) called, i- "+ i+" & s- "+s);
	}
	
	public void m1(int i, String s, int i2) {
		System.out.println("m1(int i, String s, int i2) called, i- "+i+" & s -"+s+" & i2 -"+i2);
	}
}
