package oops.inheritance;

public class Lorry extends Vehicle {
	private int capacity;

	public Lorry(int capacity) {
		super();
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Lorry [capacity=" + capacity + "]";
	}

}
