package basics.methods;

public class MethodsWithReturnTypes {
	public static void main(String[] args) {
		System.out.println("main() called!!!");
		int i = getValue();
		System.out.println("returned value - " + i);
		
		String s = getStringValue("java");
		System.out.println(s);
		System.out.println("main() ended!!!");
	}
	
	public static int getValue() {
		int i = 10;
		return i;
	}
	
	public static String getStringValue(String name) {
		return "Hello " + name;
	}
}
