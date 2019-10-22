/****
 * Name: Tejas Mehta
 * Date: March 15th, 2019
 * Lab Name: Lab8.3-Worksheet Numbers
 * Extra: Asked the user for how many array entries they would like to enter
 */
package com.tejasmehta;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to enter");
        //Ask for their entry
        int nums = in.nextInt();
        //Call method to get the num array
        int[] numbers = getNumbers(nums, in);
        System.out.println("The first element of the array is: " + numbers[0]);
        //Print first & last elements
        System.out.println("The last element of the array is: " + numbers[nums-1]);
        Print_It(numbers);
        //Print sorted and Avg
        System.out.println("The average is: " + Average(numbers));
    }
    //Method to get the numbers via user entry
    private static int[] getNumbers(int length, Scanner in) {
        int[] numbers = new int[length];
        //Loop through to get each number
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Enter #" + (i + 1) + ":");
            numbers[i] = in.nextInt();
        }
        return numbers;
    }
    //Method to sort and print array
    private static void Print_It(int[] nums) {
        Arrays.sort(nums);
        System.out.println("The array sorted is: " + Arrays.toString(nums));
    }
    //Method to get the average
    private static double Average(int nums[]) {
        int total = 0;
        //Loop through, getting a total
        for (int num : nums) {
            total += num;
        }
        //Return total divided by length for avg
        return (double)total/nums.length;
    }
}
