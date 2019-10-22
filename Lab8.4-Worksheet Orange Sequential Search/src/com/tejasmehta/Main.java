/****
 * Name: Tejas Mehta
 * Date: March 15, 2019
 * Lab Name: Lab8.4-Worksheet Orange Sequential Search
 * Extra: Let the user decide which fruits to enter in the array
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare scanner
        Scanner in = new Scanner(System.in);
        System.out.println("You are going to enter 10 different fruit names... Make sure orange is one!");
        //Let them know what they are doing, abd start process to get fruit
        String[] fruits = getFruits(in);
        //Print count of oranges
        System.out.println("There are " + orangeCnt(fruits) + " oranges in your entry");
    }
    //Method to get fruits from user entry
    private static String[] getFruits(Scanner in) {
        //Declare init array
        String[] fruits = new String[10];
        //Loop through and add to array based on entry
        for(int i = 0; i < fruits.length; i++) {
            System.out.println("Enter fruit #" + (i + 1) + ":");
            fruits[i] = in.nextLine();
        }
        return fruits;
    }
    //Method to get count of orange
    private static int orangeCnt(String[] fruits) {
        int oranges = 0;
        //Set init count to none and loop through array checking if orange
        for (String fruit : fruits) {
            if (fruit.toLowerCase().equals("orange")) {
                oranges += 1;
            }
        }
        return oranges;
    }
}
