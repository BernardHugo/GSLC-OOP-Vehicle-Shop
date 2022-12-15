package vehicles;

// Kendaraan (Vehicle) diturunkan lagi ke abstract class LandVehicle(kendaraan darat)
public abstract class LandVehicle extends Vehicle {

	/* Selain properti dari abstract class Vehicle, LandVehicle juga mempunyai properti lain
	  yaitu merek, warna, dan jumlah roda*/
	private String brand, color;
	private int totalWheels;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getTotalWheels() {
		return totalWheels;
	}
	public void setTotalWheels(int totalWheels) {
		this.totalWheels = totalWheels;
	}
	public LandVehicle(String name, String fuelType, int enginePower, int year, int totalLamp,
			int speed, int price, String brand, String color, int totalWheels) {
		super(name, fuelType, enginePower, year, totalLamp, speed, price);
		this.brand = brand;
		this.color = color;
		this.totalWheels = totalWheels;
	}
}