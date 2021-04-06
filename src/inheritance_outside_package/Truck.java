package inheritance_outside_package;
import inheritance_inside_package.Vehicle;

public class Truck extends Vehicle {
	int loadCapacity;
	
	public Truck(int maxSpeed) {
		super(maxSpeed);
		System.out.println("Truck constructor is called");
	}
	
	public void print() {
		super.print();
		System.out.println("loadCapacity: " + loadCapacity);
		
		return;
	}
	
	public static void main(String args[]) {
		Truck t        = new Truck(205);
		t.loadCapacity = 1005;
		t.name         = "Mahindra Truck";
		t.print();
		
		return;
	}
}