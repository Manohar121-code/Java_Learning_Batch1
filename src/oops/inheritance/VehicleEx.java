package oops.inheritance;

public class VehicleEx {
	public static void main(String[] args) {
		Car ferrari = new Car(007, "Ferrari");
		ferrari.setNumOfWheels(4);
		ferrari.setVehicleType("Car");
		
		String brand = ferrari.getBrand();
		int modelNum = ferrari.getModelNum();
		int numOfWheels = ferrari.getNumOfWheels();
		String vehicleType = ferrari.getVehicleType();
		
		System.out.println("Brand - "+brand);
		System.out.println("Model - "+modelNum);
		System.out.println("Number of wheels - "+numOfWheels);
		System.out.println("Type of vehicle - "+vehicleType);
		
		ferrari.runMe();
		System.out.println("---------------------------------------");
		Lorry benz = new Lorry(1000);
		benz.setNumOfWheels(20);
		benz.setVehicleType("Lorry");
		benz.runMe();
		
		System.out.println("-----------------------------");
		SuperCar superCarObj = new SuperCar(1500);
		superCarObj.setBrand("Buggatti");
		superCarObj.setModelNum(7576);
		superCarObj.setNumOfWheels(4);
		superCarObj.setVehicleType("Super car");
		
		System.out.println(superCarObj.getBrand());
		System.out.println(superCarObj.getCc());
		System.out.println(superCarObj.getModelNum());
		System.out.println(superCarObj.getNumOfWheels());
		System.out.println(superCarObj.getVehicleType());
		superCarObj.runMe();
	}
}
