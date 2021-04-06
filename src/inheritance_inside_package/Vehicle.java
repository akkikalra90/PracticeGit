package inheritance_inside_package;

public class Vehicle {
	String name;
	int maxSpeed;
	
	public Vehicle() {
		System.out.println("Vehicle Constructor is called");
	}
	
	public void printVehicle() {
		System.out.println("Vehicle name:" + name);
		System.out.println("Vehicle maxSpeed:" + maxSpeed);
		
		return;
	}
}