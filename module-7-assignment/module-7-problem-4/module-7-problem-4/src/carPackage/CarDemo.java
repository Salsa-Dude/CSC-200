package carPackage;
import java.util.Scanner;

public class CarDemo {

   public static void main(String[] args){
   	double userEfficiency;
	double userGas;
	double userDistance;

	Scanner input = new Scanner(System.in);
	System.out.println("Enter efficiency for your car");
	userEfficiency = input.nextInt();

	Car car1 = new Car(userEfficiency);
	
	System.out.println("Enter the amout of gas to add");
	userGas = input.nextInt();

	car1.addGas(userGas);

	System.out.println("Enter a distance for your simulation");
	userDistance = input.nextInt();
	car1.drive(userDistance);

	System.out.println("Your current gas level: " + car1.getGasLevel());
   }
}
