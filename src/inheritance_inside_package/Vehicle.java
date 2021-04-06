package inheritance_inside_package;

public class Vehicle {
	String name;
	private int maxSpeed;
	
	public Vehicle() {
		System.out.println("Vehicle Constructor is called");
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		
		return;
	}
	
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public void printVehicle() {
		System.out.println("Vehicle name:" + name);
		System.out.println("Vehicle maxSpeed:" + maxSpeed);
		
		return;
	}
}