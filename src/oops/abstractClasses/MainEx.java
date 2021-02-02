package oops.abstractClasses;

public class MainEx {
	public static void main(String[] args) {
		Sample s1 = new SampleChild2(); //up casting
		s1.test();
		s1.test2();
		check(s1);
	}
	
	public static void check(Sample obj) {
		obj.test();
	}
}
