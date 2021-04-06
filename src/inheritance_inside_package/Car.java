package inheritance_inside_package;

public class Car extends Vehicle {
	int numGears;
	
	public Car() {
		System.out.println("Car constructor is called");
	}
	
	public void print() {
		super.print();
		System.out.println("NumGears:" + this.numGears);
		
		return;
	}
}