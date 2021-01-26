package garage_exercise;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Garage garage = new Garage();
//		Scanner dashboard = new Scanner(System.in);
		Vehicle c1 = new Car(12, 2, "blue", "Mercedes", true);
		garage.addVehicle(c1);
		Vehicle m1 = new Motorcycle(6,2,"red","Harley","10cc");
		garage.addVehicle(m1);
		Vehicle l1 = new Lorry(24,1,"black","BMW",10);
		garage.addVehicle(l1);
//		GarageScanner.scannerMenu();
//		userInput(dashboard);
		garage.outputGarage();
		garage.removeVehicle(0);
		garage.outputGarage();
		garage.getBill(1);
		garage.clearGarage();
	}	
}
