package flightclass;

/*
 Design and implement a class called Flight that represents an airline flight. 
 It should contain instance data that represents the airline name, flight number, and the flight’s origin and destination cities. 
 Define the Flight constructor to accept and initialize all instance data. 
 Include getter and setter methods for all instance data. 
 Include a toString method that returns a one-line description of the flight. 
 Create a driver class calledFlightTest, whose main method instantiates and updates several Flight objects.
 */

public class Flight {

	private String airline, origin, destination;
	private int flightNumber;

	public Flight (String airline, String origin, String destination, int flightNumber){
		this.airline = airline;
		this.origin = origin;
		this.destination = destination;
		this.flightNumber = flightNumber;
	}
	
	// Getters
	public String getAirline() {
		return this.airline;
	}
	
	public String getOrigin() {
		return this.origin;
	}
	
	public String getDestination() {
		return this.destination;
	}
	
	public int getFlightNumber() {
		return this.flightNumber;
	}
	
	// Setters
	public void setAirline(String airline) {
		this.airline = airline;
	}
	
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	// toString method
	public String toString() {
		return "Airline: " + getAirline() + "\nFlightNumber: " + getFlightNumber() + "\nOrigin: " + getOrigin() +           				"\nDestination: " + getDestination()	;
	}
 
 

}