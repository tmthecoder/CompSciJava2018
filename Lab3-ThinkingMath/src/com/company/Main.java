/**
 * Name: Tejas Mehta
 * Program Name: Lab3-ThinkingMath
 * Date: Sept. 24, 2018
 * Extra: I made a minimal User GUI. I also made many checks to prevent many of the common crashes(entering a string, entering a non two or 3 digit number, etc). I also made it very self-explanatory.
 */
package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boolean running = true;
        //set running var to true
        while (running) {
            //show choice to pick part 1, 2, or 3
            String choice = JOptionPane.showInputDialog("Pick a part(1-3) or press any other key to quit");
            //create switch to check between different entries
            switch (choice) {
                //check if "1" has been entered
                case "1":
                    //set team to true, incase they don't enter a real number
                    boolean team = true;
                    //create the while loop
                    while (team) {
                        //get the user input
                        String userInput = JOptionPane.showInputDialog("Enter the Number of Players:");
                        //check if the input is a number
                        if (userInput.matches("[0-9]+")) {
                            //convert the string to an integer
                            int inputNumber = Integer.parseInt(userInput);
                            //get the remainder
                            int amntLeft = inputNumber % 7;
                            //get the division which will always be a perfect division as we subtracted the remainder
                            int amntOfTeam = (inputNumber - amntLeft) / 7;
                            //check if there is no remainder
                            if (amntLeft == 0) {
                                //show only the total teams made as there are no leftovers
                                JOptionPane.showMessageDialog(null, "There will be " + amntOfTeam + " teams.");
                                //change team to false, allowing us to do other parts
                                team = false;
                            //There is a remainder of people
                            } else {
                                //show the message with the remainder
                                JOptionPane.showMessageDialog(null, "There will be " + amntOfTeam + " teams with " + amntLeft + " people left over");
                                //change team to false, allowing us to do other parts
                                team = false;
                            }
                        //The entry was not a numerical one
                        } else {
                            //Show message telling them to enter a number next time
                            JOptionPane.showMessageDialog(null, "Please enter a Real Number!");
                            //This allows us to go back to the start of this part, and that's why I put the while loop.
                        }
                    }
                    //Break out of switch, and restart picker
                    break;
                //check if "2" was entered
                case "2":
                    //set boolean to true, allowing us to restart if a string other than a two digit number was entered
                    boolean twoDigit = true;
                    //start the while loop
                    while (twoDigit) {
                        //get the user input
                        String userInput = JOptionPane.showInputDialog("Enter a Two-Digit Number:");
                        //check if it is a number, and is 2 digit at that
                        if (userInput.matches("[0-9]+") && userInput.length() == 2) {
                            //Show a message with the first and second number
                            JOptionPane.showMessageDialog(null, "The First Number is: " + userInput.charAt(0) + "\nThe Second Number is: " + userInput.charAt(1));
                            //Set two-digit to false, and allows us to go to other parts
                            twoDigit = false;
                        //The String entered was not a number, or two digit
                        } else {
                            //inform them that the number was not two-digit or that it wasn't a number
                            JOptionPane.showMessageDialog(null, "Please enter a Real and/or Two-Digit Number!");
                            //This will now send you back to the "enter a two-digit number" page, as was the reason of the while loop
                        }
                    }
                    //break out of the switch, and go back to the initial dialog picker
                    break;
                //check if input equals "3"
                case "3":
                    //set bool to true, as I did for the last 2
                    boolean threeDigit = true;
                    //start while loop
                    while (threeDigit) {
                        //get the user input as a string
                        String userInput = JOptionPane.showInputDialog("Enter a Three-Digit Number:");
                        //check if it is all numbers, and if it is a 3 digit number
                        if (userInput.matches("[0-9]+") && userInput.length() == 3) {
                            //get the value of the first char as an int
                            int firstNum = Integer.parseInt(String.valueOf(userInput.charAt(0)));
                            //get the value of the second char as an int
                            int secondNum = Integer.parseInt(String.valueOf(userInput.charAt(1)));
                            //get the value of the third char as an int
                            int thirdNum = Integer.parseInt(String.valueOf(userInput.charAt(2)));
                            //add all 3 up
                            int sum = firstNum + secondNum + thirdNum;

                            //show the message with the numbers and their sum
                            JOptionPane.showMessageDialog(null, "The First Number is: " + firstNum + "\nThe Second Number is: " + secondNum + "\nThe Third Number is: " + thirdNum + "\nThe Sum of the Numbers is: " + sum);
                            //set bool to false, allowing us to do other parts
                            threeDigit = false;
                        //The number wasn't 3 digits or a string
                        } else {
                            //Show a message informing them to enter a real 3 digit number
                            JOptionPane.showMessageDialog(null, "Please enter a Real and/or Three-Digit Number!");
                            //no bool setting statement, so it takes us back to the top of the loop
                        }
                    }
                    //break out of the switch
                    break;
                //if none of the above are true, go to default state and quit
                default:
                    //set running as false, allowing us to exit while loop and close program.
                    running = false;
            }
        }
    }
}
