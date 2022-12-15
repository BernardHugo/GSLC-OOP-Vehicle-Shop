package vehicles;

import learning.*;

//Abstract class LandVehicle di wariskan lagi ke class Bus. Dengan interfacenya berupa Steer dan VehicleAge
public class Bus extends LandVehicle implements Steer, VehicleAge{
	
	// Bus mempunyai properti tambahan yaitu jumlah dek
	private int totalDeck;

	public int getTotalDeck() {
		return totalDeck;
	}
	
	public Bus(String name, String fuelType, int enginePower, int year, int totalLamp, int speed, int price,
			String brand, String color, int totalWheels, int totalDeck) {
		super(name, fuelType, enginePower, year, totalLamp, speed, price, brand, color, totalWheels);
		this.totalDeck = totalDeck;
	}

	@Override
	public String toString() {
		return "The name of the bus is: " + super.getName() + "\nThe bus's engine power is: " + super.getEnginePower() + 
				"\nThe year that the bus was made is: " + super.getYear() + "\nThe total lamp of the bus is: " + super.getTotalLamp() + 
				"\nThe bus's speed is: " + super.getSpeed() + "\nThe price of the bus is: " + super.getPrice() + 
				"\nThe brand of the bus: " + getBrand() + "\nThe color of the bus: " + getColor() + "\nThe bus has " + getTotalWheels() + 
				" wheels" + "\nThe bus has " + totalDeck + " deck/(s)";
	}
	
	/* Panggil metode abstrak dari abstract class untuk menghitung total harga mobil yang diukur 
	berdasarkan jumlah dek bus*/
	@Override
	public void calcTotalPrice() {
		double totalPrice;
		if(totalDeck == 2) {
			totalPrice = super.getPrice() + 5500000; 
		} else {
			totalPrice = super.getPrice();
		}
		System.out.println("The total price of the car is: " + totalPrice);
	}
	
	/* Panggil method dari interface Steer untuk mengetahui setiran bus diputar
	 ke arah mana dan berapa derajat*/
	@Override 
	public void turn(String direction, int degree) {
		System.out.println("The bus is turned " + degree + " degrees " + " to the " + direction);
	}
	
	/* Panggil method dari interface Steer untuk mengetahui bus memberikan lampu sen kiri 
	   atau sen kanan*/
	@Override 
	public void lampSign(int type) {
		if(type == 0) {
			System.out.println("The bus gave a left lamp sign");
		} else {
			System.out.println("The bus gave a right lamp sign");
		}
	}
	
	/* Panggil method dari interface VehicleAge untuk mengetahui apakah bus tersebut baru atau tua 
	berdasarkan tahun dibuatnya*/
	@Override
	public void newOrOld(int year) {
		if(year == 2022) {
			System.out.println("The bus is brand new");
		} else if(year >= 2012 && year < 2022) {
			System.out.println("The bus is still new");
		} else if(year < 2012 && year >= 2000) {
			System.out.println("The bus is old");
		} else if(year < 2000) {
			System.out.println("The bus is very old");
		}
	}
}