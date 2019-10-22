/****
 * Name: Tejas Mehta
 * Lab Name: Lab3.1-Logical Operators
 * Date: Oct. 9, 2018
 * Extra: Added a choice where the user can input the amount of classes they are taking, and they can input the grade of each class to find an average for the 4th part. I also added a minimal GUI and checks to see whether they are trying the right content in each field.
 */
package com.company;

import javax.swing.*;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean running = true;
        //set running to true
        while (running) {

            String choice = JOptionPane.showInputDialog("Enter a lab part(1-4) or press any other key to quit.");
            //get lab choice
            switch (choice) {
                case "1":
                    //case 1 chose
                    boolean triangleRunning = true;
                    //start running loop
                    while (triangleRunning) {
                        //declare all textfields
                        JTextField sideAText = new JTextField();
                        JTextField sideBText = new JTextField();
                        JTextField sideCText = new JTextField();
                        //add to component array
                        JComponent[] components = new JComponent[]{
                                new JLabel("Enter the length of Side A below:"),
                                sideAText,
                                new JLabel("Enter the length of Side B below:"),
                                sideBText,
                                new JLabel("Enter the length of Side C below:"),
                                sideCText
                        };
                        //get result in int form
                        int result = JOptionPane.showConfirmDialog(null, components, "Enter Triangle Sides", JOptionPane.DEFAULT_OPTION);
                        //check if they pressed ;ok'
                        if (result == JOptionPane.OK_OPTION) {
                            try {
                                //declare all values for calculations
                                BigDecimal sideA, sideB, sideC;
                                sideA = BigDecimal.valueOf(Double.parseDouble(sideAText.getText()));
                                sideB = BigDecimal.valueOf(Double.parseDouble(sideBText.getText()));
                                sideC = BigDecimal.valueOf(Double.parseDouble(sideCText.getText()));
                                //check if it is a real triangle
                                if (sideC.compareTo(sideB.add(sideA)) < 0 && sideB.compareTo(sideA.add(sideC)) < 0 && sideA.compareTo(sideC.add(sideB)) < 0) {
                                    //check if it is equilateral
                                    if (sideA.compareTo(sideB) == 0 && sideA.compareTo(sideC) == 0) {
                                        JOptionPane.showMessageDialog(null, "Your triangle is equilateral");
                                        triangleRunning = false;
                                    //check if it is isosceles
                                    } else if (sideA.compareTo(sideB) == 0 || sideA.compareTo(sideC) == 0 || sideB.compareTo(sideC) == 0) {
                                        JOptionPane.showMessageDialog(null, "Your triangle is isosceles");
                                        triangleRunning = false;
                                    //it is scalene if none of the above
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Your triangle is scalene");
                                        triangleRunning = false;
                                    }
                                //wrong values entered, restart loop and inform them
                                } else {
                                    JOptionPane.showMessageDialog(null, "Please enter correct triangle values");
                                }
                            //wring numbers entered, restart loop and inform them
                            } catch (NumberFormatException ignore) {
                                JOptionPane.showMessageDialog(null, "Please fill all fields or make sure all entries are valid decimals");
                            }
                        }
                    }
                    break;
                case "2":
                    //case is 2
                    String numberInput = JOptionPane.showInputDialog("Enter a number between 50 and 100 below:");
                    //check what number they entered and that is is in fact a number
                    if (numberInput.matches("[0-9]+")) {
                        //check if it is below 100 and above 50
                        if (Integer.parseInt(numberInput) >= 50 && Integer.parseInt(numberInput) <= 100) {
                            JOptionPane.showMessageDialog(null, "You won $" + numberInput + "!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Sorry, not following directions will cost you dearly :-(.");
                        }
                    //they didn't enter a number, show the same as a wrong entry
                    } else {
                        JOptionPane.showMessageDialog(null, "Sorry, not following directions will cost you dearly :-(.");
                    }
                    break;
                case "3":
                    //case 3
                    String virusInput = JOptionPane.showInputDialog("This program may contain a virus. Do you wish to continue (y/n)?");
                    //get entry by user and check if it is yes or no
                    if (virusInput.equals("y") || virusInput.equals("Y")) {
                        //entered yes, show dialog accordingly
                        JOptionPane.showMessageDialog(null, "You are a gambler!");
                    } else if (virusInput.equals("n") || virusInput.equals("N")) {
                        //entered no, show dialog accordingly
                        JOptionPane.showMessageDialog(null, "Smart Choice!");
                    } else {
                        //entered something else, show dialog accordingly
                        JOptionPane.showMessageDialog(null, "That was not a Y or N. Do you hear coughing?");
                    }
                    break;
                case "4":
                    //case is 4
                    String averageChoice = JOptionPane.showInputDialog("Do you know your grade average(y/n)");
                    //ask if they know average, check if it is yes or no
                    if (averageChoice.equals("y") || averageChoice.equals("Y")) {
                        boolean gradeKnownTestRunning = true;
                        //start known loop
                        while (gradeKnownTestRunning) {
                            //declare all textFields
                            JTextField averageText = new JTextField();
                            JTextField courseText = new JTextField();
                            JTextField disciplineText = new JTextField();
                            //create component array
                            JComponent[] honorTestInputs = new JComponent[]{
                                    new JLabel("What is your grade average?"),
                                    averageText,
                                    new JLabel("How many courses are you enrolled in?"),
                                    courseText,
                                    new JLabel("Have you had any discipline infractions?"),
                                    disciplineText
                            };
                            //show dialog and listen for int
                            int result = JOptionPane.showConfirmDialog(null, honorTestInputs, "Are you in Honors?", JOptionPane.DEFAULT_OPTION);
                            //check if they pressed 'ok'
                            if (result == JOptionPane.OK_OPTION) {
                                try {
                                    //get all the values and check them to see if they are eligible
                                    double gradeAverage = Double.parseDouble(averageText.getText());
                                    int courseAmount = Integer.parseInt(courseText.getText());
                                    String disciplineInfractions = disciplineText.getText();
                                    //check if grade is above 90 and more than 5 courses
                                    if (gradeAverage >= 90.0 && courseAmount >= 5) {
                                        //check if there are any discipline infractions
                                        if (disciplineInfractions.equals("n") || disciplineInfractions.equals("N")) {
                                            JOptionPane.showMessageDialog(null, "You are eligible for honors!");
                                            gradeKnownTestRunning = false;
                                        } else if (disciplineInfractions.equals("y") || disciplineInfractions.equals("Y")) {
                                            JOptionPane.showMessageDialog(null, "Sorry, you are not eligible for honors.");
                                            gradeKnownTestRunning = false;
                                        }
                                    //grade isn't above 90 or they are in less than 5 courses
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Sorry, you are not eligible for honors.");
                                        gradeKnownTestRunning = false;
                                    }
                                //fields were filled wrongly, inform user and restart loop
                                } catch (NumberFormatException ignore) {
                                    JOptionPane.showMessageDialog(null, "Please fill all fields correctly");
                                }
                            }
                        }

                    //they don't have average
                    } else {
                        boolean gradeAverageTestRunning = true;
                        //set running loop
                        while (gradeAverageTestRunning) {
                            String disciplineInfractions = JOptionPane.showInputDialog("Have you had any disciplinary infractions(y/n)?");
                            //ask of they have disciplinary infractions
                            if (disciplineInfractions.equals("n") || disciplineInfractions.equals("N")) {
                                String classAmount = JOptionPane.showInputDialog("How many courses are you enrolled in?");
                                //ask for amount of enrolled courses
                                try {
                                    if (Integer.parseInt(classAmount) >= 5) {
                                        //get courseAmount and change to int
                                        int courseAmount = Integer.parseInt(classAmount);
                                        //declare array for grades in course
                                        int[] courseGrades = new int[courseAmount];
                                        //make for loop and loop through each course
                                        for (int i = 0; i < courseAmount; i++) {
                                            //get grade for course 'i'
                                            String grade = JOptionPane.showInputDialog("Enter the grade for course " + (i + 1));
                                            try {
                                                //add it to the array
                                                courseGrades[i] = Integer.parseInt(grade);
                                                if (i == (courseAmount - 1)) {
                                                    //check if we are at the end of the loop
                                                    int allGrades = 0;
                                                    //new for loop to get all grades added together
                                                    for (int num = 0; num < courseGrades.length; num++) {
                                                        //add grade to allgrades
                                                        allGrades = allGrades + courseGrades[i];
                                                        //check if we are at then end of the loop
                                                        if (num == courseGrades.length - 1) {
                                                            //get the average of all the grades
                                                            allGrades = allGrades / (courseGrades.length - 1);
                                                            //allgrades above 90,show the eligibility message
                                                            if (allGrades >= 90) {
                                                                JOptionPane.showMessageDialog(null, "You are eligible for honors!");
                                                                gradeAverageTestRunning = false;
                                                                //allgrades below 90, show the non-eligible message
                                                            } else {
                                                                JOptionPane.showMessageDialog(null, "Sorry, you are not eligible for honors.");
                                                                gradeAverageTestRunning = false;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (NumberFormatException ignore) {

                                            }
                                        }
                                    //course amount not above 5, show non-eligible message
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Sorry, you are not eligible for honors.");
                                    }
                                } catch (NumberFormatException ignore) {

                                }
                            //they had a disciplinary infraction, show non-eligible message
                            } else {
                                JOptionPane.showMessageDialog(null, "Sorry, you are not eligible for honors.");
                            }
                        }
                    }
                    break;
            }
        }
    }
}
