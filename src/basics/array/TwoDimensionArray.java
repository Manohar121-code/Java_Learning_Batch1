package basics.array;

public class TwoDimensionArray {
	public static void main(String[] args) {
		int rows = 3;
		int cols = 3;
		int z = 3;
		int[][][] arr = new int[rows][cols][z];
		
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30;
//		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
		System.out.println("-----------------");
		int val = 10;
		//initialize the array
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				for (int k = 0; k < z; k++) {
					arr[i][j][k] = val++;
					printArray(arr, rows, cols, z);
					System.out.println("---------------------");
				}
			}
		}
		
	}
	
	public static void printArray(int[][][] arr, int rows, int cols, int z) {
		//print the values
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				for (int k = 0; k < z; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
