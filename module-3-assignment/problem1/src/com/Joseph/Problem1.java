package com.Joseph;

import java.util.Scanner;

public class Problem1 {

    // Converstion numbers
    public static final double METER_TO_MILE = 0.000621371;
    public static final double METER_TO_FEET = 3.28084;
    public static final double METER_TO_INCHES = 39.3701;


    public static void main(String[] args) {
        // write your code here
        double meters, miles, feets, inches;

        Scanner keyboard = new Scanner(System.in);
        // Ask user for input
        System.out.println("Enter a measurement in meters");
        System.out.println("And I will convert it in miles, feet, and inches");

        // grab user input and store it to meters variable
        meters = keyboard.nextInt();

        // convert meters to miles
        miles = meters * METER_TO_MILE;
        feets = meters * METER_TO_FEET;
        inches = meters * METER_TO_INCHES;


        System.out.printf("In Miles: %.2f", miles);
        System.out.print("\n");
        System.out.printf("In Feets: %.2f", feets);
        System.out.print("\n");
        System.out.printf("In Inches: %.2f", inches);


    }
}
