package inheritance_inside_package;

public class VehicleUse {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.printVehicle();
		
		Car c = new Car();
		c.printCar();
		
		return;
	}
}