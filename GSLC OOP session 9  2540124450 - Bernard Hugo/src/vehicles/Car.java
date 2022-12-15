package vehicles;

import learning.*;

//Abstract class LandVehicle di wariskan lagi ke class Car.
public class Car extends LandVehicle implements VehicleAge, AirConditioner, Steer, Engine{
	// Mobil mempunyai properti tambahan yaitu jumlah pintu dan kekuatan AC
	private int doors, ACWatt;

	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getACWatt() {
		return ACWatt;
	}
	public void setACWatt(int aCWatt) {
		ACWatt = aCWatt;
	}
	
	public Car(String name, String fuelType, int enginePower, int year, int totalLamp, int speed, int price,
			String brand, String color, int totalWheels, int doors, int aCWatt) {
		super(name, fuelType, enginePower, year, totalLamp, speed, price, brand, color, totalWheels);
		this.doors = doors;
		ACWatt = aCWatt;
	}
	
	/* Panggil metode abstrak dari abstract class untuk menghitung total harga mobil yang diukur 
	berdasarkan warna mobilnya*/
	@Override
	public void calcTotalPrice() {
		double totalPrice;
		// Jika warna mobil yang dimasukkan adalah kuning, maka harga mobil ditambah 1650000
		// Jika warna mobil yang dimasukkan adalah biru atau merah, maka harga mobil ditambah 1450000
		// Jika warna mobil adalah selain kuning, merah, dan biru, maka harga mobil tetap
		if(getColor().equals("Yellow")) {
			totalPrice = super.getPrice() + 1650000; 
		} else if(getColor().equals("Blue") || getColor().equals("Red")){
			totalPrice = super.getPrice() + 1450000;
		} else {
			totalPrice = super.getPrice();
		}
		System.out.println("The total price of the car is: " + totalPrice);
	}
	
	@Override
	public String toString() {
		return "The name of the car is: " + super.getName() + "\nThe car's engine power is: " + super.getEnginePower() + 
				"\nThe year that the car was made is: " + super.getYear() + "\nThe total lamp of the car is: " + super.getTotalLamp() + 
				"\nThe car's speed is: " + super.getSpeed() + "\nThe price of the car is: " + super.getPrice() + 
				"\nThe brand of the car: " + getBrand() + "\nThe color of the car: " + getColor() + "\nThe car has " + getTotalWheels() + 
				" wheels" + "\nThe car has " + doors + " doors" + "\nThe AC power of the car is: " + ACWatt + " watt";
	}
	
	/* Panggil metode dari interface AirConditioner untuk mengatur suhu AC mobil*/
	@Override
	public void setTemp() {
		// Jika suhu AC kurang dari sama dengan 18 maka suhunya sangat dingin.
		// Jika suhunya diantara 18 dan 23 maka suhunya masih dingin.
		// Jika suhu AC lebih dari 23 maka suhunya panas.
		if(getACWatt() <= 18) {
			System.out.println("The AC temperature is very cold");
		} else if(getACWatt() > 18 && getACWatt() <= 23) {
			System.out.println("The AC temperature is cold");
		} else if(getACWatt() > 23) {
			System.out.println("The AC temperature is hot");
		}
	}
	
	/* Panggil metode dari interface AirConditioner untuk mengetahui mobil tersebut mengubah mode AC*/
	@Override
	public void changeMod(int mod) {
		if(mod == 0) {
			System.out.println("The AC mode is normal");
		} else if(mod == 1) {
			System.out.println("The AC is change into fan mode");
		} else if(mod == 2) {
			System.out.println("The AC is change into auto mode");
		}
	}
	
	/* Panggil method dari interface Steer untuk mengetahui setiran mobil tersebut diputar
	 ke arah mana dan berapa derajat*/
	@Override
	public void turn(String direction, int degree) {
		System.out.println("The car's steering wheel is turned " + degree + " degrees " + " to the " + direction);
	}
	
	/* Panggil method dari interface Steer untuk mengetahui mobil tersebut memberikan lampu sen kiri 
	   atau sen kanan*/
	@Override
	public void lampSign(int type) {
		if(type == 0) {
			System.out.println("The car gave a left lamp sign");
		} else {
			System.out.println("The car gave a right lamp sign");
		}
	}
	
	/* Panggil method dari interface VehicleAge untuk mengetahui apakah mobil tersebut baru atau tua 
	berdasarkan tahun pembuatannya*/
	@Override
	public void newOrOld(int year) {
		if(year == 2022) {
			System.out.println("The car is brand new");
		} else if(year >= 2012 && year < 2022) {
			System.out.println("The car is still new");
		} else if(year < 2012 && year > 2000) {
			System.out.println("The car is old");
		} else if(year <= 2000) {
			System.out.println("The car is very old");
		}
	}
	
	/* Panggil method dari interface Steer untuk mengganti gigi mobil*/
	@Override
	public void changeGear() {
		System.out.println("The car switched it's gear");
	}
}