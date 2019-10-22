/****
 * Name: Tejas Mehta
 * Date: March 19th, 2019
 * Lab Name: Lab8.7-Worksheet Sort
 * Extra: Asked the user if they wanted to sort in ascending or descending order
 */
package com.tejasmehta;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare main scanner and arrays
	    Scanner in = new Scanner(System.in);
	    boolean ascending = false;
	    int[] bubbleSort = {65, 45, 34, 12, 99, 54, 39, 2, 88, 18};
	    double[] exchangeSort = {43.2, 13.6, 91.4, 23.6, 72.1};
	    String[] alphabetic = {"a", "g", "k", "j", "t", "i", "f", "s", "w", "b"};
        System.out.println("Enter a for ascending order and d for descending order");
        //Ask for ascending or descending
        String order = in.nextLine();
        ascending = order.equals("a");
        //Call sorting methods
        BubbleSort(bubbleSort, ascending);
        ExchangeSort(exchangeSort, ascending);
        AlphabetSort(alphabetic, ascending);


    }
    //Method to bubblesort numbers
    private static void BubbleSort(int[] arr, boolean ascending) {
        int j;
        boolean flag = true;
        int temp;
        //While flag is true
        while (flag) {
            flag = false;
            for(j=0; j < arr.length-1; j++) {
                //Check for ascending or descending and perform sort if needed
                if(ascending) {
                    if (arr[j] > arr[j+1]) {
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        flag = true;
                    }
                } else {
                    if (arr[j] < arr[j+1]) {
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        flag = true;
                    }
                }
            }
        }
        System.out.println("The sorted array is: " + Arrays.toString(arr));
    }
    //Method to exchangesort
    private static void ExchangeSort(double[] arr, boolean ascending) {
        int i, j;
        double temp;
        //Loop through array
        for(i = 0; i < arr.length -1; i++) {
            for(j = i + 1; j < arr.length; j++) {
                //Check for ascending or descending and perform sort if needed
                if(ascending) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                } else {
                    if(arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println("The sorted array is: " + Arrays.toString(arr));
    }
    //Method to alphabet bubble sort
    private static void AlphabetSort(String[] arr, boolean ascending) {
        int j;
        boolean flag = true;
        String temp;
        //While flag is true
        while (flag) {
            flag = false;
            for(j = 0; j < arr.length-1; j++) {
                //Check ascending and perform actions accordingly
                if (ascending) {
                    if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        flag = true;
                    }
                } else {
                    if (arr[j].compareToIgnoreCase(arr[j+1]) < 0) {
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        flag = true;
                    }
                }
            }
        }
        System.out.println("The sorted array is: " + Arrays.toString(arr));
    }
}
