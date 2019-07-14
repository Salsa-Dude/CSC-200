package com.Joseph;

import java.util.Scanner;

/*

Write a program asks the user to enter a month (1 for January, 2 for February,
and so on) and then prints the number of days in the month. For February, print "28 or 29 days".

For example:

Enter a month: 5
30 days

Do not use a separate if/else branch for each month. Use Boolean operators.

 */

public class Problem4 {

    public static void main(String[] args) {

        System.out.println("I can tell you how many days are in a month");

        // initialize Scanner
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a number between 1 to 12 to represent a month in the year: ");
        int monthInput = keyboard.nextInt();

        switch(monthInput) {
            case 1:
                System.out.println("You entered " + monthInput + " there are 31 days in Januaray.");
                break;

            case 2:
                System.out.println("You entered " + monthInput + " there are 28 days in Febuarary.");
                break;

            case 3:
                System.out.println("You entered " + monthInput + " there are 31 days in March.");
                break;

            case 4:
                System.out.println("You entered " + monthInput + " there are 30 days in April.");
                break;

            case 5:
                System.out.println("You entered " + monthInput + " there are 31 days in May.");
                break;

            case 6:
                System.out.println("You entered " + monthInput + " there are 30 days in June.");
                break;

            case 7:
                System.out.println("You entered " + monthInput + " there are 31 days in July.");
                break;

            case 8:
                System.out.println("You entered " + monthInput + " there are 31 days in August.");
                break;

            case 9:
                System.out.println("You entered " + monthInput + " there are 30 days in September.");
                break;

            case 10:
                System.out.println("You entered " + monthInput + " there are 31 days in October.");
                break;

            case 11:
                System.out.println("You entered " + monthInput + " there are 30 days in Novemeber");
                break;

            case 12:
                System.out.println("You entered " + monthInput + " there are 31 days in December");
                break;

             default:
                 System.out.println("You entered " + monthInput + " which is a invalid number");
                 break;
        }





    }


}
