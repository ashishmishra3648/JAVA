package UpCasting;

import UpCasting.Vehicle.Car;
import UpCasting.Vehicle.Bike;
import UpCasting.Vehicle.RE;
import UpCasting.Vehicle.Duke;
import UpCasting.Vehicle.Punch;
import UpCasting.Vehicle.Thar;
import UpCasting.Vehicle;



public class Driver {
	public static void driver_1(Car c){
		System.out.println("Driving Car");
		}
	public static void driver_2(Bike B){
		System.out.println("Driving Bike");
	}
	public static void driver_3(Vehicle v){
		System.out.println("Driving...");
	}
	public static void main(String[] args) {
		driver_1(new Punch());
		driver_1(new Thar());
		//driver_1(new RE());
		
		driver_2(new RE());
		driver_2(new Duke());
		//driver_2(new Thar());
		
		driver_3(new Duke());
		driver_3(new Punch());
		
	}

}
