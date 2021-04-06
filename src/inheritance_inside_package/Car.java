package inheritance_inside_package;

public class Car extends Vehicle {
	int numGears;
	
	public Car() {
		System.out.println("Car constructor is called");
	}
	
	public void print() {
		System.out.println("Car name:" + this.name);
		System.out.println("Car maxSpeed:" + this.getMaxSpeed());
		System.out.println("Car numGears:" + this.numGears);
		
		return;
	}
}