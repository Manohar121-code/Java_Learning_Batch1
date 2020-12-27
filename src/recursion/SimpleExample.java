package recursion;

public class SimpleExample {
	public static void main(String[] args) {
		SimpleExample obj = new SimpleExample();
		obj.doRecursion(10);
		System.out.println();
		obj.doRecursionEvenNumbers(1, 25);
		System.out.println();
		obj.doRecursionPrimeNumbers(-3, 50);
	}
	
	private void doRecursionPrimeNumbers(int i, int limit) {
		if (i >= limit) {
			return;
		}
		if (isPrimeNumber(i)) {
			System.out.print(i + " ");
		}
		doRecursionPrimeNumbers(i+1, limit);
	}

	private boolean isPrimeNumber(int i) {
		if (i <= 1) {
			return false;
		}
		for (int j = 2; j <= i/2; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

	private void doRecursionEvenNumbers(int i, int limit) {
		if (i >= limit) {
			return;
		}
		if (i % 2 != 0) {
			System.out.print(i + " ");
		}
		doRecursionEvenNumbers(i+1, limit);
	}

	public void doRecursion(int i) {
		if (i <= 0) {
			return;
		}
		
		System.out.print(i + " ");
		doRecursion(i-1);
	}
}
