/****
 * Name: Tejas Mehta
 * Program Name: Lab4-Decimal Output
 * Date: Sept. 26, 2018
 * Extra: I used the BigDecimal library for precision, added a minimal custom GUI for all entries and responses, as well as rounded all money values to 2 decimal points
 */
package com.company;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
//import all libraries needed

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean running = true;
        //set running loop to true
        while (running) {
            //show choice dialog
            String choice = JOptionPane.showInputDialog("Pick a part(1 or 2) or press any other key to quit");
            switch (choice) {
                //check if '1' was typed
                case "1":
                    boolean cylinderRunning = true;
                    //set cylinder loop
                    while (cylinderRunning) {
                        //Create the 3 textFields for a custom dialog as no Template exists with 3 textFields
                        JTextField diameterText = new JTextField();
                        JTextField depthText = new JTextField();
                        JTextField totalCylindersText = new JTextField();
                        //Add the textFields to the array of components
                        final JComponent[] inputs = new JComponent[]{
                                new JLabel("Enter the Diameter Below:"),
                                diameterText,
                                new JLabel("Enter the Depth Below:"),
                                depthText,
                                new JLabel("Enter the Total Amount of Cylinders Below:"),
                                totalCylindersText
                        };
                        //show the dialog listening for an integer as a code for which button the user pressed
                        int results = JOptionPane.showConfirmDialog(null, inputs, "Enter Data", JOptionPane.DEFAULT_OPTION);
                        //check whether the user pressed 'ok'
                        if (results == JOptionPane.OK_OPTION) {
                            //check all textfields are a number
                            if (depthText.getText().matches("[0-9]+") && diameterText.getText().matches("[0-9]+") && totalCylindersText.getText().matches("[0-9]+")) {
                                //declare all BigDecimal variables needed
                                BigDecimal totalCylinders, diameter, depth, radius, volume, radiusSquared, cubicYards, totalYards, totalCost;
                                //get diameter from textField
                                diameter = BigDecimal.valueOf(Double.parseDouble(diameterText.getText()));
                                //get depth from textField
                                depth = BigDecimal.valueOf(Double.parseDouble(diameterText.getText()));
                                //get total amount of cylinders wanted
                                totalCylinders = BigDecimal.valueOf(Double.parseDouble(totalCylindersText.getText()));
                                //do all the background math(cylinder formula, divide by 27, and then multiply the cost, then the total)
                                radius = diameter.divide(BigDecimal.valueOf(2.0), RoundingMode.HALF_UP);
                                radiusSquared = radius.multiply(radius);
                                volume = BigDecimal.valueOf(3.14).multiply(radiusSquared.multiply(depth));
                                cubicYards = volume.divide(BigDecimal.valueOf(27.0), RoundingMode.HALF_UP);
                                totalYards = cubicYards.multiply(totalCylinders);
                                //get totalCost, and round to 2 decimal places
                                totalCost = totalYards.multiply(BigDecimal.valueOf(12.98)).setScale(2, RoundingMode.CEILING);
                                //show message with the total cost
                                JOptionPane.showMessageDialog(null, "Your Total Cost is: $" + totalCost);
                                cylinderRunning = false;
                            } else {
                                //entry was not filled or was not numerical, so tell them to enter said number entry and restart the cylinder loop
                                JOptionPane.showMessageDialog(null, "Please make Sure all Fields are Numbers and filled!");
                            }

                        }
                    }
                    break;
                //check if '2' was inputted
                case "2":
                    boolean pythagoreanRunning = true;
                    //set pythagorean loop to true and start
                    while (pythagoreanRunning) {
                        //declare the two textFields for the custom layout
                        JTextField mText = new JTextField();
                        JTextField nText = new JTextField();
                        //add textfield to component array
                        final JComponent[] inputs = new JComponent[]{
                                new JLabel("Enter the 'm' Value Below:"),
                                mText,
                                new JLabel("Enter the 'n' Value Below:"),
                                nText,
                        };
                        //show dialog and listen for the button pressed in form of an int
                        int results = JOptionPane.showConfirmDialog(null, inputs, "Enter Side Values", JOptionPane.DEFAULT_OPTION);
                        //check if the 'ok' button was pressed
                        if (results == JOptionPane.OK_OPTION) {
                            //check if all entries are a number
                            if (mText.getText().matches("[0-9]+") && nText.getText().matches("[0-9]+")) {
                                //check if 'm' is greater than 'n'
                                if (Double.parseDouble(mText.getText()) > Double.parseDouble(nText.getText())) {
                                    //declare all BigDecimal values needed
                                    BigDecimal m, n, mSquared, nSquared, sideOne, sideTwo, hypotenuse, tripleCost, sideOneCost, sideTwoCost, hypotenuseCost;
                                    //get the 'm' value from textField
                                    m = BigDecimal.valueOf(Double.parseDouble(mText.getText()));
                                    //get the 'n' value from textField
                                    n = BigDecimal.valueOf(Double.parseDouble(nText.getText()));
                                    //do all the background math(square both, get side and hypotenuse lengths, round all multiplication to 2 decimal points for money)
                                    mSquared = m.multiply(m);
                                    nSquared = n.multiply(n);
                                    sideOne = mSquared.subtract(nSquared);
                                    sideTwo = m.multiply(n.multiply(BigDecimal.valueOf(2.0)));
                                    hypotenuse = mSquared.add(nSquared);
                                    sideOneCost = sideOne.multiply(BigDecimal.valueOf(2.412)).setScale(2, RoundingMode.CEILING);
                                    sideTwoCost = sideTwo.multiply(BigDecimal.valueOf(3.767)).setScale(2, RoundingMode.CEILING);
                                    hypotenuseCost = hypotenuse.multiply(BigDecimal.valueOf(15.758)).setScale(2, RoundingMode.CEILING);
                                    //get total cost
                                    tripleCost = sideOneCost.add(sideTwoCost.add(hypotenuseCost));
                                    //show dialog with all measures and total cost
                                    JOptionPane.showMessageDialog(null, "Side One is: " + sideOne + "\nSide Two is: " + sideTwo + "\nHypotenuse is: " + hypotenuse + "\nTriple Cost: $" + tripleCost);
                                    //set pythagorean to false, going back to the picker
                                    pythagoreanRunning = false;
                                } else {
                                    //'m' wasn't greater than 'n', so show a prompt telling them to make it greater and go back to the start of pythagorean
                                    JOptionPane.showMessageDialog(null, "Please make sure Your 'm' Value is Greater than Your 'n' Value");
                                }
                            } else {
                                //Entry wasn't a number or was blank, so show a prompt telling user to make sure both are numerical and go back to the start of pythagorean
                                JOptionPane.showMessageDialog(null, "Please Make sure Both fields are Filled and that Numbers are Entered");
                            }
                        }
                    }
                    break;
                default:
                    //set running to false, as another key was pressed, exiting the program
                    running = false;
            }
        }

    }
}
