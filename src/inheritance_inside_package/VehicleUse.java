package inheritance_inside_package;

public class VehicleUse {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.print();
		
		Car c = new Car();
		c.name = "Honda City";
		c.setMaxSpeed(105);
		c.numGears = 5;
		c.print();
		
		return;
	}
}