package oops.inheritance;

public class SuperCar extends Car {
	private int cc;

	public SuperCar(int cc) {
		super();
		System.out.println("super car constructor called!!!");
		this.cc = cc;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "SuperCar [cc=" + cc + "]";
	}

}
