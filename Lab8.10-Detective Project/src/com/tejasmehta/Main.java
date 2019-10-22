/****
 * Name: Tejas Mehta
 * Date: March 25th, 2019
 * Lab Name: Lab8.10-Detective Project
 * Extra: Let the user enter the nonsense words to decode
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare initial vars & get chars decoded
        Scanner in = new Scanner(System.in);
        String[] coded = getArray(in);
        int[] evenCode = getCodeEven(in);
        int[] oddCode = getCodeOdd(in);
        //Print out message with method getters
        System.out.println("The message is: " + getMessage(evenCode, oddCode, coded));

    }
    private static String[] getArray(Scanner in) {
        System.out.println("How many coded words are there?");
        int length = in.nextInt();
        in.nextLine();
        String[] arr = new String[length];
        for (int i = 0; i < arr.length;i++) {
            System.out.println("Enter word$ #" + (i+1) + ":");
            arr[i] = in.nextLine();
        }
        return arr;
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
