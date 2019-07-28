package com.Joseph;

import java.util.Scanner;

public class module_5_problem3 {

    public static void main(String[] args) {
	// write your code here
        // welcome the user
        System.out.println("I can tell you the nth Fibonacci number.");
        // get ready to read the user data
        Scanner keyboard = new Scanner(System.in);
        // prompt the user for input
        System.out.print("Please enter an integer to test this program: ");

        // store the user input
        int userInput;
        userInput = keyboard.nextInt();
        int fold1 = 0;
        int fold2 = 1;
        int foldNew = 0;
        int counter;

        for ( counter = 0; counter < userInput; counter ++){
            foldNew = fold1 + fold2;
            fold2 = fold1;
            fold1 = foldNew;
        }//input loop END

        System.out.println("The " + counter + " the Fibonacci is: " + foldNew);
    }
}
