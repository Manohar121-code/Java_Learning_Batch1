package basics.string;

public class Sample {
	public static void main(String[] args) {
		char ch1 = 'j';
		char ch2 = 'a';
		char ch3 = 'v';
		char ch4 = 'a';
		
		char[] charArray = new char[4];
		charArray[0] = 'j';
		charArray[1] = 'a';
		charArray[2] = 'v';
		charArray[3] = 'a';
		
		String s = "java is a robust language";
		char[] arrFromString = s.toCharArray();
		for (int i = 0; i <= arrFromString.length - 1; i++) {
//			System.out.println(arrFromString[i]);
		}
		
		int length = s.length();
		System.out.println(length);
		
		char ch = s.charAt(2);
		System.out.println(ch);
		
		int indexOf = s.indexOf('a');
		System.out.println("--- "+indexOf);
		
		int indexOf2 = s.indexOf('a', indexOf+1);
		System.out.println(indexOf2);
		
		int lastIndexOf = s.lastIndexOf('a');
		System.out.println(lastIndexOf);
		
		String substring1 = s.substring(5);
		System.out.println(substring1);
		
		String substring2 = s.substring(5, 12);
		System.out.println(substring2);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = upperCase.toLowerCase();
		System.out.println(lowerCase);
		
		String replace = s.replace('a', 'z');
		System.out.println(replace);
		
	}
}
