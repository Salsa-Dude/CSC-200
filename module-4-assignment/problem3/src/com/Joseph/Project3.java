package com.Joseph;

/*

 The original US income tax of 1913 was quite simple. The tax was:

        1 percent on the first $50,000
        2 percent on the amount over $50,000 up to $75,000
        3 percent on the amount over $75,000 up to $100,000
        4 percent on the amount over $100,000 up to $250,000
        5 percent on the amount over $250,000 up to $500,000
        6 percent on the amount over $500,000.
        There was no separate schedule for single or married taxpayers.
        Write a program that computes the income tax according to this schedule.

 */

import java.util.Scanner;


public class Project3 {

    // CONSTANT VARIABLES
    public static final double PERCENT1 = .01;
    public static final double PERCENT2 = .02;
    public static final double PERCENT3 = .03;
    public static final double PERCENT4 = .04;
    public static final double PERCENT5 = .05;
    public static final double PERCENT6 = .06;



    public static void main(String[] args) {

        // initialize Scanner
        Scanner keyboard = new Scanner(System.in);

        System.out.println("I can calculate your taxes as if you lived in 1913");
        System.out.println("Please enter your total income: ");

        double userIncome = keyboard.nextDouble();
        // initialize tax variable
        double tax = 0;
        double totalIncome;


        if (userIncome <= 50000) {
            tax = userIncome * PERCENT1;
        } else if (userIncome <= 75000) {
            tax = userIncome * PERCENT2;
        } else if (userIncome <= 100000) {
            tax = userIncome * PERCENT3;
        } else if (userIncome <= 250000) {
            tax = userIncome * PERCENT4;
        } else if (userIncome <= 500000) {
            tax = userIncome * PERCENT5;
        } else {
            tax = userIncome * PERCENT6;
        }

        // format tax output
        String formatTax = String.format("%,.2f", tax);

        totalIncome = userIncome - tax;
        // format totalIncome output
        String formatTotalIncome = String.format("%,.2f", totalIncome);

        System.out.println("In 1913 you would have paid $" + formatTax + " in tax, which would have left you with a total income of $" + formatTotalIncome);


    }
}
