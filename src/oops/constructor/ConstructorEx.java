package oops.constructor;

public class ConstructorEx {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample(10);
		Sample s3 = new Sample("java");
		Sample s4 = new Sample(100, "bike");
		
		int i = 99;
		System.out.println(i);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
