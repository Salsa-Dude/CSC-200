package flightclass;

public class FlightTest {
	
	public static void main (String[] args) {
		Flight flight1 = new Flight("SouthWest", "Virginia", "Barcelona", 223);
		Flight flight2 = new Flight("Joseph's Airline", "Florida", "El Salvador", 191);
		
		System.out.println(flight1);
		System.out.println("\n");
		System.out.println(flight2);
		
		flight1.setAirline("Joseph's Airline");
		System.out.println("\n");
		System.out.println(flight1);
		
	}
	
}
