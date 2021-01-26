package garage_exercise;

public class Motorcycle extends Vehicle {
	String engineSize;
	public Motorcycle(int weight, int timeToMake, String colour, String make, String engineSize) {
		super(weight, timeToMake, colour, make);
	}
	@Override
	public String toString() {
		return "Motorcycle [ vehicleID= " + vehicleID + " , engineSize=" + engineSize + ", weight=" + weight + ", cost="
				+ cost + ", colour=" + colour + ", make=" + make + "]";
	}	
}
