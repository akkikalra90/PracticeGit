package inheritance_inside_package;

public class VehicleUse {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.printVehicle();
		
		Car c = new Car();
		c.name = "Honda City";
		c.setMaxSpeed(105);
		c.numGears = 5;
		c.printCar();
		
		return;
	}
}