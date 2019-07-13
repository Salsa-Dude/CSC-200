package com.Joseph;

import java.text.DecimalFormat;
import java.util.Scanner;

//   Write a program that asks the user to input:
//
//        The number of gallons of gas in the tank
//        The fuel efficiency in miles per gallon
//        The price of gas per gallon
//        Then print the cost per 100 miles and how far the car can go with the gas in the car.

public class Problem3 {

    public static void main(String[] args) {
	// write your code here

    // initialize an instance of java Scanner
        Scanner keyboard = new Scanner(System.in);

        System.out.println("I can calculate the total cost it would be to drive 100 miles and I can also tell you how far you can go with the amount of gas in your car");
        System.out.println("Please tell me how many gallons of gas you have in your gas tank");
        int gallonsInCar = keyboard.nextInt();

        System.out.println("Please tell me how many miles per gallons your car gets");
        float mpg = keyboard.nextFloat();

        System.out.println("Please tell me how much is a gallon of gas");
        float gasPrice = keyboard.nextFloat();

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float totalCost = ((100/mpg) * gasPrice);
        // Change totalCost decimal format
        float decimaltotalCost = Float.valueOf(decimalFormat.format(totalCost));


        System.out.println("With your MPG of " + mpg + " gas price at $" + gasPrice + " per gallon, going 100 miles will cost you $" + decimaltotalCost);
        System.out.println("With " + gallonsInCar + " gallons in your car you can reach " + (gallonsInCar * mpg) + " miles");

    }
}
