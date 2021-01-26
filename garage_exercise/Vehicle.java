package garage_exercise;

public class Vehicle {
	int vehicleID;
	int weight;
	int timeToMake;
	String colour;
	String make;
	int cost;
	public Vehicle(int weight, int timeToMake, String colour, String make) {
		this.weight = weight;
		this.timeToMake = timeToMake;
		this.colour = colour;
		this.make = make;
		setID();
		setCost();
	}
	public void setID() {
		this.vehicleID = Garage.ID;
	}
	public void setCost() {
		this.cost = this.weight * this.timeToMake;
	}
	public int getCost() {
		return this.cost;
	}
	public String getMake() {
		return this.make;
	}
	public int getVehicleID() {
		return this.vehicleID;
	}
	@Override
	public String toString() {
		return "Vehicle [ID=" + vehicleID + ", weight=" + weight + ", timeToMake= " + timeToMake + ", colour=" + colour + ", make=" + make + "]";
	}
	
}
