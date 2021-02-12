package basics.programs;

public class StringConversion {
	public static void main(String[] args) {
		String s = "true - ";
		
		int parseInt = Integer.parseInt(s);
//		
//		long parseLong = Long.parseLong(s);
		
		boolean parseBoolean = Boolean.parseBoolean(s);
		System.out.println(parseBoolean);
		
	}
}
