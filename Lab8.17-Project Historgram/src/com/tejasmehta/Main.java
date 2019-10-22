/****
 * Name: Tejas Mehta
 * Date: April 10th, 2019
 * Lab Name: Lab8.17-Project Histogram
 * Extra: Added a user asked range feature(1-x number)
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare initial vars
        int[] histogram = {26, 19, 45, 22, 79, 35, 21, 4, 76, 45, 56, 90, 88, 32, 45, 3, 66, 74, 77, 35, 24, 33, 42, 55, 76, 74, 88, 90};
        Scanner in = new Scanner(System.in);
        //Get user entered increment
        System.out.println("Enter the increment interval: ");
        int increment = in.nextInt();
        //Call function
        MakeHistoGram(histogram, increment);
    }
    //Function to make histogram
    private static void MakeHistoGram(int[] histogram, int increment) {
        //Set all incremental vars
        int r1 = increment;
        int r2 = increment * 2;
        int r3 = increment * 3;
        int r4 = increment * 4;
        int r5 = increment * 5;
        int r6 = increment * 6;
        int r7 = increment * 7;
        int r8 = increment * 8;
        int r9 = increment * 9;
        int r10 = increment * 10;
        //Print initial var
        System.out.print("0-" + r1 + ": ");
        for(int i = 0; i < histogram.length; i++) {
            if (histogram[i] <= r1) {
                System.out.print("*");
            }
        }
        //Print all other ranges
        printRange(histogram, r1, r2);
        printRange(histogram, r2, r3);
        printRange(histogram, r3, r4);
        printRange(histogram, r4, r5);
        printRange(histogram, r5, r6);
        printRange(histogram, r6, r7);
        printRange(histogram, r7, r8);
        printRange(histogram, r8, r9);
        printRange(histogram, r9, r10);

    }
    //Print range function
    private static void printRange(int[] histogram, int r, int r2) {
        System.out.println();
        System.out.print(r + "-" + r2 + ": ");
        for (int i1 : histogram) {
            if (i1 > r && i1 <= r2) {
                System.out.print("*");
            }
        }
    }
}
