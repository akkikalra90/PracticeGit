package inheritance_inside_package;

public class Vehicle {
	protected String name;
	private int maxSpeed;
	
	public Vehicle(int maxSpeed) {
		System.out.println("Vehicle Constructor is called");
		this.maxSpeed = maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		
		return;
	}
	
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public void print() {
		System.out.println("Name:" + name);
		System.out.println("MaxSpeed:" + maxSpeed);
		
		return;
	}
}