/****
 * Name: Tejas Mehta
 * Date: October 29, 2018
 * Lab Name: Unit 3 Test
 * Extra: None Needed
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your choice of lab(Pick 1 for 24, Pick 2 for 25)");
        String choice = in.nextLine();
        //get choice and check which choice was picked
        switch (choice) {
            case "1":
                //get the temperature
                System.out.println("Enter the temperature:");
                int temp = in.nextInt();
                //check the temperature and print the respective output
                if (temp < 32) {
                    System.out.println("Brrr! Where's the lodge?");
                } else if (temp > 85) {
                    System.out.println("Sweat city!!! Where's the pool?");
                } else {
                    System.out.println("Now this temperature I like!!");
                }
                break;
            case "2":
                //get the conversion they want to pick
                System.out.println("Pick from the following conversions:\n1. LBS to OZS\n" + "2. Minutes to Seconds\n" + "3. Months to Weeks");
                String conversion = in.nextLine();
                //check which conversion was picked
                switch (conversion) {
                    case "1":
                        //get number of lbs
                        System.out.println("Enter your number in lbs");
                        int pounds = in.nextInt();
                        //print converted amount in sentence
                        System.out.println(pounds + " pounds is " + (pounds * 16) + " ounces.");
                        break;
                    case "2":
                        //get amount of minutes
                        System.out.println("Enter the amount of minutes");
                        int minutes = in.nextInt();
                        //print converted amount in sentence
                        System.out.println(minutes + " minutes is " + (minutes * 60) + " seconds.");
                        break;
                    case "3":
                        //get amount of months
                        System.out.println("Enter the amount of months");
                        int months = in.nextInt();
                        //print converted amount in sentence
                        System.out.println(months + " months is " + (months*4) + " weeks");
                        break;
                    default:
                        //Invalid input answered, exit program
                        System.out.println("You didn't enter a valid input. Exiting...");
                        System.exit(0);
                        break;
                }
                break;
            default:
                //Invalid input answered, exit program
                System.out.println("You didn't enter a valid input. Exiting...");
                System.exit(0);
                break;
        }
    }
}
