package carPackage;

public class Car {
	private double fuelEfficiency;
	private double amountOfFuel;

	public Car(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
		amountOfFuel = 0;
	}
	
	public void addGas(double addFuel) {
		amountOfFuel = amountOfFuel + addFuel;
	}
	public void drive(double distance) {
		amountOfFuel = amountOfFuel - (distance/fuelEfficiency);
	}
	public double getGasLevel() {
		return amountOfFuel;
	}

}
