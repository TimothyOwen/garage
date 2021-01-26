package garage_exercise;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	public static int ID = 1;
	public List<Vehicle> garageList = new ArrayList<>();
	public void addVehicle(Vehicle i){
		ID += 1;
		garageList.add(i);
		System.out.println("_______________________");
		System.out.println();
		System.out.println("Vehicle added to garage of vehicle ID = "+i.vehicleID);
		System.out.println("_______________________");
	}
	public void removeVehicle(int index) {
		System.out.println("_____________________________________________");
		System.out.println();
		System.out.println("Vehicle removed from garage of vehicle ID = "+(index+1));
		System.out.println("_____________________________________________");
		garageList.remove(index);
	}
	public void clearGarage() {
		System.out.println();
		System.out.println("All Vehicles have been removed");
		garageList = new ArrayList<>();
		outputGarage();
	}
	public void getBill(int vehicleID) {
		Vehicle i = garageList.get(vehicleID);
		System.out.println("_____________________________________________");
		System.out.println();
		System.out.println("The cost of your car is: £"+i.getCost());
		System.out.println("_____________________________________________");
	}
	public void outputGarage() {
		System.out.println();
		System.out.println("Contents of Garage:");
		System.out.println();
		for(int i=0; i< garageList.size(); i++) {
			Object j = garageList.get(i);
			System.out.println(j);
			System.out.println();
		}
		System.out.println();
	}

}
