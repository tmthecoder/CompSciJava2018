/****
 * Name: Tejas Mehta
 * Date: 10 January 2018
 * Lab Name: Lab5.x-Unit Test
 * Extra: None needed as it is a Test
 */
package com.tejasmehta;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare scannner and start loop
        Scanner in = new Scanner(System.in);
        while (true) {
            //Ask for choice
            System.out.println("Enter your lab choice(1 or 2) or press another key to quit");
            String choice = in.nextLine();
            switch (choice) {
                case "1":
                    //call asterisk 3 time and love once
                    printAsteric();
                    printLove();
                    printAsteric();
                    printAsteric();
                    break;
                case "2":
                    //Ask for name, and 2 scores and call avg function
                    System.out.println("Enter your name");
                    String name = in.nextLine();
                    System.out.println("Enter your mid-term test score");
                    BigDecimal midTest = BigDecimal.valueOf(in.nextDouble());
                    System.out.println("Enter your final test score");
                    BigDecimal finalScore = BigDecimal.valueOf(in.nextDouble());
                    averageScores(name, midTest, finalScore);
                    break;
                default:
                    //Exit
                    System.out.println("Exiting....");
                    System.exit(0);
            }
        }
    }

    private static void printAsteric() {
        //For loop to print asterisks and line after
        for(int i = 0; i < 50; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }
    private static void printLove(){
        //Print java love
        System.out.println("I love Java! It's such a great language, easy to learn, and well used with good handling!");
    }
    private static void averageScores(String name, BigDecimal midTerm, BigDecimal finalScore) {
        //Calculate average and round
        finalScore = finalScore.multiply(BigDecimal.valueOf(2));
        BigDecimal average = midTerm.add(finalScore);
        average = average.divide(BigDecimal.valueOf(3), RoundingMode.HALF_UP);
        //check if 80 or less and print accordingly
        if (average.compareTo(BigDecimal.valueOf(80)) == -1) {
            System.out.println("You should consult your advisor, " + name + ", about your major.");
        } else {
            System.out.println("You are doing well in your major, " + name);
        }
    }
}
