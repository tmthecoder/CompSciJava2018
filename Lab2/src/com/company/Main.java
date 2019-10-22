/**
 * Name: Tejas Mehta
 * Program Name: Lab2
 * Date: Sept. 17, 2018
 * Extra: Added a picker, with a Minimal GUI using JOptionPane to depict each part of the lab, and Added a Custom Confirm dialog to show the image label and caption
 */
package com.company;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        //create the running bool
	    boolean running = true;
	    //check while it's running
	    while (running) {
	        //offer the choice picker to select which lab
            String choice = JOptionPane.showInputDialog("Pick a part(1-5) or press any other key to quit");
            //check if choice is 1
            if (choice.equals("1")) {
                //Show the last name input dialog
                String lastName = JOptionPane.showInputDialog("Enter your Last Name");
                //Show the final dialog and append @Camelot.com in it
                JOptionPane.showMessageDialog(null, lastName + "@Camelot.com");
            //check if choice is 2
            } else if (choice.equals("2")) {
                //Declare person string
                String person = "King Arthur";
                //Show the initial person string
                JOptionPane.showMessageDialog(null, person);
                //append the string
                person = person + " Guinevere";
                //Show it again
                JOptionPane.showMessageDialog(null, person);
            //Check if option is 3
            } else if (choice.equals("3")) {
                //Show the input for residence
                String residence = JOptionPane.showInputDialog("Enter your Name, Street Address, City, State and Zip");
                //check if it does in fact contain a comma
                if (residence.contains(",")) {
                    //get the index of the first comma
                    int comma = residence.indexOf(",");
                    //Create the first substring, eliminating the name
                    String commaSub = residence.substring(comma + 1);
                    //check if another comma is there
                    if (commaSub.contains(",")) {
                        //get the index of the next comma
                        int comma2 = commaSub.indexOf(",");
                        //Create the second substring, eliminating the Street Address
                        String newAddr = commaSub.substring(comma2 + 1);
                        //Check if a third comma is there to isolate the city
                        if (newAddr.contains(",")) {
                            //get the index of the third comma and get the substring between 0 and the comma
                            String city = newAddr.substring(0, newAddr.indexOf(","));
                            System.out.println(city);
                            //check if any spaces are left at beginning
                            if (city.charAt(0) == ' ') {
                                //Create the substring without the first space
                                int count = city.substring(1).length();
                                //Show the dialog with the city letter amount
                                JOptionPane.showMessageDialog(null, "Your city is " + (count) + " letters long");
                            } else {
                                //no first space so just get count
                                int count = city.length();
                                //Show final dialog
                                JOptionPane.showMessageDialog(null, "Your city is " + (count) + " letters long");
                            }

                        }
                    }
                }
            //Check if choice is 4
            } else if (choice.equals("4")) {
                //Declare initial name
                String initialName = "Pendragon, Uther";
                //Get the last name by itself
                String lastName = initialName.substring(0, initialName.indexOf(","));
                //Show a dialog with the last name appended to Uther
                JOptionPane.showMessageDialog(null, "Uther " + lastName);
            //Check if choice is 5
            } else if (choice.equals("5")) {
                //Create an ImageIcon to display the image
                ImageIcon icon = new ImageIcon(Main.class.getResource("castle.png"));
                //Create a Textfield to get the caption
                JTextField caption = new JTextField();
                //Create a component array to get the image, Label, and TextField Positioned
                final JComponent[] inputs = new JComponent[] {
                        new JLabel("", icon, SwingConstants.CENTER),
                        new JLabel("Enter a Caption for the Image Above"),
                        caption
                        };
                //set an int of results to get when "ok" is pressed
                int results = JOptionPane.showConfirmDialog(
                        null, inputs, "My custom dialog", JOptionPane.DEFAULT_OPTION);
                //Check if ok was pressed
                if (results == JOptionPane.OK_OPTION) {
                    //get caption
                    String captionOfImage = caption.getText();
                    //Show caption, length, and chatAt(4)
                    JOptionPane.showMessageDialog(null, "Caption: " +captionOfImage + "\nLength: " + (captionOfImage.length() + 1) + "\n4th Location: " + captionOfImage.charAt(4));
                }

            //check if other key pressed
            } else {
                //set running to false, exiting program
                running = false;
            }
        }
    }
}
