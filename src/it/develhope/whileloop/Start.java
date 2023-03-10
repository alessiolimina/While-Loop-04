package it.develhope.whileloop;

import java.util.Random;
import java.util.Scanner;

/**
 * This is a Tester Class
 * @author alessiolimina
 */

public class Start {
    public static void main(String[] args) {

        System.out.println("--------------Starting--------------");

        /**
         * Declaring the variables
         * number is a number
         * randomNumber is a number randomly generated by the program
         * userNumber is the number typed by the user
         */

        int number;
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        int userNumber;


        /**
         * Program generates a random number
         * User, as asked by the program, types a user number
         * Program does a DO/WHILE Loop until the user number is equal to the random number
         */

        number = randomNumber.nextInt(1, 10);
        do {System.out.println("Type a number:");
            userNumber = input.nextInt();
            System.out.println("Wrong number! Try again!");
        } while (userNumber != number);

        System.out.println("Congratulations! You did it!");

        System.out.println("------------------------------------");
    }
}

