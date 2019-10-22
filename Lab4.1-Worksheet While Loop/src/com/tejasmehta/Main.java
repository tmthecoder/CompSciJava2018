/****
 * Name: Tejas Mehta
 * Date: November 2, 2018
 * Lab Name: Lab4.1-Worksheet While Loop
 * Extra: Allows the user to enter their own range of numbers to print the odd numbers in between, as well as made it bi-directional, allowing them to enter either number as greater or less.
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare scanner
        Scanner in = new Scanner(System.in);
        boolean running = true;
        //Set running and start loop
        while (running) {
            System.out.println("Enter the lab you want to pick(1-3) or press any other key to quit");
            //get lab choice and check which was chosen
            String choice = in.nextLine();
            switch (choice) {
                case "1":
                    //Perform actions for choice 1, and print the respective numbers
                    System.out.println("Numbers are:");
                    int counter = 10;
                    while (counter >= 1) {
                        System.out.println(counter);
                        counter--;
                    }
                    break;
                case "2":
                    //get the two numbers
                    System.out.println("Enter the first number");
                    int firstNum = in.nextInt();
                    System.out.println("Enter the second number");
                    int secondNum = in.nextInt();
                    //check which is greater and call function respectively
                    System.out.println("Numbers are:");
                    if (firstNum < secondNum) {
                        numberWhilePrint(secondNum, firstNum);
                    } else {
                        numberWhilePrint(firstNum, secondNum);
                    }
                    break;
                case "3":
                    //Get user's name
                    System.out.println("Enter your name:");
                    String name = in.nextLine();
                    //declare int i
                    int i = 0;
                    //start while loop and get char at
                    while (i < name.length()) {
                        System.out.println((i + 1) + ". " + name.charAt(i));
                        i++;
                    }
                    //Print out name and letter amount
                    System.out.println(name + ", there are " + name.length() + " letters in your first name.");
                    break;
                default:
                    //Set running to false and exit the program
                    running = false;
                    System.exit(0);
                    break;
            }
        }
    }

    //function get odd numbers between numbers
    private static void numberWhilePrint(int greater, int less) {
        //check if number entered is even
        if (less % 2 == 0) {
            //add one if it is
            less++;
            //start loop
            while (less < greater) {
                System.out.println(less);
                less+=2;
            }
        } else {
            //Number is odd, just start loop
            while (less < greater) {
                System.out.println(less);
                less+=2;
            }
        }
    }
}
