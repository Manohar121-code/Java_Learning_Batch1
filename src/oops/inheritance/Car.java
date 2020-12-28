package oops.inheritance;

public class Car extends Vehicle {
	private int modelNum;
	private String brand;

	public Car() {
		super();
	}

	public Car(int modelNum, String brand) {
		super();
		this.modelNum = modelNum;
		this.brand = brand;
	}

	public int getModelNum() {
		return modelNum;
	}

	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car [modelNum=" + modelNum + ", brand=" + brand + "]";
	}
	
}
