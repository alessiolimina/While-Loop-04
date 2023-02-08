package it.develhope.whileloop;

import java.util.Random;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        System.out.println("--------------Starting--------------");

        int number;
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        int userNumber;

        System.out.println("Welcome! Try to guess the number! Type a number: ");

        number = randomNumber.nextInt(1, 10);
        do {userNumber = input.nextInt();
        } while (userNumber != number);

        System.out.println("Congratulations! You did it! ");

        System.out.println("------------------------------------");
    }
}

