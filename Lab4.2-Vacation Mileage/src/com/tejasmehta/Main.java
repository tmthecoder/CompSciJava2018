/****
 * Name: Tejas Mehta
 * Date: November 2nd, 2018
 * Lab Name: Lab4.2-Vacation Mileage
 * Extra: Asked for an input of whether the user enjoyed their vacation
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        //start running bool and set all variables
        int i = 1;
        double milesTraveled = 0;
        double gallonsBought = 0;
        //start loop
        while (running) {
            System.out.println("\nEnter miles traveled for week " + i);
            //get miles for week
            double currentInput = in.nextDouble();
            //add total to the total miles
            milesTraveled = milesTraveled+currentInput;
            //if it's -99, start the exit sequence
            if (currentInput == -99) {
                System.out.println("Vacation Over! Did you enjoy your vacation?");
                String input = in.nextLine();
                input = in.nextLine();
                //ask if they liked their vacation and exit
                if (input.equals("yes") || input.equals("Yes")) {
                    System.out.println("That's the correct answer!");
                    System.exit(0);
                } else {
                    System.out.println("Sorry, wrong answer!");
                    System.exit(0);
                }
                running = false;
                break;
            } else {
                //ask amount of gasoline
                System.out.println("Enter the amount of gasoline purchased");
                gallonsBought = gallonsBought+in.nextDouble();
                gallonsBought = round(gallonsBought, 2);
                //get miles per gallon
                double mpg = milesTraveled/gallonsBought;
                //round it
                mpg = round(mpg, 2);
                //Print the various amounts, and start the loop again
                System.out.println("\nWeek: " + i);
                System.out.println("Vacation miles traveled:" + milesTraveled);
                System.out.println("Vacation gallons purchased:" + gallonsBought);
                System.out.println("MPG for the Vacation: " + mpg);
                i++;
            }
        }
    }

    //Function to round numbers to x place
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp/factor;
    }
}
