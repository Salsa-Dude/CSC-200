package com.Joseph;
import java.util.Scanner;

 /* Write a program that reads a set of floating-point values. Ask the user to enter the values, then print:

        The average of the values
        The smallest of the values
        The largest of the values
        The range, that is the difference between the smallest and the largest
        Of course, you may only prompt for the values once.


  */

public class module5_Problem1 {

    public static void main(String[] args) {
	// write your code here

        double smallest = 10000;
        double largest = 0;

        int count = 0;
        double sum = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter values. enter q to finish.");

        while (keyboard.hasNextDouble()) {

            double value = keyboard.nextDouble();

            //Find maximum
            if (value > largest) {
                largest = value;
            }
            //Find minimum
            if (value < smallest) {
                smallest = value;
            }

            // increment count
            count++;

            // add value to sum
            sum += value;
        }

        if (count > 0) {
            double average = sum / count;
            //Find range
            double range = largest - smallest;
            System.out.println("The average is: " + average);
            System.out.println("The largest is: " + largest);
            System.out.println("The smallest is: " + smallest);
            System.out.println("The range is: " + range);
        }



    }


}
