
package com.company;

import javax.swing.*;

/****
 * Name: Tejas Mehta
 * Program Name: Lab1
 * Date: Sept. 13, 2018
 * Extra: Added a choice feature to choose between labs, and to exit the program. I also added a minimal graphic UI using MessageDialogs and InputDialogs.
 */
public class Main {

    public static void main(String[] args) {
        boolean running = true;
        //set the program to run until changed otherwise
        while (running) {
            //create a dialog for user input to choose the lab
            String choice = JOptionPane.showInputDialog("Pick a Part(1-6) or press any other key to stop");

            //check which choice had been entered(choice 1 here)
            if (choice.equals("1")) {
                //declare 2 calculation variables
                int score, leftover;
                //show input dialog to get the current year
                int year = Integer.parseInt(JOptionPane.showInputDialog("Enter the Current Year"));
                //calculate score and leftovers
                score = year / 20;
                leftover = year % 20;
                //show a message dialog to output the score amount and year total
                JOptionPane.showMessageDialog(null, score + " score and " + leftover + " years");
             //check if choice 2 had been picked
            } else if (choice.equals("2")) {
                //declare 2 calculation variables
                int inches, feet;
                //show an input dialog to get the height in inches
                int height = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Height in Inches"));
                //calculate how many feet and inches
                feet = height / 12;
                inches = height % 12;
                //show a dialog giving the total feet and inches
                JOptionPane.showMessageDialog(null, feet + " feet and " + inches + " inches");
            //check if choice 3 had been picked
            } else if (choice.equals("3")) {
                //get amount of pounds
                int pounds = Integer.parseInt(JOptionPane.showInputDialog("Enter Weight in Pounds"));
                //convert to ounces by multiplying by 16
                int ounces = pounds * 16;
                //show dialog with the amount of ounces
                JOptionPane.showMessageDialog(null, ounces + " ounces");
            //check if choice 4 had been picked
            } else if (choice.equals("4")) {
                //get the miles per week through a user input
                double milesPerWeek = Double.parseDouble(JOptionPane.showInputDialog("Enter Miles Used Per Work Week"));
                //get the gallons of gas per week through another input
                double gallonsPerWeek = Double.parseDouble(JOptionPane.showInputDialog("Enter Amount of Gasoline Purchased Per Work Week"));
                //calculate the milage per gallon, but then round to the second decimal place
                double total = (double) Math.round((milesPerWeek / gallonsPerWeek)*100)/100;
                //show a dialog with the total miles per gallon
                JOptionPane.showMessageDialog(null, total + " miles per gallon");
            //check if choice 5 had been picked
            } else if (choice.equals("5")) {
                //declare base bond variable of 007
                int bond = 007;
                //multiple by 10
                int tenBond = bond * 10;
                //cube(as int would not work with 'Math.pow()')
                int bondCubed = bond * bond * bond;
                //show a dialog with bond, 10 bond and bond cubed
                JOptionPane.showMessageDialog(null, "Bond is 00" + bond +". Bond times 10 is " + tenBond + ". Bond cubed is " + bondCubed + ".");
            //check if choice 6 had been picked
            } else if (choice.equals("6")) {
                //get the user's name through an input
                String name = JOptionPane.showInputDialog("What is your name?");
                //get the user's favorite color through another input
                String favColor = JOptionPane.showInputDialog("What is your favorite color?");
                //show an output with the given task of dying the hair.
                JOptionPane.showMessageDialog(null, name + ", have you ever thought of dying your hair " + favColor + "?");
            //no choice was picked, so move on
            } else {
                //change running to false as the use had put in the input to quit, and this stops the while loop, exiting the program
                running = false;
            }
        }


    }
}
