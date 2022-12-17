package vehicles;

import learning.Wing;
import learning.*;

public class Plane extends Vehicle implements Wing, VehicleAge, Bagage {
	// Pesawat mempunyai properti tambahan yaitu jumlah turbin dan tipe pesawat
	private int totalTurbine;
	private String type;
	
	public int getTotalTurbine() {
		return totalTurbine;
	}

	public void setTotalTurbine(int totalTurbine) {
		this.totalTurbine = totalTurbine;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Plane(String name, String fuelType, int enginePower, int year, int totalLamp, int speed, int price,
			int totalTurbine, String type) {
		super(name, fuelType, enginePower, year, totalLamp, speed, price);
		this.totalTurbine = totalTurbine;
		this.type = type;
	}

	@Override 
	public void changeAlt(int feet) {
		// Jika ketinggian kaki pesawat lebih dari 4000, maka ketinggian pesawat sangat tinggi
		// Jika ketinggian kaki pesawat diantara 3001 dan 3999, maka ketinggian pesawat cukup tinggi
		// Jika ketinggian kaki pesawat diantara 2500 dan 30000, maka ketinggian pesawat sedang
		// Jika ketinggian kaki pesawat kurang dari 2500, maka ketinggian pesawat rendah
		if(feet > 40000) {
			System.out.println("The plane's altitude is very high");
		} else if(feet > 30000 && feet < 40000) {
			System.out.println("The plane's altitude is high enough");
		} else if(feet == 25000 && feet <= 30000) {
			System.out.println("The plane's altitude is medium");
		} else if(feet < 25000) {
			System.out.println("The plane's altitude is low");
		}
	}
	
	@Override
	public void rettain() {
		System.out.println("The plane rettain it's altitude");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The name of the plane is: " + super.getName() + "\nThe plane's engine power is: " + super.getEnginePower() + 
				"\nThe year that the plane was made is: " + super.getYear() + "\nThe total lamp of the plane is: " + super.getTotalLamp() + 
				"\nThe plane's speed is: " + super.getSpeed() + "\nThe price of the plane is: " + super.getPrice() + 
				"\nThe plane has: " + totalTurbine + " turbines" + "\nThe type of the plane is: " + type;
	}
	
	/* Panggil metode abstrak dari abstract class untuk menghitung total harga pesawat yang diukur 
	berdasarkan banyak turbin yang dimiliki pesawat*/
	@Override
	public void calcTotalPrice() {
		double totalPrice;
		// Jika jumlah turbin yang dimiliki pesawat ada 4, maka harga pesawat ditambah 36000000
		// Jika jumlah turbin yang dimiliki pesawat ada 2, maka harga pesawat tetap
		if(getTotalTurbine() == 4) {
			totalPrice = super.getPrice() + 36000000; 
		} else {
			totalPrice = super.getPrice();
		} 
		System.out.println("The total price of the car is: " + totalPrice);
	}
	
	@Override
	public void newOrOld(int year) {
		if(year >= 2012 && year < 2022) {
			System.out.println("The plane is new");
		} else if(year < 2012 && year >= 2000) {
			System.out.println("The plane is old");
		} else if(year < 2000) {
			System.out.println("The plane is very old");
		}
	}
	
	@Override
	public void placeBagage() {
		System.out.println("The bagage of the plane is added");
	}
	
	@Override
	public void removeBagage() {
		System.out.println("The bagage of the plane is removed");
	}
}