package com.Joseph;
import java.util.Scanner;



/*

Write a program that reads a word and prints each character of the word on a separate line.
For example, if the user provides the input "Harry", the program prints:

 */

public class Mod_5_Problem2 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a word: ");

        String userInput = keyboard.next();

        for (int i = 0; i < userInput.length(); i++){
            char letter = userInput.charAt(i);
            System.out.println(letter);
        }
    }
}
