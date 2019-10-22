/****
 * Name: Tejas Mehta
 * Lab Name: Lab6-Piggybank
 * Date: Oct. 3, 2018
 * Extra:
 */
package com.company;

import javax.swing.*;
import java.io.Console;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean running = true;
        //start running loop
        while (running) {

            //declare the textFields for all the inputs
            JTextField name = new JTextField();
            JTextField quarterCountText = new JTextField();
            JTextField dimeCountText = new JTextField();
            JTextField nickelCountText = new JTextField();
            JTextField pennyCountText = new JTextField();
            JTextField weeksSavingText = new JTextField();
            JTextField optionalTargetText = new JTextField();

            //Put all the textFields in a component array
            JComponent[] inputs = new JComponent[] {
              new JLabel("Enter your name:"),
              name,
              new JLabel("Enter amount of Quarters:"),
              quarterCountText,
              new JLabel("Enter amount of Dimes:"),
              dimeCountText,
              new JLabel("Enter amount of Nickels:"),
              nickelCountText,
              new JLabel("Enter amount of Pennies:"),
              pennyCountText,
              new JLabel("Enter the amount of Weeks you have been Saving:"),
              weeksSavingText,
              new JLabel("Enter the target money amount you want(Optional):"),
              optionalTargetText
            };

            //show all inputs, listening on the click of a button
            int results = JOptionPane.showConfirmDialog(null, inputs, "Values", JOptionPane.DEFAULT_OPTION);
            //check if they pressed 'ok'
            if (results == JOptionPane.OK_OPTION) {
                System.out.println("oo");
                //check if the inputs are all valid inputs
                if (!name.getText().isEmpty() && quarterCountText.getText().matches("[0-9]+") && dimeCountText.getText().matches("[0-9]+") && nickelCountText.getText().matches("[0-9]+") && pennyCountText.getText().matches("[0-9]+") && weeksSavingText.getText().matches("[0-9]+")) {
                    System.out.println("hi");
                    //Declare a string var for the optional part(used later on)
                    String optionalText2;
                    //Declare all decimal variables for initial and final calculations
                    BigDecimal quarterCount, nickelCount, dimeCount, pennyCount, quarterTotal, nickelTotal, dimeTotal, pennyTotal, totalSaved, weeksSaving, yearlySavings, optionalTarget, targetTime;
                    //Get all values from textFields
                    quarterCount = BigDecimal.valueOf(Integer.parseInt(quarterCountText.getText()));
                    dimeCount = BigDecimal.valueOf(Double.parseDouble(dimeCountText.getText()));
                    nickelCount = BigDecimal.valueOf(Double.parseDouble(nickelCountText.getText()));
                    pennyCount = BigDecimal.valueOf(Double.parseDouble(pennyCountText.getText()));
                    weeksSaving = BigDecimal.valueOf(Double.parseDouble(weeksSavingText.getText()));
                    //get the money for each type of coin
                    quarterTotal = quarterCount.multiply(BigDecimal.valueOf(0.25)).setScale(2, RoundingMode.CEILING);
                    dimeTotal = dimeCount.multiply(BigDecimal.valueOf(0.1)).setScale(2, RoundingMode.CEILING);
                    nickelTotal = nickelCount.multiply(BigDecimal.valueOf(0.05)).setScale(2, RoundingMode.CEILING);
                    pennyTotal = pennyCount.multiply(BigDecimal.valueOf(0.01)).setScale(2, RoundingMode.CEILING);
                    //get the total saved by the user
                    totalSaved = quarterTotal.add(dimeTotal.add(nickelTotal.add(pennyTotal)));
                    //get the yearly estimate
                    yearlySavings = BigDecimal.valueOf(52.0).divide(weeksSaving, RoundingMode.HALF_UP).multiply(totalSaved).setScale(2, RoundingMode.CEILING);
                    //check if they entered a target they want to reach
                    if (optionalTargetText.getText().isEmpty()) {
                        //If not, just show the original answer and estimate
                        JOptionPane.showMessageDialog(null, name.getText() + ", at this rate you can save $" + yearlySavings + " per year.");
                        //ask if they want to continue
                        String checkContinue = JOptionPane.showInputDialog("Enter 'y' or 'yes' to continue, or press any other key to quit");
                        //check if it doesn't equal 'y' or 'yes'
                        if (!checkContinue.equals("y") && !checkContinue.equals("yes")) {
                            //set running to false and exit
                            running = false;
                        }
                    } else {
                        //the textField was not empty, so check if they put a decimal value
                        if (optionalTargetText.getText().contains(".")) {
                            //if so, just put it in the string
                            optionalText2 = optionalTargetText.getText();
                        } else {
                            //If not, add '.00' to it, just to make it look nice in the end
                            optionalText2 = optionalTargetText.getText() + ".00";
                        }
                        try {
                            //try to convert the textField to a bigDecimal
                            optionalTarget = BigDecimal.valueOf(Double.parseDouble(optionalText2));
                            //get the time taken in weeks to reach said target amount
                            targetTime = optionalTarget.divide(yearlySavings, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(52.0));
                            //show yearly estimate and target time on a new line
                            JOptionPane.showMessageDialog(null, name.getText() + ", at this rate you can save $" +yearlySavings + " per year.\nIt would take you about " + targetTime + " weeks to get $" + optionalText2);
                            //show input if they want to continue
                            String checkContinue = JOptionPane.showInputDialog("Enter 'y' or 'yes' to continue, or press any other key to quit");
                            //check if it doesn't equal 'y' or 'yes'
                            if (!checkContinue.equals("y") && !checkContinue.equals("yes")) {
                                //set running to false and exit
                                running = false;
                            }
                        } catch(NumberFormatException ignore) {
                            System.out.print("Num Error");
                        }

                    }

                } else {
                    //They didn't enter correct values, so tell them to and restart the programc
                    JOptionPane.showMessageDialog(null, "Please input correct values and fill all TextFields");
                }
            } else {
                running = false;
            }
        }
    }
}
