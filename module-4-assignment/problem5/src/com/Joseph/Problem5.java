package com.Joseph;

import java.util.Scanner;

/*

   A year with 366 days is called a leap year. Leap years are necessary to keep the calendar synchronized
   with the sun because the earth revolves around the sun once every 365.25 days.
   Actually, that figure is not entirely precise, and for all dates after 1582 the Gregorian corrections apply.
   Usually years that are divisible by 4 are leap years, for example 1996.
   However, years that are divisible by 100 (for example 1900) are not leap years,
   but years that are divisible by 400 are leap years (for example 2000).
   Write a program that asks the user for a year and computes whether that year is a leap year.
   Use a single if statement and Boolean operators.

 */

public class Problem5 {

    public static void main(String[] args) {

        System.out.println("I can tell you if a year is a leap year or not");

        // initialize Scanner
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please Enter a year after 1582: ");

        // store user input
        int yearInput = keyboard.nextInt();

        if ((yearInput % 4 == 0 && yearInput % 100 != 0) || (yearInput % 400 == 0)) {
            System.out.println(yearInput + " is a leap year");
        } else {
            System.out.println(yearInput + " is not a leap year");
        }





    }
}
