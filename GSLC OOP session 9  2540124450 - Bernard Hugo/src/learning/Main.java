package learning;

import java.util.ArrayList;
import java.util.Scanner;

import vehicles.*;

/*
 Program ini berfungsi untuk mengisi data-data properti-properti sebuah kendaraan berdasarkan tipe kendaraaannya.
 Setelah itu, menampilkan data-data yang sudah diisi tersebut. Program ini juga bisa digunakan untuk menampilkan
 total harga akhir dari sebuah kendaraan. Selain itu, bisa menampilkan metode-metode dari beberapa interface yang
 disesuaikan berdasarkan tipe kendaraan.  
 */

public class Main {
	private static Scanner scan = new Scanner(System.in);
	
	// Buat array list untuk menyimpan data-data yang akan dimasukkan
	private static ArrayList<Vehicle> vehList = new ArrayList<>();
	private static ArrayList<LandVehicle> landVehList = new ArrayList<>();
	
	// Deklarasikan variabel-variabel untuk disimpan ke dalam array list
	String type, name, fuel, Color, Brand, planeType;
	int year, lamp, engine, speed, Wheels;
	int door, deck, AC, turbine, prop, price;
	
	// Function kasus pertama untuk memasukkan data-data pada properti-properti sebuah kendaran
	private void case1() {
		
		System.out.print("Input what is the name of the vehicle: ");
		name = scan.nextLine();
		
 		System.out.print("Input when the vehicle was built: ");
		year = scan.nextInt();
		
		System.out.print("Input what is the vehicle's fuel type: ");
		fuel = scan.next();
		
		System.out.print("Input what is the power of the vehicle's engine: ");
		engine = scan.nextInt();
		
		System.out.print("Input what is the speed of the vehicle : ");
		speed = scan.nextInt();
		
		// Jumlah lampu saya buat batas maksimalnya adalah 10 karena pesawat memiliki banyak lampu pada badan maupun sayapnya
		do {
			System.out.print("Input the total lamp of the vehicle: ");
			lamp = scan.nextInt();
		}while(lamp > 10);
		
		System.out.print("Input the price of the vehicle: Rp ");
		price = scan.nextInt();
		
		System.out.print("Input type of vehicle: ");
		type = scan.next();
		
		// Jika tipe kendaraan yang di-input adalah mobil (Car)
		if(type.equals("Car")) {
			
			System.out.print("Input the car's color: ");
			Color = scan.next();
			
			System.out.print("What is the brand of the car: ");
			Brand = scan.next();
			
			// Beberapa mobil bisa memiliki 2 pintu atau 4 pintu. Tetapi rata2 mobil mempunyai 4 pintu
			do {
				System.out.print("Input the car's total door: ");
				door = scan.nextInt();
			} while(door != 2 && door != 4);
			
			System.out.print("Input the car's AC power: ");
			AC = scan.nextInt();
			
			landVehList.add(new Car(name, fuel, engine, year, lamp, speed, price, Brand, Color, 
					4, door, AC));
			System.out.println("A new car has been added to the vehicle list");
		}
		
		// Jika tipe kendaraan yang di-input adalah motor (Motorcycle)
		else if(type.equals("Motorcycle")) {
			System.out.print("Input how many wheels the motorcycle has: ");
			Wheels = scan.nextInt();
			
			System.out.print("Input the motorcycle's color: ");
			Color = scan.next();
			
			System.out.print("What is the brand of the motorcycle: ");
			Brand = scan.next();
			
			landVehList.add(new Motorcycle(name, fuel, engine, year, lamp, speed, price, Brand, Color, 2));
			System.out.println("A new motorcycle has been added to the vehicle list");
		}
		
		// Jika tipe kendaraan yang di-input adalah pesawat (Plane)
		else if(type.equals("Plane")) {
			// Beberapa pesawat bisa memiliki 2 turbin atau 4 turbin
			do {
				System.out.print("Input the total turbine of the plane: ");
				turbine = scan.nextInt();
			}while(turbine != 2 || turbine != 4);
			
			System.out.print("What is the type of the plane: ");
			planeType = scan.nextLine();
			
			vehList.add(new Plane(name, fuel, engine, year, lamp, speed, price, turbine, planeType));
			System.out.println("A new plane has been added to the vehicle list");
		} 
		
		// Jika tipe kendaraan yang di-input adalah bus (Bus)
		else if(type.equals("Bus")) {
			// Bus ada juga yang memiliki 6 roda
			do {
				System.out.print("Input how many wheels the motorcycle has: ");
				Wheels = scan.nextInt();
			}while(Wheels != 4 || Wheels != 6);
			
			System.out.print("Input the bus color: ");
			Color = scan.next();
			
			System.out.print("What is the brand of the bus: ");
			Brand = scan.next();
			
			// Selain satu tingkat, ada juga bus yang dua tingkat
			do {
				System.out.print("Input how many deck the bus has: ");
				deck = scan.nextInt();
			}while(deck != 1 || deck != 2);
			
			landVehList.add(new Bus(name, fuel, engine, year, lamp, speed, price, Brand, Color, 
					Wheels, deck));
			System.out.println("A new bus has been added to the vehicle list");
		} 
		
		// Jika tipe kendaraan yang di-input adalah kapal (Ship)
		else if(type.equals("Ship")) {
			// Kapal ada yang memiliki 1 baling-baling, tapi ada juga yang memiliki 2 baling-baling
			do {
				System.out.print("Input how many propeller the ship has: ");
				prop = scan.nextInt();
			}while(prop != 1 || prop != 2);
			
			vehList.add(new Ship(name, fuel, engine, year, lamp, speed, price, prop));
			System.out.println("A new ship has been added to the vehicle list");
		} 
	}
	
	// Function main
	public Main() {
		int menu;
		
		// Membuat objek dari masing-masing subclass Vehicle 
		Car car1 = new Car(name, fuel, engine, year, lamp, speed, price, Brand, Color, 4, door, AC);
		Motorcycle motor1 = new Motorcycle(name, fuel, engine, year, lamp, speed, price, Brand, Color, 2);
		Bus bus1 = new Bus(name, fuel, engine, year, lamp, speed, price, Brand, Color, Wheels, deck);
		Plane plane1 = new Plane(name, fuel, engine, year, lamp, speed, price, turbine, planeType);
		Ship ship1 = new Ship(name, fuel, engine, year, lamp, speed, price, prop);
		
		/* Daftar menu untuk memilih berbagai jenis menu*/
		
		while(true) {
			// menampilkan menu-menu untuk melakukan operasi
			System.out.println("==============");
			System.out.println("Vehicle store");
			System.out.println("==============");
			System.out.println("1.Add vehicle"); // Memasukkan data-data properti kendaraan
			System.out.println("2.View vehicle"); // Menampilkan kendaraan beserta properti-propertinya
			System.out.println("3.View total price"); // Menampilkan total harga sebuah kendaraan
			System.out.println("4.View interfaces"); // Melihat interface-interface yang berhubungan dengan suatu kendaraan berdasarkan tipe kendaraannya
			System.out.println("5.Exit"); // Menutup sebuah program
			System.out.print("Input menu: "); // Memasukkan angka menu
			menu = scan.nextInt();
			scan.nextLine();
			
			switch(menu) {
				/* kondisi jika memilih menu 1, yaitu mengisi data-data properti berdasarkan tipe kendaraan 
				   yang di input */
				case 1:{
					case1();
					break;
				}
				// kondisi jika memilih menu 2, yaitu menampilkan isi dari vehicle list 
				case 2:{
					try {
						if(type.equals("Car") || type.equals("Motorcycle") || type.equals("Bus")) {
							System.out.println(landVehList.toString());
						} else if(type.equals("Plane") || type.equals("Ship")) {
							System.out.println(vehList.toString());
						} 
					}catch(Exception E) {}
					break;
				}
				// kondisi jika memilih menu 3 yaitu menghitung total harga berdasarkan tipe kendaraan
				// yang di input
				case 3:{
					if(type.equals("Car")) {
						car1.calcTotalPrice();
					} else if(type.equals("Motorcycle")) {
						motor1.calcTotalPrice();
					} else if(type.equals("Bus")) {
						bus1.calcTotalPrice();
					} else if(type.equals("Plane")) {
						plane1.calcTotalPrice();
					} else if(type.equals("Ship")) {
						ship1.calcTotalPrice();
					} 
					break;
				}
				// kondisi jika memilih menu 4, yaitu menampilkan interface-interface lain berdasarkan tipe kendaraan
				// yang di input
				case 4:{
					if(type.equals("Car")) {
						int mod = 2;
						car1.newOrOld(year);
						car1.changeMod(mod);
						car1.turn("left", 225);
						car1.lampSign(0);
						car1.setTemp();
						car1.changeGear();
					} else if(type.equals("Motorcycle")) {
						motor1.newOrOld(year);
						motor1.turn("right", 60);
						motor1.lampSign(0);
					} else if(type.equals("Bus")) {
						bus1.newOrOld(year);
						bus1.turn("right", 180);
						bus1.lampSign(1);
					} else if(type.equals("Plane")) {
						plane1.newOrOld(year);
						plane1.changeAlt(32000);
						plane1.rettain();
						plane1.placeBagage();
						plane1.removeBagage();
					} else if(type.equals("Ship")) {
						ship1.newOrOld(year);
						ship1.changeGear();
						ship1.placeBagage();
						ship1.removeBagage();
					} 
					break;
				}
				// kondisi jika memilih menu 5, berupa keluar dari program atau menutupi program
				case 5:{
					System.out.println("Press enter to continue");
					scan.close();
					System.exit(1);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// Panggil fungsi main
		new Main();
	}
}