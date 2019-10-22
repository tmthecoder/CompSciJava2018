/****
 * Name: Tejas Mehta
 * Date: March 7th, 2019
 * Lab Name: Lab 7.5-Worksheet Stats
 * Extra: Urtilized the use of smarter, more handling logic, as it would be less exception-prone and faster in terms of handling
 */
package com.tejasmehta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static File file = new File("src/ScoreData.txt");
    //Declare initial vars and array to reduce reusing of code
    private static List<Integer> vals = new ArrayList<>();
    private static List<Integer> squaredDiffVals = new ArrayList<>();
    public static void main(String[] args) {
        //Start wile loop
        while (true) {
            Scanner in = new Scanner(System.in);
            //Declare scanner and ask to start
            System.out.println("Press y to start the statistical process:");
            String ans = in.nextLine();
            if (ans.toLowerCase().equals("y") || ans.toLowerCase().equals("yes")) {
                //Start the process and print the result from methods
                System.out.println("There are " + countNext(in) + " values in the doc");
                int mean = mean();
                System.out.println("The mean of the data is " + mean);
                System.out.println("The squared differences are: " + squaredDiffs(mean));
                int sum = sqDiffSum();
                System.out.println("The sum of the squared differences is: " + sum);
                double variance = variance(sum);
                System.out.println("The variance is: " + variance);
                System.out.println("The standard deviation is: " + standardDeviation(variance));

            } else {
                //Exit
                System.out.println("Okay, exiting");
                System.exit(0);
            }
        }
    }
    //Method to count all vars and input in arrays
    private static int countNext(Scanner in) {
        int counter = 0;
        try {
            //Attach scanner
            in = new Scanner(file);
            while (in.hasNext()) {
                //Add to vals and increase counter
                vals.add(Integer.parseInt(in.next()));
                counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return counter;
    }
    //Get the mean of all vals in the array
    private static int mean() {
        int mean = 0;
        for (Integer val : vals) {
            mean += val;
        }
        return mean/vals.size();
    }
    //Get the squared differences of the values, using vals(array) and the mean
    private static String squaredDiffs(int mean) {
        int sqDiff = 0;
        String returning = "";
        for (Integer val : vals) {
            sqDiff = 0;
            sqDiff = val-mean;
            squaredDiffVals.add(sqDiff);
            returning = returning + sqDiff + " ";
        }

        return returning;
    }
    //Get the sum of the squared differences(from the squaredDiffVals array)
    private static int sqDiffSum() {
        int sum = 0;
        for (Integer val : squaredDiffVals) {
            sum+=val;
        }
        return sum;
    }
    //Get the variance
    private static double variance(int sum) {
        return Double.parseDouble(String.valueOf(sum))/vals.size();
    }
    //Get the square root
    private static double standardDeviation(double variance) {
        return Math.sqrt(variance);
    }
}
