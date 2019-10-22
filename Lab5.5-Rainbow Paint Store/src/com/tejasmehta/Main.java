/****
 * Name: Tejas Mehta
 * Date: December 20, 2018
 * Lab Name: Lab5.5-Rainbow Paint Store
 * Extra: Added another paint color, blue with its own price.
 */
package com.tejasmehta;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    //Declare all initial vars
	    int redCount = 0;
	    int greenCount = 0;
	    int blueCount = 0;
	    boolean first = true;
	    //Start loop
	    while (true) {
            System.out.println("Welcome to the paint store!\nEnter the number of the paint type you would like to buy(or any other to get a total):\n1. Red(21.95)\n2. Green(19.95)\n3. Blue(17.95)");
            //Ask for the users paint choice
            String choice = in.nextLine();
            if (!first) {
                //Check if it isn't first time to prevent scanner glitch
                choice = in.nextLine();
            }
	        first = false;
            //Switch for choice
	        switch (choice) {
                case "1":
                    //Increment red count
                    redCount += redPaint(in);
                    break;
                case "2":
                    //Increment green count
                    greenCount += greenPaint(in);
                    break;
                case "3":
                    //Increment blue count
                    blueCount += bluePaint(in);
                    break;
                default:
                    //Get total and exit
                    System.out.println("Your total cost is: " + getTotal(redCount, greenCount, blueCount));
                    System.exit(0);
            }
        }
    }

    public static int redPaint(Scanner in) {
        //Ask for red amount
        System.out.println("Enter the amount of cans of red paint you would like to buy");
        //Add to cans and return
        int cans = in.nextInt();
        return cans;
    }
    public static int bluePaint(Scanner in) {
        //Ask for blue amount
        System.out.println("Enter the amount of cans of blue paint you would like to buy");
        //Add to cans and return
        int cans = in.nextInt();
        return cans;
    }
    public static int greenPaint(Scanner in) {
        //Ask for green count
        System.out.println("Enter the amount of cans of green paint you would like to buy");
        //Add to cans and return
        int cans = in.nextInt();
        return cans;
    }
    public static BigDecimal getTotal(int red, int green, int blue) {
        //Get the costs by multiplying the amount by the respective price
        BigDecimal redCost = BigDecimal.valueOf(red).multiply(BigDecimal.valueOf(21.95));
        BigDecimal blueCost = BigDecimal.valueOf(blue).multiply(BigDecimal.valueOf(17.95));
        BigDecimal greenCost = BigDecimal.valueOf(green).multiply(BigDecimal.valueOf(19.95));
        //Add all costs and return total
        BigDecimal total = redCost.add(blueCost.add(greenCost));
        return total;
    }
}
