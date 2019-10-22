/****
 * Name: Tejas Mehta
 * Date: January 25th, 2019
 * Lab Name: Mid-Term
 * Extra: None needed
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Declare base scanner and print intro
        Scanner in = new Scanner(System.in);
        System.out.println("*********************************************");
        System.out.println("Welcome to the College Investigation Program!");
        System.out.println("*********************************************");

        //start loop
        while (true) {
            System.out.println("Which College would you like to learn about?\n" +
                    "Information for the Following Colleges is available(Enter the number):\n" +
                    "1. Cornell University\n" +
                    "2. MIT\n" +
                    "3. Caltech");
            //Show option and get user choice
            String choice = in.nextLine();
            switch (choice) {
                //Call functions according to choice
                case "1":
                    CornellInfo();
                    break;
                case "2":
                    MITInfo();
                    break;
                case "3":
                    CaltechInfo();
                    break;
                default:
                    //Tell them to enter a valid number
                    System.out.println("Please enter a valid number next time!");
            }

            //Ask if they need more info
            System.out.println("Would you like information on another college(y/N)?");
            String more = in.nextLine();
            if (more.toLowerCase().equals("y") || more.toLowerCase().equals("yes")) {
                //Answer and start again
                System.out.println("Okay!");
            } else {
                //Exit the program
                System.out.println("Exiting now....");
                System.exit(0);
            }

        }
    }

    private static void CornellInfo() {
        //Function to show Cornell Info
        System.out.println("Cornell is a university located in Ithica, New York\n" +
                "Andy From the office is known for attending college there\n" +
                "It is known for its college programs. For more specifics, run an intensive Google Search.");
    }

    private static void MITInfo() {
        //Function to show MIT Info
        System.out.println("MIT is a university located in Cambridge, Massachusetts\n" +
                "It is a very well known tech school, and houses a great technology program\n" +
                "Hence, its name is Massachusetts Institute of Technology. For more specifics, run an intensive Google Search.");
    }
    private static void CaltechInfo() {
        //Function to show Caltech Info
        System.out.println("Caltech is a university located in Pasadena, California\n" +
                "It is a very well known tech school, and like MIT, houses a great technology program\n" +
                "Hence, The full name is California Institute of Technology. For more specifics, run an intensive Google Search.");
    }

}
