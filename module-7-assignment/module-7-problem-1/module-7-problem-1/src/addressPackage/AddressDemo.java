package addressPackage;

import java.util.Scanner;

public class AddressDemo {
	public static void main(String[] args) {
	
	int userAns;
	int userHouseNum;
	int userAptNum;
	String userStreet;
	String userCity;
	String userState;
	int userPosCode;
	int comparePosCode;

	Scanner keyboard = new Scanner(System.in);

	System.out.println("To enter your address, ");
	System.out.println("Press 1 for address without an apartment number.");
	System.out.println("Or press 2 for address with an apartment number.");

	userAns = keyboard.nextInt();

	if (userAns == 1)
	{
		System.out.println("Eneter your house number: ");
		userHouseNum = keyboard.nextInt();
		System.out.println("Enter your street name: ");
		userStreet = keyboard.next();
		keyboard.nextLine();
		System.out.println("Enter your city name: ");
		userCity = keyboard.next();
		keyboard.nextLine();
		System.out.println("Enter your state: ");
		userState = keyboard.next();
		keyboard.nextLine();
		System.out.println("Enter the postal code: ");
		userPosCode = keyboard.nextInt();

		Address demover1 = new Address(userHouseNum, userStreet, userCity, userState, userPosCode);
		System.out.println("Here is what you typed");
	
		demover1.displayAddress();
		System.out.println("Enter other postal code to compare if the postal code comes before yours");
		comparePosCode = keyboard.nextInt();
		System.out.println(demover1.comesBefore(comparePosCode));
	}
	else if (userAns == 2)
	{
		System.out.println("Enter your house number: ");
		userHouseNum = keyboard.nextInt();
		System.out.println("Enter your apartment number ");
		userAptNum = keyboard.nextInt();
		System.out.println("Enter your street name: ");
		userStreet = keyboard.next();
		System.out.println("Enter your city name: ");
		userCity = keyboard.next();
		System.out.println("Enter your state: ");
		userState = keyboard.next();
		System.out.println("Enter your postal code: ");
		userPosCode = keyboard.nextInt();

		Address demover1 = new Address(userHouseNum, userAptNum, userStreet, userCity, userState, userPosCode);
		System.out.println("Here is what you typed");

		demover1.displayAddress();
		System.out.println("Enter other postal code to compare if the postal code comes before yours");
		comparePosCode = keyboard.nextInt();
		System.out.println(demover1.comesBefore(comparePosCode));
	}
	else
	{
		System.out.println("Invalid input.");
	}
    }
}
