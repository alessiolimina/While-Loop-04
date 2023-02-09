package it.develhope.whileloop;

import java.util.Random;
import java.util.Scanner;

/**
 * This class is a Tester Class
 * @author alessiolimina
 */

public class Start {
    public static void main(String[] args) {

        System.out.println("--------------Starting--------------");

        /**
         * Declaring the variables
         */

        int number;
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        int userNumber;

        /**
         * Starting the program
         */

        System.out.println("Welcome! Try to guess the number! Type a number: ");

        /**
         * Program generates a random number
         * User types a user number
         * Program does a Do/While Loop until the user number is equal to the random number
         * The program ends
         */

        number = randomNumber.nextInt(1, 10);
        do {userNumber = input.nextInt();
        } while (userNumber != number);

        System.out.println("Congratulations! You did it!");

        System.out.println("------------------------------------");
    }
}

