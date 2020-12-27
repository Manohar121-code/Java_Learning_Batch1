package basics;

public class IncrementDecrement {
	public static void main(String[] args) {
//		++i;
//		i++;
//		--i;
//		i--;
		int i = 5;
		int j = i+1;
		System.out.println(i++);
		System.out.println("---"+i);
		if (--i == 5) {
			System.out.println("if condition");
			System.out.println(i);
		}
		System.out.println("----------------------------------");
		int k = 6;
		int m = 8;
		if (++k == --m) {
			System.out.println("true");
		}
		System.out.println("----------------------");
		
		int w = 10;
		w += 2;
		System.out.println(w++);
		System.out.println(w); // 13
		w -= 2;
		System.out.println(w);// 11
		w *= 2;
		System.out.println(w); // 22
		w /= 2;
		System.out.println(w);
		System.out.println("----------------------");
		int e = 13 / 2;//6
		int p = 13 % 2;//0
		System.out.println(e);
		System.out.println(p);
		
		
		int n = 72;
		if ((n % 2) == 0) {
			System.out.println(n + " is even");
		} else {
			System.out.println(n + " is odd");
		}
		
	}
}
