/****
 * Name: Tejas Mehta
 * Date: February 19, 2019
 * Lab Name: Lab6.6-Star Wars Name
 * Extra: Added a loop where they can do it again if they want to.
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        //Declare scanner and ask for choice
        System.out.println("Do you want to know your star wars name?");
        String choice = in.nextLine();
        //Check if they said y or tes
        if (choice.toLowerCase().equals("y") || choice.toLowerCase().equals("yes")) {
            while (true) {
                //Start a loop and ask for the needed information
                System.out.println("Enter your first name");
                String fName = in.nextLine();
                System.out.println("Enter your last name");
                String lName = in.nextLine();
                System.out.println("Enter your mother's maiden name");
                String mName = in.nextLine();
                System.out.println("Enter the name of the town in which you were born");
                String tName = in.nextLine();
                //Create the name by following the formula for a star wars name
                String swName = fName.substring(0, 3) + lName.substring(0, 2).toLowerCase() + " " + mName.substring(0, 2) + tName.substring(0, 3).toLowerCase();
                System.out.println("Your star wars name is: " + swName);
                System.out.println("Would you like to do it again?");
                choice = in.nextLine();
                //Ask if they'd like to start over and respond accordingly
                if (choice.toLowerCase().equals("y") || choice.toLowerCase().equals("yes")) {
                    System.out.println("Okay.. Starting again");
                } else {
                    //Exit program
                    System.out.println("Okay... Exiting program");
                    System.exit(0);
                }
            }
        } else {
            //Exit program
            System.out.println("Okay... Exiting program");
            System.exit(0);
        }
    }
}
