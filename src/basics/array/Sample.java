package basics.array;

public class Sample {
	public static void main(String[] args) {
		int[] intArr = new int[5];
//		int[] arr = {10, 20, 30, 40, 50};
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		intArr[3] = 40;
		intArr[4] = 50;
		
		int third = intArr[3];
		System.out.println(third);
		System.out.println("---------------");
		for (int j = 0; j <= intArr.length - 1; j++) {
			System.out.println(intArr[j]);
		}
	}
}
