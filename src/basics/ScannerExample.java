package basics;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("please enter age:");
		int i = scr.nextInt();
		System.out.println("entered age value - "+i);
		if (i > 18) {
			System.out.println("eligible for vote");
		} else {
			System.out.println("not eligible for vote");
		}
	}
}
