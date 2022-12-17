package vehicles;

import learning.*;

public class Ship extends Vehicle implements Bagage, VehicleAge, Engine{
	
	// Kapal mempunyai properti tambahan yaitu jumlah baling-baling
	private int totalPropeller;

	public int getTotalPropeller() {
		return totalPropeller;
	}

	public Ship(String name, String fuelType, int enginePower, int year, int totalLamp, int speed,
			int price, int totalPropeller) {
		super(name, fuelType, enginePower, year, totalLamp, speed, price);
		this.totalPropeller = totalPropeller;
	}
	
	@Override
	public String toString() {
		return "The name of the motorcycle is: " + super.getName() + "\nThe motorcycle's engine power is: " + super.getEnginePower() + 
				"\nThe year that the motorcycle was made is: " + super.getYear() + "\nThe total lamp of the motorcycle is: " + super.getTotalLamp() + 
				"\nThe motorcycle's speed is: " + super.getSpeed() + "\nThe price of the motorcycle is: " + super.getPrice() + 
				"\nTotal propeller of the ship is: " + getTotalPropeller();
	}
	
	@Override
	public void placeBagage() {
		System.out.println("The bagage of the ship is added");
	}
	
	@Override
	public void removeBagage() {
		System.out.println("The bagage of the ship is removed");
	}
	
	/* Panggil metode abstrak dari abstract class untuk menghitung total harga kapal yang diukur 
	berdasarkan banyaknya baling-baling yang dimiliki kapal*/
	@Override
	public void calcTotalPrice() {
		double totalPrice;
		// Jika jumlah baling-baling yang dimiliki kapal ada 2, maka harga pesawat ditambah 20500000
		// Jika jumlah tbaling-baling yang dimiliki kapal ada 1, maka harga kapal tetap
		if(getTotalPropeller() == 2) {
			totalPrice = super.getPrice() + 20500000; 
		} else {
			totalPrice = super.getPrice();
		}
		System.out.println("The total price of the ship is: " + totalPrice);
	}
	
	@Override
	public void newOrOld(int year) {
		if(year == 2022) {
			System.out.println("The ship is brand new");
		} else if(year >= 2010 && year < 2022) {
			System.out.println("The ship is new");
		} else if(year < 2010 && year >= 2000) {
			System.out.println("The ship is old");
		} else if(year < 2000) {
			System.out.println("The ship is very old");
		}
	}
	
	/* Panggil method dari interface Steer untuk mengganti gigi kapal*/
	@Override
	public void changeGear() {
		System.out.println("The ship switched it's gear");
	}
}