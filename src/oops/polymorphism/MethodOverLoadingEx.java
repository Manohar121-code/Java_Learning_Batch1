package oops.polymorphism;

public class MethodOverLoadingEx {
	static int i = 10;
	int j = 20;
	public static void main(String[] args) {
		Sample.m1();
		Sample.m1(10);
		Sample s1 = new Sample();
		s1.m1("java");
		s1.m1(10, "java");
		s1.m1(10, "java", 20);
	}
	
	public void test() {
		System.out.println("test() called");
		nonStaticTest();
		staticTest();
	}
	
	public static void staticTest() {
		System.out.println("staticTest() called");
	}
	
	public void nonStaticTest() {
		System.out.println("nonStaticTest() called");
	}
}
