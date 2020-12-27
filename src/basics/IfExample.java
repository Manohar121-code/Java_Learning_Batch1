package basics;

public class IfExample {
	/**
	 * ==
	 * !=
	 * <
	 * >
	 * <=
	 * >=
	 */
	
	public static void main(String[] args) {
		System.out.println("main started");
		int i = 10;
		if(i != 11) {
			System.out.println("inside of if condition");
		}
		System.out.println("----------------");
		
		int age = 14;
		if (age > 18) {
			System.out.println("eligible for vote");
		} else {
			System.out.println("not eligible for vote");
		}
		
		System.out.println("----------------");
		
		int k = 10;
		if (k > 10) {
			System.out.println("number is > 10");
		} else if (k < 10) {
			System.out.println("number is < 10");
		} else {
			System.out.println("number is == 10");
		}
		
		System.out.println("----------------");
		
		int z = 35;
		if (z < 25 || z < 45) {
			System.out.println("OR - check multiple conditions");
		}
		
		if (z > 25 && z == 35) {
			System.out.println("AND - check multiple conditions");
		}
		
		System.out.println("----------------");
		
		if (z >= 25 && (z != 35 || z != 0)) {
			System.out.println("multi check");
		}
		
		if (z == 9 || (z == 20 && z > 65) || z <= 44) {
			System.out.println("multiple check example");
		}
		
		System.out.println("main ended");
	}
}
