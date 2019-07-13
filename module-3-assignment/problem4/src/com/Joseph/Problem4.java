package com.Joseph;
import java.util.Scanner;

// Write a program that asks the user to enter the name of his or her favorite city.
// use a String variable to store the input. The program should display the following:
//
//        The number of characters in the city name
//        the name of the city in all uppercase letters
//        the name of the city in all lower case letters
//        the first character in the name of the city

public class Problem4 {

    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the name of your favorite city");
        System.out.println("I will display the number of characters in the city name");
        System.out.println("I will also diplay the city name in both uppercase and lowercase and give you the first character in the name of the city");

        String city = keyboard.nextLine();

        int characters = city.length();


        System.out.println("Number of characters: " + characters);
        System.out.println("City name in Uppercase characters: " + city.toUpperCase());
        System.out.println("City name in Lowercase characters: " + city.toLowerCase());
        System.out.println("First character in the name of the city: " + city.charAt(0));

    }

}
