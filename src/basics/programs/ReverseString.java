package basics.programs;

public class ReverseString {
	public static void main(String[] args) {
		String s = "java";
		String reverse = reverseString(s);
		System.out.println(reverse);
	}

	private static String reverseString(String s) {
		String rev = "";
		for (int i = s.length()-1; i >= 0; i--) {
			char ch = s.charAt(i);
			rev = rev+ch;
		}
		return rev;
	}
}
