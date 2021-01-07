package basics.programs;

import java.util.Scanner;

public class FactorialEx {
	public static void main(String[] args) {
		System.out.println("enter a number: ");
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int factorial = getFactorial(n);
		System.out.println("factorial is - "+ factorial);
		System.out.println("------------");
		int factorial2 = getFactorialByRecursion(n);
		System.out.println("factorial is - "+ factorial2);
	}

	private static int getFactorialByRecursion(int n) {
		if (n == 0) {
			return 1;
		}
		return n * getFactorialByRecursion(n - 1);
	}

	private static int getFactorial(int n) {
		int factorial = 1;
		for (int i = n; i >= 1; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
