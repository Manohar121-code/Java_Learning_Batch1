package basics.programs.carParking;

public class ParkingMain {
	public static void main(String[] args) {
		Car.printCarCount();
		Car c1 = new Car("sjehr89989", 7879879);
		c1.parkTheCar();
		Car.printCarCount();
		
		Car c2 = new Car("sjehr89989", 7879879);
		c2.parkTheCar();
		
		Car c3 = new Car("sjehr89989", 7879879);
		c3.parkTheCar();
		Car.printCarCount();
		
	}
}
