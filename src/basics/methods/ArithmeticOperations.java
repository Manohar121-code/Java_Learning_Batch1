package basics.methods;

public class ArithmeticOperations {
	public static void main(String[] args) {
		int i = 10;
		int j = 4;
		int sum = sum(i, j);
		System.out.println("sum is - "+sum);
		
		int substract = substract(i, j);
		System.out.println("sub is - "+substract);
		
		int multiply = multiply(i, j);
		System.out.println("multiply is - "+multiply);
		
		int division = division(i, j);
		System.out.println("div is - "+division);
	}

	public static int sum(int i, int j) {
		int sum = i + j;
		return sum;
	}
	
	public static int substract(int i, int j) {
		int sub = i - j;
		return sub;
	}
	
	public static int multiply(int i, int j) {
		int mul = i * j;
		return mul;
	}
	
	public static int division(int i, int j) {
		int div = i / j;
		return div;
	}
}
