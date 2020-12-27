package basics;

public class BreakContinue {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i == 3) {
				break;
			}
		}
		System.out.println("------------------");
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("---------------");
		outer:
		for (int i = 1; i <= 5; i++) {
			inner:
			for (int j = 1; j <= 5; j++) {
				System.out.print(j+" ");
				if (i == 3 && j == 3) {
					System.out.println();
					continue outer;
				}
			}
			System.out.println();
		}
	}
}
