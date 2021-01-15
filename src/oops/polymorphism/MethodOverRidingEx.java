package oops.polymorphism;

import java.util.Scanner;

public class MethodOverRidingEx {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("main started");
		Child c1 = new Child();
		c1.test();
		c1.test2();
		c1.test4();
		c1.test5();
		
		
		int n = new Scanner(System.in).nextInt();
		
		if (1 <= n && n <= 10) {
			System.out.println("if");
		} else {
			System.out.println("else");
		}
		
		System.out.println("main ended");
	}
}
