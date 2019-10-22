/****
 * Name: Tejas Mehta
 * Date: March 15, 2019
 * Lab Name: Lab8.5-Project Lenore
 * Extra: Asked the user to input a custom deciphering code
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare initial vars & get chars decoded
        Scanner in = new Scanner(System.in);
        String[] coded = {"AH3ae", "LaePlc", "QptAr", "BrCiot", "5mOst", "G3eHt", "Sheb", "W4B6yT", "7S4X", "aaeSa"};
        int[] evenCode = getCodeEven(in);
        int[] oddCode = getCodeOdd(in);
        //Print out message with method getters
        System.out.println("The message is: " + getMessage(evenCode, oddCode, coded));

    }

    //Method to get the even code chars
    private static int[] getCodeEven(Scanner in) {
        System.out.println("How many chars for even numbers?");
        return getInts(in);
    }
    //Method to get the dd code chars
    private static int[] getCodeOdd(Scanner in) {
        System.out.println("How many chars for odd numbers?");
        return getInts(in);
    }

    //Method to get the chars for each type of array
    private static int[] getInts(Scanner in) {
        int length = in.nextInt();
        int[] chars = new int[length];
        for(int i = 0; i < chars.length; i++) {
            System.out.println("Enter the character for slot" + (i+1));
            chars[i] = in.nextInt();
        }
        return chars;
    }
    //Method to get message from char arrays and string array
    private static String getMessage(int[] evenCode, int[] oddCode, String[] coded) {
        String message = "";
        //Init message, and for loops
        for(int i = 0; i < coded.length; i++) {
            //even check & get chars
            if(i % 2 == 0) {
                for (int i1 : evenCode) {
                    message = message + coded[i].charAt(i1 - 1);
                }
            } else {
                for (int i1 : oddCode) {
                    message = message + coded[i].charAt(i1 - 1);
                }
            }
        }
        //return final mesaage
        return message;
    }
}
