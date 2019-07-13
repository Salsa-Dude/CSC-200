package com.Joseph;

// import scanner
import java.util.Scanner;

// Write a program that reads in an integer, and breaks it into a sequence of individual digits.
// Display each digit on a separate line.


public class Problem2 {

    public static void main(String[] args) {
	// write your code here

        int inputNumber;

        // get ready to read the user data
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an integer that has no more than five digits and is not negative");
        System.out.println("I display each digit on a separate line");

        // grab user input
        inputNumber = keyboard.nextInt();

        // convert int to string
        String stringInputNumber = String.valueOf(inputNumber);

        // get the length of string number
        int stringInputNumberLength = stringInputNumber.length();


        // loop thru string number and print each index
        for (int i = 0; i < stringInputNumberLength; i++) {
            System.out.println(stringInputNumber.charAt(i));
        }



    }
}
