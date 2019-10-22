/****
 * Name: Tejas Mehta
 * Date: December 12, 2018
 * Lab Name: Lab5.2-Method3&4
 * Extra: I let users enter the power they choose, so they can raise it to any power
 */
package com.tejasmehta;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    boolean running = true;
	    //Declare base variables and start loops
	    Scanner in = new Scanner(System.in);
	    while (running) {
            System.out.println("Pick a lab(1-3) or press any other key to quit");
            //Ask the user to pick their choice
            String choice = in.nextLine();
            switch (choice){
                case "1":
                    //They chose 1, ask them to enter a number and call the function
                    System.out.println("Enter a number below:");
                    int number = in.nextInt();
                    System.out.println("The number doubled is:" + doubleNum(number));
                    break;
                case "2":
                    //They picked 2, ask them to enter two numbers and call the function
                    System.out.println("Enter the first number: ");
                    BigDecimal firstNum = BigDecimal.valueOf(in.nextDouble());
                    System.out.println("Enter the second number: ");
                    BigDecimal secondNum = BigDecimal.valueOf(in.nextDouble());
                    System.out.println("The Harmonic mean is: " + getHarmonicMean(firstNum, secondNum));
                    break;
                case "3":
                    //They picked 3, ask them to enter a number and what they want to raise it to
                    System.out.println("Enter a number below:");
                    BigDecimal numberToRaise = BigDecimal.valueOf(in.nextDouble());
                    System.out.println("What power do you want to raise it to?");
                    int powerToRaise = in.nextInt();
                    System.out.println(numberToRaise + " to the " + powerToRaise + " power is " + raiseNum(numberToRaise, powerToRaise));
                    break;
                default:
                    //Wrong input, or they want to exit so exit
                    System.exit(0);
            }
        }
    }
    //Double number function, no explanation needed
    public static int doubleNum(int number){
        return (number * 2);
    }
    //Get harmonic mean
    public static BigDecimal getHarmonicMean(BigDecimal num1, BigDecimal num2) {
        //Declare all variables
        BigDecimal inv1, inv2, added, mean, invMean;
        //Get inverses
        inv1 = BigDecimal.ONE.divide(num1, 2, RoundingMode.HALF_UP);
        inv2 = BigDecimal.ONE.divide(num2, 2, RoundingMode.HALF_UP);
        //Add the 2
        added = inv1.add(inv2);
        //Get the mean
        mean = added.divide(BigDecimal.valueOf(2), RoundingMode.HALF_UP);
        //Invert the mean
        invMean = BigDecimal.ONE.divide(mean, RoundingMode.HALF_UP);
        return invMean;
    }
    //Function to raiseNum
    public static BigDecimal raiseNum(BigDecimal num, int raise) {
        BigDecimal raisedNum = num;
        //Check if it is greater than 0
        if (raise > 0) {
            //For loop to keep multiplying as bigdecimal has no supported power function
            for (int i = 1; i < raise; i++) {
                raisedNum = raisedNum.multiply(num);
            }
        } else {
            //Return 1
            raisedNum = BigDecimal.ONE;
        }
        return raisedNum;
    }
}
