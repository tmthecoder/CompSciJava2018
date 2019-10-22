/****
 * Name: Tejas Mehta
 * Date: November 6, 2018
 * Lab Name: Lab4.3-Worksheet Do While
 * Extra: I added the option to use 2 user-inputted numbers for the first part, and made 3 difficulty options for the mini guessing game
 */
package com.tejasmehta;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	    boolean running = true;
        Scanner in = new Scanner(System.in);
        //Start loop and declare scanner
	    while (running) {
            System.out.println("Pick your lab choice(1 or 2) or press any other key to quit");
            String choice = in.nextLine();
            //Declare switch to get user's lab choice
            switch (choice) {
                case "1":
                    //get first and second number
                    System.out.println("Enter a number below:");
                    int firstNumber = in.nextInt();
                    System.out.println("Enter another number below:");
                    int secondNumber = in.nextInt();
                    //check if first is greater
                    if (firstNumber > secondNumber) {
                        //Check if it is even
                        if (secondNumber % 2 != 0) {
                            secondNumber++;
                        }
                        System.out.println("Even numbers from " + secondNumber + " to " + firstNumber);
                        //Print the even numbers between the 2 numbers
                        do {
                            System.out.println(secondNumber);
                            secondNumber += 2;
                        } while (secondNumber <= firstNumber);
                    //Second is greater
                    } else {
                        //Check if it is even
                        if (firstNumber % 2 != 0) {
                            firstNumber++;
                        }
                        System.out.println("Even numbers from " + firstNumber + " to " + secondNumber);
                        do {
                            System.out.println(firstNumber);
                            firstNumber += 2;
                        } while (firstNumber <= secondNumber);
                    }

                    break;
                case "2":
                    //Ask for difficulty
                    System.out.println("Pick a difficulty: Easy(Enter E), Medium(Enter M), Hard(Enter H)");
                    String difficulty = in.nextLine();
                    //Check which difficulty was entered
                    switch (difficulty.toLowerCase()) {
                        case "e":
                        case "easy": {
                            //Get a random number between 1 and 50
                            int randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
                            System.out.println("Guess a number between 1 and 50, inclusive.");
                            //Start the guessing game function
                            GuessingGame(in, randomNum);
                            break;
                        }
                        case "m":
                        case "medium": {
                            //Get a random number between 1 and 100
                            int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
                            System.out.println("Guess a number between 1 and 100, inclusive.");
                            //Start the guessing game function
                            GuessingGame(in, randomNum);
                            break;
                        }
                        case "h":
                        case "hard": {
                            //Get a random number between 1 and 200
                            int randomNum = ThreadLocalRandom.current().nextInt(1, 200 + 1);
                            System.out.println("Guess a number between 1 and 200, inclusive.");
                            //Start the guessing game function
                            GuessingGame(in, randomNum);
                            break;
                        }
                    }
                    break;
                default:
                    //Exit the program if there is a wrong entry
                    running = false;
                    System.out.println("exiting program...");
                    System.exit(0);
                    break;
            }
        }
    }

    private static void GuessingGame(Scanner in, int randomNum) {
        //Declare integers for game
        int guessNum;
        int guessesTaken = 0;
        //Start loop while their guess doesn't equal the random
        do {
            System.out.println("Enter your guess:");
            guessNum = in.nextInt();
            //print values according to guess and increment counter if needed
            if (guessNum > randomNum) {
                System.out.println("Too high");
                guessesTaken++;
            } else if (guessNum < randomNum) {
                System.out.println("Too low");
                guessesTaken++;
            } else {
                System.out.println("Correct! It took you " + guessesTaken + " guesses!");
            }
        } while(guessNum != randomNum);
    }
}
