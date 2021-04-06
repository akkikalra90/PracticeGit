package inheritance_inside_package;

public class Car extends Vehicle {
	int numGears;
	
	public Car() {
		System.out.println("Car constructor is called");
	}
	
	public void printCar() {
		System.out.println("Car name:" + name);
		System.out.println("Car maxSpeed:" + maxSpeed);
		System.out.println("Car numGears:" + numGears);
		
		return;
	}
}