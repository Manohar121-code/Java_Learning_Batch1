package basics.patternProgramming;

import java.util.Scanner;

//1 2 3 4 5
//6 7 8 9 10
//11 12 13 14 15
//16 17 18 19 20
//21 22 23 24 25

public class Pattern5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = ((i-1) * 5) + 1; j <= i * 5; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		Scanner scr = new Scanner(System.in);
		System.out.println("enter number : ");
		int n = scr.nextInt();
		do {
			int k = 1;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.print(k++ +" ");
				}
				System.out.println();
			}
			System.out.println("enter number : ");
			n = scr.nextInt();
		} while (n > 0);
	}
}
