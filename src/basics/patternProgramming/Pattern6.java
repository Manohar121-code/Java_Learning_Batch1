package basics.patternProgramming;

//      1
//    1 2 3
//  1 2 3 4 5
//1 2 3 4 5 6 7 
public class Pattern6 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("  ");
			}
			
			for (int j = 1; j <= (2 * i) -1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
