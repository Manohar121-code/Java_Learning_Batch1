package oops.composition;

public class Address {
	private int houseNum;
	private String country;

	public Address(int houseNum, String country) {
		super();
		this.houseNum = houseNum;
		this.country = country;
	}

	public int getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [houseNum=" + houseNum + ", country=" + country + "]";
	}

}
