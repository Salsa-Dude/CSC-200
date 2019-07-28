package com.Joseph;

/*

Write a program that prints a multiplication table, like this:
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30

*/

public class Mod_5_Problem4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.print(i + ":");
            for (int j = 1; j <= 12; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }

    }
}
