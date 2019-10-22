/****
 * Name: Tejas Mehta
 * Date: february 21, 2019
 * Lab Name: Lab6.x-Library Methods Test
 * Extra: None needed as it is a test
 */
package com.tejasmehta;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declare initial scanner and loop
        while (true) {
            System.out.println("Pick a lab choice(1-2) or press another key to quit");
            //Ask for choice
            String choice = in.nextLine();
            switch (choice) {
                //Based on choice set string and call method
                case "1":
                    String motto = "Java Rocks";
                    mottoUpper(motto);
                    break;
                case "2":
                    String attendnce = "32 students";
                    getStus(attendnce);
                    break;
                default:
                    //Exit choice
                    System.out.println("Exiting....");
                    System.exit(0);
            }
        }
    }
    //Make new string and loop through string, changing to upper each char
    private static void mottoUpper(String motto) {
        String newUpper = "";
        for(int i = 0; i < motto.length(); i++) {
            newUpper = newUpper + Character.toUpperCase(motto.charAt(i));
        }
        System.out.println(newUpper);
    }
    //Get the first 2 letters and convert to int and print needed values
    private static void getStus(String attendence) {
        int stusAmnt = Integer.parseInt(attendence.substring(0, 2));
        System.out.println("The " + stusAmnt + " will prepare " + (stusAmnt * 3) + " exam papers");
    }
}
