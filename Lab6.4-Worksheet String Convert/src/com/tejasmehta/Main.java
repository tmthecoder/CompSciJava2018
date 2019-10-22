/****
 * Name: Tejas Mehta
 * Lab Name: Lab6.4-Worksheet String Convert
 * Date: February 14, 2019
 * Extra: Asked the user to enter any random string of numbers and letters for the second one
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declare initial vars and loop
        while (true) {
            System.out.println("Enter a choice of labs(1-3) or press any key to quit");
            //Ask and get choice
            String choice = in.nextLine();
            switch (choice) {
                //According to choice, go to respective function
                case "1":
                    horsesCount();
                    break;
                case "2":
                    stringNumParse(in);
                    break;
                case "3":
                    launchSequence();
                    break;
                default:
                    //Exit as invalid entry
                    System.out.println("Exiting....");
                    System.exit(0);
            }
        }
    }
    private static void horsesCount() {
        //Parse the amount of numbers and get a substring and multiply
        String horsesAmnt = "35 Horses";
        int numCnt = 0;
        for(int i = 0; i < horsesAmnt.length(); i++) {
            if (Character.isDigit(horsesAmnt.charAt(i))) {
                numCnt++;
            }
        }
        int horseNum = Integer.parseInt(horsesAmnt.substring(0, numCnt));
        System.out.println(horseNum + " horses have " + (horseNum * 4) + " legs!");
    }
    private static void stringNumParse(Scanner in) {
        //Ask for a jumbled string
        System.out.println("Enter a Jumbled String");
        String jumbled = in.nextLine();
        String allNum = "";
        //Get its length and append allNum and total everytime a number is seen
        int total = 0;
        for(int i = 0; i < jumbled.length(); i++) {
            if (Character.isDigit(jumbled.charAt(i))) {
                allNum = allNum + jumbled.charAt(i);
                total += Integer.parseInt(String.valueOf(jumbled.charAt(i)));
            }
        }
        int onlyNums = Integer.parseInt(allNum);
        //Print it our
        System.out.println("The string with only numbers is: " + onlyNums);
        System.out.println("The total of the numbers is: " + total);
    }
    private static void launchSequence() {
        //Set the string
        String launch = "54321";
        int total = 0;
        //Add each number to the launch string and totaling function.
        for (int i = 0; i < launch.length(); i++) {
            if (i == 0) {
                System.out.print(launch.charAt(i));
            } else {
                System.out.print("-" + launch.charAt(i));
            }
            total += Integer.parseInt(String.valueOf(launch.charAt(i)));
        }
        //Print answer
        System.out.print(" Go!\n");
        System.out.println(total + " Go!");
    }
}
