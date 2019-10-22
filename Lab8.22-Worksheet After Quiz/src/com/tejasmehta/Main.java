/****
 * Name: Tejas Mehta
 * Date: April 12, 2019
 * Lab Name: Lab8.22-Worksheet After Quiz
 * Extra: Allowed the user to determine the length of the array
 */
package com.tejasmehta;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //get all arrays and declare init vars
	    int[] numbers = GetArrayContents(in);
	    int[] odds = GetOdds(numbers);
	    int[] evens = GetEvens(numbers);
	    int[] negative = GetNeg(numbers);
	    PrintAll(evens, odds, negative);
    }
    //Function to get all contents
    private static int[] GetArrayContents(Scanner in) {
        System.out.println("How many numbers do you want to enter");
        int numCnt = in.nextInt();
        int[] nums = new int[numCnt];
        for(int i = 0; i < nums.length; i++) {
            System.out.println("Enter number " + (i+1) + ":");
            while (true) {
                int next = in.nextInt();
                //zero check
                if (next != 0) {
                    nums[i] = in.nextInt();
                    break;
                } else {
                    System.out.println("Please enter another number. 0 is not allowed.");
                }
            }
        }
        return nums;
    }
    //Get odds from array
    private static int[] GetOdds(int[] numbers) {
        int[] odds;
        int oddCnt = 0;
        //Get count
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddCnt++;
            }
        }
        odds = new int[oddCnt];
        int cc = 0;
        //Add to array
        for (int number: numbers) {
            if (number % 2 != 0 && number > 0) {
                odds[cc] = number;
                cc++;
            }
        }
        return odds;
    }
    //Function to get even array nums
    private static int[] GetEvens(int[] numbers) {
        int[] evens;
        int evenCnt = 0;
        //Get count
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCnt++;
            }
        }
        evens = new int[evenCnt];
        int cc = 0;
        //Init array and add
        for (int number: numbers) {
            if (number % 2 == 0 && number > 0) {
                evens[cc] = number;
                cc++;
            }
        }
        return evens;
    }
    //Function to get all negatives
    private static int[] GetNeg(int[] numbers) {
        int[] negs;
        int negCnt = 0;
        //Get count
        for (int number : numbers) {
            if (number < 0) {
                negCnt++;
            }
        }
        System.out.println(negCnt);
        negs = new int[negCnt];
        //Init array and add to array
        int cc = 0;
        for (int number: numbers) {
            if (number < 0) {
                negs[cc] = number;
                cc++;
            }
        }
        return negs;
    }
    //Function to print all arrs
    private static void PrintAll(int[] even, int[] odds, int[] negs) {
        System.out.println("Evens: " + Arrays.toString(even));
        System.out.println("Odds: " + Arrays.toString(odds));
        System.out.println("Negatives: " + Arrays.toString(negs));
    }
}
