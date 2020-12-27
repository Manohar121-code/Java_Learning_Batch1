package basics.methods;

public class Sample {
	public static void main(String[] args) {
		System.out.println("main() called");
		m1();
		int i = 10;
		m2(i);
		m3("surya", 30);
		System.out.println("main() ended!!!");
	}
	
	public static void m1() {
		System.out.println("m1 called!!!");
		System.out.println("m1 ended!!!");
	}
	
	public static void m2(int i) {
		System.out.println("m2 called!!!");
		int a = 10;
		int sum = a + i;
		System.out.println(sum);
		System.out.println("m2 ended!!!");
	}
	
	public static void m3(String name, int age) {
		System.out.println("m3() called!!!");
		System.out.println("name - " + name + ", age - " + age);
		System.out.println("m3() ended!!!");
	}
}
