package basics.equalsCheck;

public class EqualsCheck {
	public static void main(String[] args) {
		String s1 = new String("java");
		
		String s2 = new String("Java");
		
		if (s1 == s2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (s1.equals(s2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
