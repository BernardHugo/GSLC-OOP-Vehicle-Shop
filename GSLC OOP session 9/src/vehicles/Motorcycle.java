package vehicles;

import learning.*;

// Abstract class LandVehicle di wariskan ke class Motorcycle.
public class Motorcycle extends LandVehicle implements Steer, VehicleAge{
	
	public Motorcycle(String name, String fuelType, int enginePower, int year, int totalLamp, int speed, int price,
			String brand, String color, int totalWheels) {
		super(name, fuelType, enginePower, year, totalLamp, speed, price, brand, color, totalWheels);
	}

	/* Panggil method dari interface Steer untuk mengetahui motor tersebut diputar
	 ke arah mana dan berapa derajat*/
	@Override 
	public void turn(String direction, int degree) {
		System.out.println("The motorcycle steering wheel is turned " + degree + " degrees " + " to the " + direction);
	}
	
	/* Panggil method dari interface Steer untuk mengetahui motor tersebut memberikan lampu sen kiri atau kanan*/
	@Override 
	public void lampSign(int type) {
		if(type == 0) {
			System.out.println("The motorcycle gave a left lamp sign");
		} else {
			System.out.println("The motorcycle gave a right lamp sign");
		}
	}
	
	@Override
	public String toString() {
		return "The name of the motorcycle is: " + super.getName() + "\nThe motorcycle's engine power is: " + super.getEnginePower() + 
				"\nThe year that the motorcycle was made is: " + super.getYear() + "\nThe total lamp of the motorcycle is: " + super.getTotalLamp() + 
				"\nThe motorcycle's speed is: " + super.getSpeed() + "\nThe price of the motorcycle is: " + super.getPrice() + 
				"\nThe brand of the motorcycle is: " + getBrand() + "\nThe color of the motorcycle is: " + getColor();
	}
	
	/* Panggil metode abstrak dari abstract class untuk menghitung total harga motor yang diukur 
	berdasarkan warna motornya*/
	@Override
	public void calcTotalPrice() {
		double totalPrice;
		if(getColor() == "Green") {
			totalPrice = super.getPrice() + 130000; 
		} else if(getColor() == "Blue"){
			totalPrice = super.getPrice() + 120000;
		} else {
			totalPrice = super.getPrice();
		}
		System.out.println("The total price of the motorcycle is: " + totalPrice);
	}
	
	/* Panggil metode abstrak dari interface untuk mengetahui apakah motor tersebut baru atau tua 
	berdasarkan tahun pembuatannya*/
	@Override
	public void newOrOld(int year) {
		if(year == 2022) {
			System.out.println("The motorcycle is brand new");
		} else if(year >= 2012 && year < 2022) {
			System.out.println("The motorcycle is still new");
		} else if(year < 2012 && year > 2000) {
			System.out.println("The motorcycle is old");
		} else if(year <= 2000) {
			System.out.println("The motorcycle is very old");
		}
	}
}
