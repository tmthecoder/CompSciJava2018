/****
 * Name: Tejas Mehta
 * Lab Name: Lab3.2-If Else
 * Date: October 16, 2018
 * Extra: I added a more complicated, more user-friendly Swing ui, which allowed me to have everything except for the error/second alert messages on one window. I also added a feature which allows you to enter an infinately many amount of numbers, all separated by a comma and will sort them for you.
 */
package com.tejasmehta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    //all ui-item declarations
    private JPanel panel;
    private JRadioButton labPart1RadioButton;
    private JRadioButton labPart2RadioButton;
    private JRadioButton labPart3RadioButton;
    private JRadioButton labPart4RadioButton;
    private JRadioButton labPart5RadioButton;
    private JRadioButton labPart6RadioButton;
    private JTextField textField;
    private JLabel labInstructions;
    private JLabel labInp2;
    private JTextField textField1;
    private JButton okButton;

    //Public Cunstructor for access from the Main Form
    public Main() {
        //Select only the first button, as the default
        labPart1RadioButton.setSelected(true);
        labPart2RadioButton.setSelected(false);
        labPart3RadioButton.setSelected(false);
        labPart4RadioButton.setSelected(false);
        labPart5RadioButton.setSelected(false);
        labPart6RadioButton.setSelected(false);
        //Create a group and add all RadioButtons to it
        ButtonGroup group = new ButtonGroup();
        group.add(labPart1RadioButton);
        group.add(labPart2RadioButton);
        group.add(labPart3RadioButton);
        group.add(labPart4RadioButton);
        group.add(labPart5RadioButton);
        group.add(labPart6RadioButton);
        //Create action listener for button 1, and change the text and show fields accordingly
        labPart1RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labInstructions.setText("Enter Your Name Below");
                labInp2.setText("Enter Your Age Below");
                labInstructions.setVisible(true);
                labInp2.setVisible(true);
                textField.setVisible(true);
                textField1.setVisible(true);
                okButton.setVisible(true);
                textField.setText("");
                textField1.setText("");
            }
        });
        //Create action listener for button 2, and change the text and show fields accordingly
        labPart2RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setVisible(false);
                textField.setVisible(true);
                labInstructions.setText("Enter a Number Below to Check if it is Odd or Even");
                labInstructions.setVisible(true);
                labInp2.setVisible(false);
                okButton.setVisible(true);
                textField.setText("");
                textField1.setText("");
            }
        });
        //Create action listener for button 3, and change the text and show fields accordingly
        labPart3RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setVisible(true);
                labInstructions.setText("Enter the amount of words in your telegram");
                textField1.setVisible(false);
                labInstructions.setVisible(true);
                labInp2.setVisible(false);
                okButton.setVisible(true);
                textField.setText("");
                textField1.setText("");
            }
        });
        //Create action listener for button 4, and change the text and show fields accordingly
        labPart4RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setVisible(true);
                labInstructions.setText("Enter all numbers separated by a comma");
                textField1.setVisible(false);
                labInstructions.setVisible(true);
                labInp2.setVisible(false);
                okButton.setVisible(true);
                textField.setText("");
                textField1.setText("");
            }
        });
        //Create action listener for button 5, and change the text and show fields accordingly
        labPart5RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setVisible(true);
                labInstructions.setText("Enter Your Age to Find the Amount you Need to Pay");
                textField1.setVisible(false);
                labInstructions.setVisible(true);
                labInp2.setVisible(false);
                okButton.setVisible(true);
                textField.setText("");
                textField1.setText("");
            }
        });
        //Create action listener for button 6, and change the text and show fields accordingly
        labPart6RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setVisible(true);
                textField1.setVisible(false);
                labInstructions.setText("Please Enter your Birth Year Below");
                labInstructions.setVisible(true);
                labInp2.setVisible(false);
                okButton.setVisible(true);
                textField.setText("");
                textField1.setText("");
            }
        });
        //Create listener for the 'ok' button pressed to hget the results
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Check which button was selected, thus giving us the part of the lab to compute for
                if (labPart1RadioButton.isSelected()) {
                    //check if the first textfield is a number, and that the second one is filled
                    if (textField1.getText().matches("[0-9]+") && !textField.getText().isEmpty()) {
                        //make them invisible all invisible
                        textField1.setVisible(false);
                        textField.setVisible(false);
                        labInp2.setVisible(false);
                        okButton.setVisible(false);
                        //check if the age is 16 or above and show the answer accordingly
                        if (Integer.parseInt(textField1.getText()) >= 16) {
                            labInstructions.setText("It's scary, " + textField.getText() + " you are old enough to drive!");
                            labInstructions.setHorizontalAlignment(SwingConstants.CENTER);
                        } else {
                            int ageNeeded = 16 - Integer.parseInt(textField1.getText());
                            labInstructions.setText("You have to wait " + ageNeeded + " year(s) before you can drive!");
                            labInstructions.setHorizontalAlignment(SwingConstants.CENTER);
                        }
                    } else {
                        //Since the input wasn't valid, reset the view and inform them
                        JOptionPane.showMessageDialog(null, "Please Enter a Valud Inout");
                        textField.setText("");
                        textField1.setText("");
                        textField.setVisible(true);
                        okButton.setVisible(true);
                        labInp2.setVisible(true);
                        textField1.setVisible(true);
                    }
                } else if (labPart2RadioButton.isSelected()){
                    try {
                        //make fields invisible
                        textField.setVisible(false);
                        okButton.setVisible(false);
                        //get the number, and check if it is divisible by 2, and show the message accordingly
                        double number = Double.parseDouble(textField.getText());
                        if (number % 2 == 0) {
                            labInstructions.setText(number + " is even!");
                        } else {
                            labInstructions.setText(number + " is odd!");
                        }
                    } catch (NumberFormatException ignore) {
                        //Since the input wasn't valid, reset the view and inform them
                        JOptionPane.showMessageDialog(null, "Please Enter a Valud Inout");
                        textField.setText("");
                        textField.setVisible(true);
                        okButton.setVisible(true);
                    }
                } else if (labPart3RadioButton.isSelected()) {
                    //make fields invisible
                    textField.setVisible(false);
                    okButton.setVisible(false);
                    //Check if they inputted a number
                    if (textField.getText().matches("[0-9]+")) {
                        //Get the number and compare it, do the computations needed, and show the answer accordingly
                        if (Integer.parseInt(textField.getText()) <= 15) {
                            labInstructions.setText("You have to pay $8.50 for the telegram");
                        } else {
                            int words = Integer.parseInt(textField.getText());
                            int extras = words - 15;
                            BigDecimal extraCost = BigDecimal.valueOf(extras).multiply(BigDecimal.valueOf(0.25));
                            BigDecimal totalCost = extraCost.add(BigDecimal.valueOf(8.5));
                            labInstructions.setText("You have to pay " + totalCost + " for the telegram");

                        }
                    } else {
                        //Since the input wasn't valid, reset the view and inform them
                        JOptionPane.showMessageDialog(null, "Please Enter a Valud Inout");
                        textField.setText("");
                        textField.setVisible(true);
                        okButton.setVisible(true);
                    }
                } else if (labPart4RadioButton.isSelected()) {
                    //make fields invisible
                    textField.setVisible(false);
                    textField1.setVisible(false);
                    labInp2.setVisible(false);
                    okButton.setVisible(false);
                    try {
                        //Check if it is separated by commas
                        if (textField.getText().contains(",")) {
                            //get the text
                            String text = textField.getText();
                            //set the count of commas to zero, then loop through the inputted phrase to get the amount of commas
                            int commaCount = 0;
                            for (int i = 0; i < text.length(); i++) {
                                if (text.charAt(i) == ',') commaCount++;
                            }
                            int[] commaLocations = new int[commaCount];
                            int tentativeLocat = 0;
                            //Make a for loop to now get the char each comma is at, making the next step easier
                            for (int i = 0; i < text.length(); i++) {
                                if (text.charAt(i) == ','){
                                    commaLocations[tentativeLocat] = i;
                                    System.out.println(commaLocations[tentativeLocat]);
                                    tentativeLocat++;
                                }
                            }
                            int[] allNums = new int[commaCount + 1];
                            int startLocation = 0;
                            //Get the number at each location and add it to the array of numbers
                            for (int i = 0; i <= commaLocations.length; i++) {
                                if (i == commaLocations.length) {
                                    String subString = text.substring(startLocation);
                                    if (subString.contains(" ")) {
                                        subString = subString.replace(" ", "");
                                    }
                                    allNums[i] = Integer.parseInt(subString);
                                } else {
                                    String subString = text.substring(startLocation, commaLocations[i]);
                                    if (subString.contains(" ")) {
                                        subString = subString.replace(" ", "");
                                    }
                                    allNums[i] = Integer.parseInt(subString);
                                    startLocation = commaLocations[i] + 1;
                                }
                            }
                            //Sort array of all numbers
                            Arrays.sort(allNums);
                            String finalString = "";
                            //Loop through array and add it to the final string
                            for(int i = 0; i < allNums.length; i++) {
                                if (i == (allNums.length - 1)) {
                                    finalString = finalString + allNums[i] + ".";
                                } else {
                                    finalString = finalString + allNums[i] + ", " ;
                                }
                            }
                            //Display final, formatted string with numbers in ascending order
                            labInstructions.setText("The Numbers in Ascending Order Are: " + finalString);
                        } else {
                            JOptionPane.showMessageDialog(null, "Please Enter a Valid Entry");
                            textField.setText("");
                            textField.setVisible(true);
                            textField1.setVisible(false);
                            okButton.setVisible(true);
                        }
                    } catch (NumberFormatException ignore) {
                        //Since the input wasn't valid, reset the view and inform them
                        JOptionPane.showMessageDialog(null, "Please Enter a Valid Entry");
                        textField.setText("");
                        textField.setVisible(true);
                        textField1.setVisible(false);
                        okButton.setVisible(true);
                    }
                } else if (labPart5RadioButton.isSelected()) {
                    //make fields invisible
                    textField.setVisible(false);
                    okButton.setVisible(false);
                    //Check if a number was inputted
                    if (textField.getText().matches("[0-9]+")) {
                        //Check their age and print the values respectively
                        if (Integer.parseInt(textField.getText()) < 5) {
                            labInstructions.setText("You Don't Have to Pay Anything!");
                        } else if (Integer.parseInt(textField.getText()) >= 65) {
                            labInstructions.setText("You only have to pay $1.50");
                        } else {
                            labInstructions.setText("You have to pay $2.50.");
                        }
                    } else {
                        //Since the input wasn't valid, reset the view and inform them
                        JOptionPane.showMessageDialog(null, "Please Enter a Valid Age");
                        textField.setText("");
                        textField.setVisible(true);
                        okButton.setVisible(true);
                    }
                } else if (labPart6RadioButton.isSelected()) {
                    //make fields invisible
                    textField.setVisible(false);
                    okButton.setVisible(false);
                    //Check if a number was inputted
                    if (textField.getText().matches("[0-9]+")) {
                        //Check their age and move to the next step if they are valid
                        if (Integer.parseInt(textField.getText()) < 1970) {
                            //Show they qualify, and ask for the favorite fruit
                            String getFruit = JOptionPane.showInputDialog("You Qualify for the Jukebox Rally! Please enter your favorite fruit below");
                            //Take the respective actions after getting their favorite fruit
                            if (getFruit.equals("strawberry") || getFruit.equals("Strawberry")) {
                                labInstructions.setText("Strawberry Fields Forever");
                            } else {
                                labInstructions.setText("Bye, bye Miss American Pie.");
                            }
                        } else {
                            //Show they aren't eligible
                            labInstructions.setText("Sorry, you do not qualify for the Jukebox Rally");
                        }
                    } else {
                        //Since the input wasn't valid, reset the view and inform them
                        JOptionPane.showMessageDialog(null, "Please enter a valid number input");
                        textField.setText("");
                        textField.setVisible(true);
                        okButton.setVisible(true);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        //Initialization code for the whole parent JFrame, and set the width and height
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(10, 10, 700, 500);

    }
}
