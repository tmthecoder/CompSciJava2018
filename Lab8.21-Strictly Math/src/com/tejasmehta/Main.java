/****
 * Name: Tejas Mehta
 * Date: April 12, 2019
 * Lab Name: Lab8.21-Strictly Math
 * Extra: Averaged the odd & even numbers & allowed the user to determine the length of the random array
 */
package com.tejasmehta;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declare scanner and start loop
        while (true) {
            System.out.println("enter a lab option(1-3) or press any other key to quit");
            //Ask and get choice
            String choice = in.nextLine();
            //Call function based on choice
            switch (choice) {
                case "1":
                    OddEven(in);
                    break;
                case "2":
                    int[] palindromeChk = {100, 101, 122, 102, 101, 202, 211, 224, 331, 789};
                    PalendromeCheck(palindromeChk);
                    break;
                case "3":
                    StatisticalChkRandom();
                    break;
                default:
                    System.out.println("Exiting");
                    System.exit(0);
            }
        }
    }
    //Function for odd & even rancoms
    private static void OddEven(Scanner in) {
        System.out.println("How many random numbers?");
        Random random = new Random();
        int randCount = in.nextInt();
        //Get randoms
        int[] rands = new int[randCount];
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        for(int i = 0; i < rands.length; i++) {
            //Populate array and check odd or even
            rands[i] = random.nextInt(100);
            if (rands[i] % 2 == 0) {
                evens.add(rands[i]);
            } else {
                odds.add(rands[i]);
            }
        }
        //Print both
        System.out.println("Even numbers: " + evens.toString());
        System.out.println("Odd Numbers: " + odds.toString());
        in.nextLine();
    }
    //function to check palindromes
    private static void PalendromeCheck(int[] checkNums) {
        for (int checkNum : checkNums) {
            //Loop through and flip each number
            int num = checkNum;
            int reversenum = 0;
            while (num != 0) {
                reversenum = reversenum * 10;
                reversenum = reversenum + num % 10;
                num = num / 10;
            }
            //Check if palindrome
            if (reversenum == checkNum) {
                System.out.println(checkNum + " is a palindrome");
            } else {
                System.out.println(checkNum + " is not a palindrome");
            }
        }
    }
    //Function to statistic check
    private static void StatisticalChkRandom() {
        Random random = new Random();
        int[] rands = new int[25];
        //Make array and populate it
        int total = 0;
        for(int i = 0; i < rands.length; i++) {
            rands[i] = random.nextInt(100);
            total+=rands[i];
        }
        //Get mean
        double mean = (double) total/25;
        System.out.println("The mean is: " + mean);
        Arrays.sort(rands);
        //Get median, min and max, and range
        System.out.println("The median is " + rands[(rands.length - 1)/2]);
        System.out.println("The maximum value is: " + rands[rands.length - 1]);
        System.out.println("The minimum value is: " + rands[0]);
        System.out.println("The range is: " + (rands[rands.length - 1] - rands[0]));
        int varTotal = 0;
        //Get variance
        for (int rand : rands) {
            varTotal += Math.pow((rand - mean), 2);
        }
        double variance = (double) varTotal/25;
        System.out.println("The variance is: " + variance);
        //get deviation
        System.out.println("The standard deviation is: " + Math.sqrt(variance));
    }
}
