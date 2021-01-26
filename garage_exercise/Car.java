package garage_exercise;

public class Car extends Vehicle {
	boolean seatBelts;
	public Car(int weight, int timeToMake, String colour, String make, boolean seatBelts) {
		super(weight, timeToMake, colour, make);
		this.seatBelts = seatBelts;
	}
	@Override
	public String toString() {
		return "Car [ vehicleID= " + vehicleID + " , seatBelts=" + seatBelts + ", weight=" + weight + ", cost=" + cost
				+ ", colour=" + colour + ", make=" + make + "]";
	}	 
}
