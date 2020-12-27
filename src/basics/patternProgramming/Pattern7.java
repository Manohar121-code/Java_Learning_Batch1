package basics.patternProgramming;

import java.util.Scanner;

//
//     *// i = 1; n = 6; spaces = 5; starts = 1
//    ***// i = 2; n = 6; spaces = 4; starts = 3
//   *****// i = 3; n = 6; spaces = 3; starts = 5
//  *******// i = 4; n = 6; spaces = 2; starts = 7
// *********// i = 5; n = 6; spaces = 1; starts = 9
//***********// i = 6; n = 6; spaces = 0; starts = 11
// *********//i = 1;n=5; spaces = 1; stars=9 9 - 0
//  *******//i = 2;n=5; spaces = 2; stars=7  8 - 1
//   *****//i = 3;n=5; spaces = 3; stars=5   7 - 2   ((2*n) - i) - (i-1)
//    ***//i = 4;n=5; spaces = 4; stars=3    6 - 3
//     *//i = 5;n=5; spaces = 5; stars=1     5 - 4
public class Pattern7 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the length: ");
		int n = scr.nextInt();
		do {
			for (int i = 1; i <= n; i++) {
				for (int j = i; j < n; j++) {
					System.out.print(" ");
				}
				
				for (int j = 1; j <= (2 * i) -1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			n--;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(" ");
				}
				
				for (int j = 1; j <= ((2*n) - i) - (i-1); j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("enter the length: ");
			n = scr.nextInt();
		} while (n > 0);
		scr.close();
	}
}
