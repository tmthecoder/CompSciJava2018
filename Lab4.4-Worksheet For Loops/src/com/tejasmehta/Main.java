/****
 * Name: Tejas Mehta
 * Date: November 14, 2018
 * Lab Name: Lab4.4-Worksheet For Loops
 * Extra: I allowed the user to choose the number and how much they wanted to raise it exponentially
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        boolean first = true;
        //Declare all loop booleans and start loop
        while (running) {
            System.out.println("Pick a lab part(1-3) or press any other key to quit");
            String choice = in.nextLine();
            if (!first) {
                choice = in.nextLine();
            }
            //Declare switch
            switch (choice) {
                case "1":
                    //Get number to raise, how many powers and do so accordingly
                    System.out.println("What number do you want to raise exponentially");
                    int numberToRaise = in.nextInt();
                    System.out.println("How many powers of " + numberToRaise + " do you want to show?");
                    int powers = in.nextInt();
                    System.out.println("Here are " + powers + " powers of " + numberToRaise);
                    for (int i = 0; i <= powers; i++) {
                        System.out.println(numberToRaise + "^" + i + " is " + Math.pow(numberToRaise, i));
                    }
                    first = false;
                    break;
                case "2":
                    //Ask for numbers
                    System.out.println("How many numbers do you want to enter?");
                    //Get x amount of numbers and average them and show respective result
                    int numberCount = in.nextInt();
                    double total = 0;
                    for(int i = 0; i < numberCount; i++) {
                        System.out.println("Enter number " + (i+1));
                        double enteredNumber = in.nextInt();
                        total+=enteredNumber;
                    }
                    System.out.println("The total is " + total);
                    System.out.println("The average is " + total/numberCount);
                    first = false;
                    break;
                case "3":
                    //Ask for pet name
                    System.out.println("What's the name of your favorite pet?");
                    String name = in.nextLine();
                    //Ask for times
                    System.out.println("How many times do you want to see their name?");
                    int times = in.nextInt();
                    if (times <= 0) {
                        System.out.println("Your entry was illegal, exiting ...");
                        System.exit(0);
                    }
                    //Ask for horizontally or vertically
                    System.out.println("Would you like it to be arranged horizontally(h) or vertically(v)?");
                    String arrangement = in.nextLine();
                    arrangement = in.nextLine();
                    //Print it according to their choice
                    for (int i = 0; i < times; i++) {
                        switch (arrangement.toLowerCase()) {
                            case "h":
                            case "horizontally":
                                System.out.print(name + " ");
                                if (i == (times - 1)) {
                                    System.out.println("\n");
                                }
                                break;
                            case "v":
                            case "vertically":
                                System.out.println(name);
                                break;
                            default:
                                System.out.println("Illegal choice entry, exiting now ...");
                                System.exit(0);
                                break;
                        }
                    }
                    first = false;
                    break;
                default:
                    //They entered an illegal choice or want to exit, so exit
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
            }
        }
    }
}
