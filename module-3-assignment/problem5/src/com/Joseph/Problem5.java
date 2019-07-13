package com.Joseph;


// Read a word from the user and display the string with the letters shifted to the right by two positions
// and with the letters shifted to the left by two positions in the string.
// Save all of the three strings in separate variables and display all three of them at the end of the program.

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a word");

        String word = keyboard.nextLine();
        
        String shiftRight = word.substring(0, word.length() - 2);
        String lastTwoLetters = word.substring(word.length() - 2);
        String shiftLeft = word.substring(2);
        String firstTwoLetters = word.substring(0, 2);

        String rightShiftWord = lastTwoLetters + shiftRight;
        String leftShiftWord = shiftLeft + firstTwoLetters;

        System.out.println("Original: " + word);
        System.out.println("Right Shifted " + rightShiftWord);
        System.out.println("Left Shifted " + leftShiftWord);

    }
}
