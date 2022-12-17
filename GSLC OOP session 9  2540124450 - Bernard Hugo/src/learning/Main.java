package learning;

import java.util.ArrayList;
import java.util.Scanner;

import vehicles.*;

/*
 Program ini berisi tentang sebuah toko yang menjual berbagai macam kendaraan seperti mobil, motor, bus, pesawat, 
 dan kapal. Program tersebut berfungsi untuk mengisi data-data properti-properti sebuah kendaraan berdasarkan tipe 
 kendaraaannya. Setelah itu, menampilkan data-data yang sudah diisi tersebut. Program ini juga bisa digunakan untuk 
 menampilkan total harga akhir dari sebuah kendaraan. Selain itu, bisa menampilkan metode-metode dari beberapa 
 interface yang disesuaikan berdasarkan tipe kendaraan yang dimasukkan oleh user.  
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
	
	// Membuat objek dari masing-masing subclass Vehicle untuk nantinya menampung constructor masing-masing subclass nya
	Car car1;
	Motorcycle motor1;
	Bus bus1;
	Plane plane1;
	Ship ship1;
	
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
			System.out.print("Input the total lamp of the vehicle[1-10]: ");
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
			
			System.out.print("Input what is the brand of the car: ");
			Brand = scan.next();
			
			// Beberapa mobil bisa memiliki 2 pintu atau 4 pintu. Tetapi rata2 mobil mempunyai 4 pintu
			do {
				System.out.print("Input the car's total door[2 or 4]: ");
				door = scan.nextInt();
			} while(door != 2 && door != 4);
			
			System.out.print("Input the car's AC power: ");
			AC = scan.nextInt();
			
			car1 = new Car(name, fuel, engine, year, lamp, speed, price, Brand, Color, 4, door, AC);
			landVehList.add(car1);
			System.out.println("A new car has been added to the vehicle list");
		}
		
		// Jika tipe kendaraan yang di-input adalah motor (Motorcycle)
		else if(type.equals("Motorcycle")) {
			
			System.out.print("Input the motorcycle's color: ");
			Color = scan.next();
			
			System.out.print("Input what is the brand of the motorcycle: ");
			Brand = scan.next();
			
			motor1 = new Motorcycle(name, fuel, engine, year, lamp, speed, price, Brand, Color, 2);
			landVehList.add(motor1);
			System.out.println("A new motorcycle has been added to the vehicle list");
		}
		
		// Jika tipe kendaraan yang di-input adalah pesawat (Plane)
		else if(type.equals("Plane")) {
			// Beberapa pesawat harus memiliki 2 turbin atau 4 turbin
			do {
				System.out.print("Input the total turbine of the plane[2 or 4]: ");
				turbine = scan.nextInt();
			}while(turbine != 2 && turbine != 4);
			
			System.out.print("Input what is the type of the plane: ");
			planeType = scan.nextLine();
			
			plane1 = new Plane(name, fuel, engine, year, lamp, speed, price, turbine, planeType);
			vehList.add(plane1);
			System.out.println("A new plane has been added to the vehicle list");
		} 
		
		// Jika tipe kendaraan yang di-input adalah bus (Bus)
		else if(type.equals("Bus")) {
			// Bus ada juga yang memiliki 6 roda
			do {
				System.out.print("Input how many wheels the bus has [4 or 6]: ");
				Wheels = scan.nextInt();
			}while(Wheels != 4 || Wheels != 6);
			
			System.out.print("Input the bus color: ");
			Color = scan.next();
			
			System.out.print("Input what is the brand of the bus: ");
			Brand = scan.next();
			
			// Selain satu tingkat, ada juga bus yang dua tingkat
			do {
				System.out.print("Input how many deck the bus has [1-2]: ");
				deck = scan.nextInt();
			}while(deck != 1 && deck != 2);
			
			bus1 = new Bus(name, fuel, engine, year, lamp, speed, price, Brand, Color, Wheels, deck);
			landVehList.add(bus1);
			System.out.println("A new bus has been added to the vehicle list");
		} 
		
		// Jika tipe kendaraan yang di-input adalah kapal (Ship)
		else if(type.equals("Ship")) {
			// Kapal ada yang memiliki 1 baling-baling, tapi ada juga yang memiliki 2 baling-baling
			do {
				System.out.print("Input how many propeller the ship has[1-2]: ");
				prop = scan.nextInt();
			}while(prop != 1 && prop != 2);
			
			ship1 = new Ship(name, fuel, engine, year, lamp, speed, price, prop);
			vehList.add(ship1);
			System.out.println("A new ship has been added to the vehicle list");
		} 
	}
	
	private void case2() {
		// Jika didalam list data-datanya belum dimasukkan, maka program akan menampilkan tidak ada kendaraan 
		// di dalam daftar kendaraannya
		if(vehList.isEmpty() && landVehList.isEmpty()) {
			System.out.println("There is no vehicle in the list");
		}
		// Jika terdapat data-data yang sudah dimasukkan didalam kendaraannya, maka program akan menampilkan
		// data-data tersebut
		else {
			try {
				if(type.equals("Car") || type.equals("Motorcycle") || type.equals("Bus")) {
					System.out.println(landVehList.toString());
				} else if(type.equals("Plane") || type.equals("Ship")) {
					System.out.println(vehList.toString());
				} 
			}catch(Exception E) {}
		}
	}
	
	// Function main
	public Main() {
		int menu;
		/* Daftar menu untuk memilih berbagai jenis menu*/
		
		while(true) {
			// Menampilkan menu-menu untuk menjalankan fungsinya
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
				/* Kondisi jika memilih menu 1, yaitu mengisi data-data properti berdasarkan tipe kendaraan 
				   yang di input */
				case 1:{
					case1();
					break;
				}
				// Kondisi jika memilih menu 2, yaitu menampilkan isi dari vehicle list 
				case 2:{
					case2();
					break;
				}
				// Kondisi jika memilih menu 3 yaitu menghitung total harga berdasarkan tipe kendaraan
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
				// Kondisi jika memilih menu 4, yaitu menampilkan interface-interface lain berdasarkan tipe kendaraan
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
				// Kondisi jika memilih menu 5, berupa keluar dari program atau menutupi program
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