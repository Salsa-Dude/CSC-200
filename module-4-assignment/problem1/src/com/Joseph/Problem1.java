package com.Joseph;

import java.util.Scanner;

// Write a program that reads the ages of three persons from the user,
// and decides who is the oldest, and who the youngest person is.


public class Problem1 {

    public static void main(String[] args) {
        // write your code here


        Scanner in = new Scanner(System.in);

        System.out.println("I can read the ages of three people and tell you who is the oldest and who is the youngest from them");

        System.out.println("Please enter the first person's age");
        int person1Age = in.nextInt();

        System.out.println("Please enter the second person's age");
        int person2Age = in.nextInt();

        System.out.println("Please enter the thrid person's age");
        int person3Age = in.nextInt();

        int maxAge, minAge;

        if ((person1Age > person2Age) && (person1Age > person3Age))
            maxAge = person1Age;
        else if ((person2Age > person1Age) && (person2Age > person3Age))
            maxAge = person2Age;
        else
            maxAge = person3Age;

        if ((person1Age < person2Age) && (person1Age < person3Age))
            minAge = person1Age;
        else if ((person2Age < person1Age) && (person2Age < person3Age))
            minAge = person2Age;
        else
            minAge = person3Age;

        System.out.println("The youngest person's age is " + minAge + " and the oldest one is " + maxAge + " years old");






    }
}
