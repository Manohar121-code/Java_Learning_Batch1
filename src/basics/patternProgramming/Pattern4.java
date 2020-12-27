package basics.patternProgramming;

//54321    i = 1
//5432     i = 2
//543      i = 3
//54       i = 4
//5        i = 5
public class Pattern4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
