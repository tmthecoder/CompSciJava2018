/****
 * Name: Tejas Mehta
 * Date: March 13, 2019
 * Lab Name: Lab8.2-Worksheet Array Sum Percentage
 * Extra: Showed the Average of the amounts in the array
 */
package com.tejasmehta;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declare scanner and ask for nums
	    System.out.println("How many numbers do you want to enter?");
	    int[] numbers = getNums(in.nextInt(), in);
	    //Get the int array through method, and print avg below
        System.out.println("The average is " + average(numbers));
        int sum = sum(numbers);
        //Get sum, and print it below
        System.out.println("The sum of the numbers is " + sum);
        //Get and print stats
        stats(numbers, sum);
    }
    //Function to get numbers
    private static int[] getNums(int length, Scanner in) {
        int[] numbers = new int[length];
        //Declare int array based on passed length, and loop through length to get a number for each value
        for(int i = 0; i < length; i++) {
            System.out.println("Please enter #" + (i + 1) + ".");
            numbers[i] = in.nextInt();
        }
        return numbers;
    }
    //Function to get average
    private static double average(int[] nums) {
        double avg = 0;
        //Loop through array, adding to avg
        for (int num : nums) {
            avg+=num;
        }
        //Return avg divided by length
        return avg/nums.length;
    }
    //Function to get sum
    private static int sum(int[] nums) {
        int total = 0;
        //Loop through array adding to sum
        for (int num : nums) {
            total += num;
        }
        //Return sum
        return total;
    }
    //Function to print out stats
    private static void stats(int[] nums, int sum) {
        //Loop through array and print stats
        for (int num : nums) {
            BigDecimal percent = BigDecimal.valueOf(num).multiply(BigDecimal.valueOf(10000)).divide(BigDecimal.valueOf(sum), RoundingMode.HALF_UP).divide(BigDecimal.valueOf(100));
            System.out.println(num + " is " + percent + "% of the sum");
        }
    }
}
