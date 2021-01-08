package basics.programs;

public class ArmstrongNumber {
	public static void main(String[] args) {
//		int n = 153;
//		boolean check = checkArmstrongNumber(n);
//		System.out.println(n + " -> " + check);
		System.out.println("--");
		int start = 1;
		int end = 1000000;
		for (int i = start; i <= end; i++) {
			if (checkArmstrongNumber(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean checkArmstrongNumber(int n) {
		int temp = n;
		long result = 0;
		
		//to get the length
		//OPTION1
		String s = String.valueOf(n);
		int len = s.length();
		
		//OPTION2
		int temp2 = n;
		int length = 0;
		while(temp2 > 0) {
			temp2 = temp2 / 10;
			length++;
		}
		
		while(n > 0) {
			int lastDigit = n % 10;
			long mul = (long) Math.pow(lastDigit, length);
			result = result + mul;
			n = n / 10;
		}
		return result == temp;
	}
	
	public static int getPower(int n, int pow) {
		return 0;
	}
}
