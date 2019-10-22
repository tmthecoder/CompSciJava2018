/****
 * Name: Tejas Mehta
 * Lab Name: Lab6.5-Worksheet Time Random
 * Date: February 14, 2019
 * Extra: I added an ask for the user to check for which number they want to roll to for the 4th lab
 */
package com.tejasmehta;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declare initial vars
        Random value = new Random();
        while (true) {
            System.out.println("Enter a choice of labs(1-4) or any other key to quit");
            //Ask for user's choice
            String choice = in.nextLine();
            //Based on choice, call the specific function per case
            switch (choice) {
                case "1":
                    randNum(value);
                    break;
                case "2":
                    twoDice(value);
                    break;
                case "3":
                    randScore(value);
                    break;
                case "4":
                    diceRoll(value, in);
                    break;
                default:
                    //Invalid or exiting entry, exit program
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
    private static void randNum(Random value) {
        //get a random between 15 and print
        int randomNum = value.nextInt(15);
        System.out.println("The random number is " + randomNum);
    }
    private static void twoDice(Random value) {
        //Get 2 randoms and add them
        int dice1 = value.nextInt(5) + 1;
        int dice2 = value.nextInt(5) + 1;
        int toss = dice1 + dice2;
        System.out.println("Dice 1 is: " + dice1 + ". Dice 2 is: " + dice2 + ". The total is " + toss);
    }
    private static void randScore(Random value) {
        //Get a random within bounds and print it
        int score = value.nextInt(43) + 35;
        System.out.println("Your score is " + score);
    }
    private static void diceRoll(Random value, Scanner in) {
        System.out.println("What number would you like the dice to roll?");
        //Ask number for roll
        int rollNum = in.nextInt();
        int diceRoll = 0;
        int counter = 0;
        //Check random over and over until it equals the number wanted
        while (diceRoll != rollNum) {
            diceRoll = value.nextInt(5) + 1;
            counter++;
            System.out.println("The roll is: " + diceRoll);
        }
        System.out.println("It took " + counter + " times to a roll of " + rollNum);
    }
}
