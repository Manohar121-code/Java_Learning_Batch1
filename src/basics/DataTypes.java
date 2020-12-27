package basics;

public class DataTypes {
	public static void main(String[] args) {
		short sh = 5;
		int i = 10;
		long l = 767665656;
		boolean check = true;
		float f = 1.2f;
		double d = 5657.373;
		char ch = '^';
		String s = "java";
		
		System.out.println(sh);
		System.out.println("i value - "+i);
		System.out.println(l);
		System.out.println("check value - "+check);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(s);
		
		int j;
		j = 20;
		System.out.println(j);
		
		// final keyword is to declare variables at single time, we can't change the value once assigned
		final int k = 30;
//		k = 40;
		System.out.println(k);
	}
}
