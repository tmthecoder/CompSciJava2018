/****
 * Name: Tejas Mehta
 * Date: November 14, 2018
 * Lab Name: Lab4.5-Pilot Simulator
 * Extra: I added 2 extra flight options, the UFO and the Death Star, they have the same options as the rest though.
 */
package com.tejasmehta;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Integer> characteristics = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //Declare scanner and ask for flight choice
        System.out.println("Which flight would you like to simulate?(Enter the corresponding number below)\n1.  blimp\n" +
                "2.  helicopter\n" +
                "3.  fighter jet\n" +
                "4.  Space Shuttle\n" +
                "5.  UFO\n" +
                "6.  Death Star");
        String flightChoice = in.nextLine();
        String flightName = "";
        //Check which flight was chosen and call the function to the according parameters, and print out the according result
        switch (flightChoice) {
            case "1":
                flightName = "Blimp";
                //set flight name and call function
                getCharacteristics(true, characteristics, in);
                System.out.println("You are simulating " + flightName + " and have altered " + characteristics.size() + " characteristics.");
                break;
            case "2":
                flightName = "Helicopter";
                //set flight name and call function
                getCharacteristics(true, characteristics, in);
                System.out.println("You are simulating " + flightName + " and have altered " + characteristics.size() + " characteristics.");
                break;
            case "3":
                flightName = "Fighter Jet";
                //set flight name and call function
                getCharacteristics(true, characteristics, in);
                System.out.println("You are simulating " + flightName + " and have altered " + characteristics.size() + " characteristics.");
                break;
            case "4":
                flightName = "Space Shuttle";
                //set flight name and call function
                getCharacteristics(true, characteristics, in);
                System.out.println("You are simulating " + flightName + " and have altered " + characteristics.size() + " characteristics.");
                break;
            case "5":
                flightName = "UFO";
                getCharacteristics(true, characteristics, in);
                //set flight name and call function
                System.out.println("You are simulating " + flightName + " and have altered " + characteristics.size() + " characteristics.");
                break;
            case "6":
                flightName = "Death Star";
                getCharacteristics(true, characteristics, in);
                //set flight name and call function
                System.out.println("You are simulating " + flightName + " and have altered " + characteristics.size() + " characteristics.");
                break;
            default:
                //Invalid entry, exit program
                System.out.println("Invalid entry, exiting program ...");
                System.exit(0);
        }
    }

    private static void getCharacteristics(boolean choosing, List<Integer> characteristics, Scanner in) {
        //set loop as they can keep adding options
        while (choosing) {
            System.out.println("Which characteristics would you like to change?(Enter the corresponding number below)\n1.  Position Trim(Trim)\n" +
                    "2.  Force Breakout (Return-to-Center Force)\n" +
                    "3.  Force Gradient (Spring Force)\n" +
                    "4.  Force Friction\n" +
                    "5.  Dampening\n" +
                    "6.  Hard Stop");
            //Ssk user which they would like to mofify
            String characteristicChosen = in.nextLine();
            //Declare switch and get which was chosen
            switch (characteristicChosen) {
                case "1":
                    //add to list and print description
                    characteristics.add(1);
                    System.out.println("Position Trim (Trim) - The position to which a flight\n" +
                            "control returns when the pilot releases it.");
                    break;
                case "2":
                    //add to list and print description
                    characteristics.add(2);
                    System.out.println("Force Breakout (Return-to-Center Force) - A force\n" +
                            "that returns a control to Trim. This is a constant force\n" +
                            "applied toward Trim which remains the same despite\n" +
                            "how far the control is moved (displacement) and how");
                    break;
                case "3":
                    //add to list and print description
                    characteristics.add(3);
                    System.out.println("Force Gradient (Spring Force) - A force that returns a control to Trim, but one that varies\n" +
                            "with displacement.  The farther the control is moved, the stronger the force applied toward\n" +
                            "Trim.");
                    break;
                case "4":
                    //add to list and print description
                    characteristics.add(4);
                    System.out.println("Force Friction - A constant force that is opposite to the direction of movement.");
                    break;
                case "5":
                    //add to list and print description
                    characteristics.add(5);
                    System.out.println("Damping - A force that is opposite to the direction of movement. Damping varies with\n" +
                            "velocity.  The faster a control is moved, the stronger the force.");
                    break;
                case "6":
                    //add to list and print description
                    characteristics.add(6);
                    System.out.println("Hard Stop - A force that simulates a mechanical limit of travel.  By varying the Hard Stops,\n" +
                            "the range of travel can be adjusted.");
                    break;
                default:
                    //Invalid entry, exit program
                    System.out.println("Invalid entry, exiting ...");
                    System.exit(0);
            }
            //Ask if they want to add more
            System.out.println("Do you want to add more characteristics?");
            String moreChoices = in.nextLine();
            //If they said no, set choosing to false and exit loop
            if (moreChoices.toLowerCase().equals("n") || moreChoices.toLowerCase().equals("no")) {
                choosing = false;
            }
        }
    }
}
