package vehicles;

public abstract class Vehicle {
	private String name, fuelType;
	private int EnginePower, year, totalLamp, speed, price;
	
	// method yang akan digunakan untuk menampilkan data-data dari properti kendaraan yang sudah di isi
	public abstract String toString();
	
	// method yang akan digunakan untuk menampilkan total harga akhir dari sebuah kendaraan
	public abstract void calcTotalPrice();
	
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getEnginePower() {
		return EnginePower;
	}
	public void setEnginePower(int enginePower) {
		EnginePower = enginePower;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTotalLamp() {
		return totalLamp;
	}
	public void setTotalLamp(int totalLamp) {
		this.totalLamp = totalLamp;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicle(String name, String fuelType, int enginePower, int year, int totalLamp,
			int speed, int price) {
		super();
		this.name = name;
		this.fuelType = fuelType;
		EnginePower = enginePower;
		this.year = year;
		this.totalLamp = totalLamp;
		this.speed = speed;
		this.price = price;
	}
}