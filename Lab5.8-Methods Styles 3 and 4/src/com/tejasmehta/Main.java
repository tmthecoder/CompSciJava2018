/****
 * Name: Tejas Mehta
 * Date: January 8th, 2019
 * Lab Name: Lab5.8-Methods Style 3 and 4
 * Extra: Added the subtraction on the 2nd part of the lab.
 */
package com.tejasmehta;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        //declare scanner and loop
        while (true) {
            System.out.println("Enter a choice of part(1-6) or press any other key to quit");
            //get choice
            String choice = in.nextLine();
            switch (choice) {
                case "1":
                    //Ask for word and number, call function
                    System.out.println("Enter your favorite word");
                    String word = in.nextLine();
                    System.out.println("Enter your favorite number");
                    int num = in.nextInt();
                    numWord(word, num);
                    break;
                case "2":
                    //Ask for 2 ints and call the 3 functions
                    System.out.println("Enter an integer");
                    int int1 = in.nextInt();
                    System.out.println("Enter another integer");
                    int int2 = in.nextInt();
                    sumInt(int1, int2);
                    prodInt(int1, int2);
                    subtInt(int1, int2);
                    break;
                case "3":
                    //Ask for name and call function
                    System.out.println("Enter your name");
                    String name = in.nextLine();
                    namePrint(name);
                    break;
                case "4":
                    //Ask for days overdue and call function
                    System.out.println("How many days has your book been overdue?");
                    int days = in.nextInt();
                    daysOvrdue(days);
                    break;
                case "5":
                    //Ask for positive int and call summation function
                    System.out.println("Enter a positive integer");
                    int num2 = in.nextInt();
                    summation(num2);
                    break;
                case "6":
                    //Call radius function for each nunber and print as such
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("Radius: " + i + ", Area: " + areaCircle(i));
                    }
                    break;
                default:
                    //Exit program
                    System.out.println("Exiting ...");
                    System.exit(0);
            }
        }
    }
    private static void numWord(String word, int num) {
        //pront name num amount of times
        for(int i = 0; i < num; i++) {
            System.out.println(word);
        }
     }
    private static void sumInt(int one, int two) {
        //print sum
         System.out.println("The sum of the numbers is " + (one + two));
    }
    private static void prodInt(int one, int two) {
        //print product
         System.out.println("The product of the two numbers is " + (one * two));
    }
    private static void subtInt(int one, int two) {
        //print difference
         System.out.println("The difference of the two numbers is " + (one - two));
    }
    private static void namePrint(String name) {
        //Print different letter on each line
         for(int i = 0; i < name.length(); i++) {
             System.out.println(name.charAt(i));
         }
         //Print goodbye
         System.out.println("Goodbye " + name);
    }
    private static void daysOvrdue(int days) {
        //Get overdue price at 0.15 a day
        double ovrDuePrce = days * 0.15;
        //Print accordingly to days overdue
        if (days > 10) {
            System.out.println("Your price is " + ovrDuePrce + " and your book is WAY OVERDUE");
        } else {
            System.out.println("Your price to pay is " + ovrDuePrce);
        }
    }
    private static void summation(int num) {
        //declare summation
        int summation = 0;
        //for loop to increment summation based on num
        for (int i = 0; i < num; num--) {
            summation+=num;
        }
        //print final
        System.out.println("The summation of the number is " + summation);
    }
    private static double areaCircle(int radius) {
        //Get area and return it
        double area = radius * radius;
        area = area * 3.14;
        return round(area, 1);
    }
    private static double round(double value, int places) {
        //Round to x places by changing to bigdecimal and adding a roundingmode
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
