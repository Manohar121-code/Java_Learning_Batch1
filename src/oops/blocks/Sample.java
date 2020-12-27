package oops.blocks;

public class Sample {
	
	static {
		System.out.println("static block called!!!");
	}
	
	{
		System.out.println("non static block called!!!");
	}

	public Sample() {
		System.out.println("Sample constructor called!!!");
	}
}
