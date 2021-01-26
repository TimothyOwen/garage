package garage_exercise;

import java.util.Scanner;

public class GarageScanner {
	public static void scannerMenu() {
		System.out.println("--------------------------------------------- |");
		System.out.println("Welcome to the Garage. Your options are:      |");
		System.out.println("--------------------------------------------- |");
		System.out.println("	Add Vehicle (A)                       |");
		System.out.println("	View all Vehicles (O)                 |");
		System.out.println("	Remove Vehicle (R)                    |");
		System.out.println("	Get Bill for Vehicle (B)              |");
		System.out.println("--------------------------------------------- |");
		System.out.println("Choose your option:                           |");
	}
	public static void userInput(Scanner dashboard) {
		String Name = dashboard.next();
		System.out.println();
		switch(Name) {
			case "A":
				addInput(dashboard);
				break;
			case "O":
				outInput(dashboard);
				break;
			case "R":
				removeInput(dashboard);
				break;
			case "B":
				billInput(dashboard);
				break;
		}
	}
	public static void addInput(Scanner dashboard) {
		String Name = dashboard.next();
		String Name = dashboard.next();
		String Name = dashboard.next();
		String Name = dashboard.next();
		String Name = dashboard.next();
	}
	
}
