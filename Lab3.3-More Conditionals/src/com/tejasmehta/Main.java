/****
 * Name: Tejas Mehta
 * Lab Name: Lab3.3-More Conditionals
 * Date: October 19, 2018
 * Extra: Added an Obscured Text Field for Password Entry, as well as a Swing GUI, and a password hint if it is entered wrong
 */
package com.tejasmehta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    //Declare all GUI Variables
    private JPanel panel;
    private JRadioButton labPart1RadioButton;
    private JRadioButton labPart2RadioButton;
    private JRadioButton labPart3RadioButton;
    private JButton okButton;
    private JTextField textField2;
    private JLabel instructions;
    private JLabel instructions2;
    private JPasswordField passwordField1;

    public Main() {
        //Initialize all Buttons and textFields, and set them to the needed values
        labPart1RadioButton.setSelected(true);
        labPart2RadioButton.setSelected(false);
        labPart3RadioButton.setSelected(false);
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(labPart1RadioButton);
        radioGroup.add(labPart2RadioButton);
        radioGroup.add(labPart3RadioButton);
        instructions.setText("Enter the Password Below");
        instructions.setVisible(true);
        instructions2.setText("The Password is Incorrect");
        instructions2.setVisible(false);
        okButton.setVisible(true);
        textField2.setVisible(false);
        textField2.setText("");
        passwordField1.setText("");
        passwordField1.setEchoChar('*');

        //Set ActionListener for first button
        labPart1RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Set all the text values, set needed fields visible, and obscure the password field
                instructions.setText("Enter the Password Below");
                instructions.setVisible(true);
                instructions2.setText("The Password is Incorrect");
                instructions2.setVisible(false);
                okButton.setVisible(true);
                textField2.setVisible(false);
                passwordField1.setVisible(true);
                textField2.setText("");
                passwordField1.setText("");
                passwordField1.setEchoChar('*');
            }
        });
        //Set ActionListener for second button
        labPart2RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Set all the text values, set needed fields visible, and obscure the password field
                instructions.setText("Enter Your Name Below");
                instructions2.setText("Enter Your Age Below");
                instructions.setVisible(true);
                instructions2.setVisible(true);
                okButton.setVisible(true);
                textField2.setVisible(true);
                passwordField1.setVisible(true);
                textField2.setText("");
                passwordField1.setText("");
                passwordField1.setEchoChar((char)0);
            }
        });
        //Set ActionListener for third button
        labPart3RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Set all the text values, set needed fields visible, and obscure the password field
                instructions.setText("Which non-cable channel is your favorite (2, 4, 6, 8, 11)?");
                instructions.setVisible(true);
                instructions2.setVisible(false);
                okButton.setVisible(true);
                textField2.setVisible(false);
                passwordField1.setVisible(true);
                textField2.setText("");
                passwordField1.setText("");
                passwordField1.setEchoChar((char)0);
            }
        });
        //Set ActionListener for ok button
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Check if first button selected
                if (labPart1RadioButton.isSelected()) {
                    //Get password and check if it is correct or not, and execute based on that
                    String password = "incorrect";
                    System.out.println(passwordField1.getPassword());
                    if (password.equals(new String(passwordField1.getPassword()))) {
                        instructions.setText("Hello! You're in!");
                        instructions2.setVisible(false);
                        okButton.setVisible(false);
                        passwordField1.setVisible(false);
                    } else {
                        instructions2.setText("The Password is Incorrect");
                        instructions2.setVisible(true);
                    }
                //Check if second button selected
                } else if (labPart2RadioButton.isSelected()) {
                    //Check if number is int
                    if (textField2.getText().matches("[0-9]+")) {
                        //Check if less or greater than 17 and then execute based on that
                        if (Integer.parseInt(textField2.getText()) >= 17) {
                            instructions.setText("Welcome to the movie " + new String(passwordField1.getPassword()) + "!");
                            textField2.setVisible(false);
                            okButton.setVisible(false);
                            passwordField1.setVisible(false);
                            instructions2.setVisible(false);
                        } else {
                            instructions.setText("Sorry, this movie is rated R.");
                            textField2.setVisible(false);
                            okButton.setVisible(false);
                            passwordField1.setVisible(false);
                            instructions2.setVisible(false);
                        }
                    }
                //Third button must be selected
                } else {
                    //Check if the field is a number
                    if (new String(passwordField1.getPassword()).matches("[0-9]+")){
                        //Switch for all Channel values and execute based on that
                        switch (new String(passwordField1.getPassword())) {
                            case "2":
                                instructions.setText("Channel 2 got top ratings last week!");
                                passwordField1.setVisible(false);
                                break;
                            case "4":
                                instructions.setText("Channel 4 shows primarily news!");
                                passwordField1.setVisible(false);
                                break;
                            case "6":
                                instructions.setText("Channel 6 shows old movies!");
                                passwordField1.setVisible(false);
                                break;
                            case "8":
                                instructions.setText("Channel 8 covers local events!");
                                passwordField1.setVisible(false);
                                break;
                            case "11":
                                instructions.setText("Channel 11 is public broadcasting!");
                                passwordField1.setVisible(false);
                                break;
                            default:
                                instructions.setText("That channel does not exist. It must be a cable channel.");
                                passwordField1.setVisible(false);
                                break;

                        }
                    }
                }
            }
        });

    }

    public static void main(String[] args) {
        //Frame initialization code
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(500, 500, 700, 500);
        frame.setVisible(true);
    }
}
