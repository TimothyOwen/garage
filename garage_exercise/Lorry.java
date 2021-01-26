package garage_exercise;

public class Lorry extends Vehicle {
	int cargoWeight;
	public Lorry(int weight, int timeToMake, String colour, String make, int cargoWeight) {
		super(weight, timeToMake, colour, make);
	}
	@Override
	public String toString() {
		return "Lorry [ vehicleID= " + vehicleID + " , cargoWeight=" + cargoWeight + ", weight=" + weight + ", cost="
				+ cost + ", colour=" + colour + ", make=" + make + "]";
	}	
}
