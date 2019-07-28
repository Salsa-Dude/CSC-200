package com.Joseph;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.SortedMap;

// Write a program that reads in the name and salary of an employee.
// Here the salary will denote an hourly wage, such as $9.25.
// Then ask how many hours the employee worked in the past week.
// Be sure to accept fractional hours.
// Compute the pay. Any overtime work (over 40 hours per week) is paid at 150 percent of the regular wage.
// Print a paycheck for the employee.


public class Problem2 {


    public static void main(String[] args) {
        // write your code here

        // Initialize Scanner
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the name of the employee: ");
        String employeeName = keyboard.nextLine();

        System.out.println("Enter the hourly wage of the employee: ");
        double hourlyWage = keyboard.nextDouble();

        System.out.println("Enter the number of hours the employee worked last week: ");
        double hours = keyboard.nextDouble();

        double salary = 0;
        String formatSalary = "";


        if (hours <= 40) {
            salary = 40 * hourlyWage;
            formatSalary = String.format("%.2f", salary);

        } else if (hours > 40) {
            salary = (hours * 40) + ((hours - 40) * hourlyWage * 1.5);
            formatSalary = String.format("%.2f", salary);
        }

        System.out.printf("%-15s %-15s %-15s %-15s %n", "Name: ", "Wage: ", "Hours: ", "Salary: " );
        System.out.printf("%-15s %-15s %-15s %-15s %n", employeeName, hourlyWage, hours, "$" + formatSalary);

    }

}
