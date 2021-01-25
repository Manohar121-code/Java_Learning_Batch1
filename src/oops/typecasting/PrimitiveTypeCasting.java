package oops.typecasting;

public class PrimitiveTypeCasting {
	public static void main(String[] args) {
		int i = 30;
		long l = i; //widening
		
		long j = 8768768;
		int i2 = (int) j;// narrowing
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(j);
		System.out.println(i2);
		System.out.println("-----------");
		
		int k = 1837;
		double d = k;
		
		System.out.println(k);
		System.out.println(d);
		
		double d2 = 12.34;
		int i3 = (int) d2;
		
		System.out.println(d2);
		System.out.println(i3);
	}
}
