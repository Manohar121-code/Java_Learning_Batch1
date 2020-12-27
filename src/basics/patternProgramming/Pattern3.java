package basics.patternProgramming;


//1
//12
//123
//1234
//12345
public class Pattern3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if (j > i) {
					continue;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
