/****
 * Name: Tejas Mehta
 * Date: March 19th, 2019
 * Lab Name: Lab8.6-Worksheet Binary Search
 * Extra: Asked the user for a number to search for as well as looping it os they can search for multiple numbers
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Initialize loop
        while (true) {
            //Declare scanner & array
            Scanner in = new Scanner(System.in);
            int[] nums = {11, 16, 22, 23, 34, 46, 48, 50, 75, 78};
            System.out.println("What number would you like to search for?");
            //Get user's choice for number to search for and search for ir
            int numSearch = in.nextInt();
            binarySearch(numSearch, nums.length, 0, nums);
            in.nextLine();
            //Ask for another search, and either continue or exit
            System.out.println("Would you like to search for another number?");
            String choice = in.nextLine();
            if (choice.toLowerCase().equals("y") || choice.toLowerCase().equals("yes")) {
                System.out.println("Okay! Restarting....");
            } else {
                System.out.println("Okay! Exiting ....");
                System.exit(0);
            }
        }

    }
    //Method to perform binary search
    private static void binarySearch(int key, int upBound, int lowBound, int[] arr) {
        //Declare initial vars
      int position = (lowBound + upBound)/2;
      int compcount = 1;
      //Check that the array doesn't equal the key already and that bounds are correctly set
      while ((arr[position] != key) && (lowBound <= upBound)) {
          compcount++;
          //Incemement comp and check if it's above or below and increment accordingly
          if(arr[position] >= key) {
              upBound = position - 1;
          } else {
              lowBound = position + 1;
          }
          //Reset position
          position = (lowBound+upBound)/2;
      }
      //Check if number was found or not and print result accordingly
      if(lowBound <= upBound) {
          System.out.println(key + " was found in the array at position " + position + ". " + compcount + " comparisons were made");
      } else {
          System.out.println(key + " wasn't found in the array. " + compcount + " comparisons were made");
      }
    }
}
