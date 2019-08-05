package canPackage;

import java.util.Scanner;

public class CanDemo
{
	public static void main(String[] args)
	{
		double userHeight;
		double userRadius;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a height for the soda can: ");
		userHeight = input.nextDouble();
		System.out.println("Enter a radius for the soda can: ");
		userRadius = input.nextDouble();
		Can canDemo1 = new Can(userHeight, userRadius);

		canDemo1.getSurfaceArea();
		canDemo1.getVolume();
	}
}

