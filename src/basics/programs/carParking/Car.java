package basics.programs.carParking;

public class Car {
	private String carNum;
	private int driverNumber;
	
	public static int count = 0;

	public Car(String carNum, int driverNumber) {
		super();
		this.carNum = carNum;
		this.driverNumber = driverNumber;
	}
	
	public void parkTheCar() {
		count++;
	}
	
	public static void printCarCount() {
		System.out.println(count);
	}

}
