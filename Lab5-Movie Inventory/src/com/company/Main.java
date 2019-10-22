/****
 * Name: Tejas Mehta
 * Lab Name: Lab5-Movie Inventory
 * Date: Sept. 28, 2018
 * Extra: I added a minimal GUI, as well as the option to enter your own movie names, and shows the same names through the time of that loop, as well as checks on whether the right type of input was entered by the user.
 */
package com.company;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        boolean running = true;
        //start running loop
        while (running) {
            //get choice(1 or 2)
            String choice = JOptionPane.showInputDialog("Enter 1 to Enter Stock of 3 Choice Movies, Enter 2 to Enter Your Choice of Movies, or Press any Other Key to Quit.");
            switch (choice) {
                //check if choice is 1
                case "1":
                    //declare textfields for all movie stock and cost
                    JTextField lordsCostText = new JTextField();
                    JTextField lordsStockText = new JTextField();
                    JTextField menaceCostText = new JTextField();
                    JTextField menaceStockText = new JTextField();
                    JTextField spyCostText = new JTextField();
                    JTextField spyStockText = new JTextField();

                    //create array for all with labels showing which is which
                    final JComponent[] inputs = new JComponent[]{
                            new JLabel("Enter the Cost for Lord of the Ringdings below:"),
                            lordsCostText,
                            new JLabel("Enter the Stock for Lord of the Ringdings below:"),
                            lordsStockText,
                            new JLabel("Enter the Cost for Dennis the Dentist Menace below:"),
                            menaceCostText,
                            new JLabel("Enter the Stock for Dennis the Dentist Menace below:"),
                            menaceStockText,
                            new JLabel("Enter the Cost for Spy Kids Aged 52 below:"),
                            spyCostText,
                            new JLabel("Enter the Stock for Spy Kids Aged 52 below:"),
                            spyStockText
                    };

                    //show dialog listening for button press 'ok'
                    int results = JOptionPane.showConfirmDialog(null, inputs, "Enter Data", JOptionPane.DEFAULT_OPTION);
                    //check if ok pressed
                    if (results == JOptionPane.OK_OPTION) {
                        System.out.print("in");
                        //run function to get cost and average
                        getMoviesCostAndAvg("The Lord of the Ringdings", "Dennis the Dentist Menace", "Spy Kids Aged 52", lordsCostText, lordsStockText, menaceCostText, menaceStockText, spyCostText, spyStockText);
                    }
                    break;
                //check if '2' entered
                case "2":
                    //declaere movie name, cost and stock textfields
                    JTextField movie1Text = new JTextField();
                    JTextField movie1CostText = new JTextField();
                    JTextField movie1StockText = new JTextField();
                    JTextField movie2Text = new JTextField();
                    JTextField movie2CostText = new JTextField();
                    JTextField movie2StockText = new JTextField();
                    JTextField movie3Text = new JTextField();
                    JTextField movie3CostText = new JTextField();
                    JTextField movie3StockText = new JTextField();
                    //set array to get movie names
                    final JComponent[] movieNames = new JComponent[]{
                            new JLabel("Enter the name of your first movie:"),
                            movie1Text,
                            new JLabel("Enter the name of your second movie:"),
                            movie2Text,
                            new JLabel("Enter the name of your third movie:"),
                            movie3Text
                    };
                    //get results listening for an int ion button press
                    int movieNamesDone = JOptionPane.showConfirmDialog(null, movieNames, "Enter Names", JOptionPane.DEFAULT_OPTION);
                    //check if 'ok' pressed
                    if (movieNamesDone == JOptionPane.OK_OPTION) {
                        //declare second input array with the remaining textfields
                        final JComponent[] inputs2 = new JComponent[]{
                                new JLabel("Enter the Cost for " + movie1Text.getText() + " below:"),
                                movie1CostText,
                                new JLabel("Enter the Stock for " + movie1Text.getText() + " below:"),
                                movie1StockText,
                                new JLabel("Enter the Cost for " + movie2Text.getText() + " below:"),
                                movie2CostText,
                                new JLabel("Enter the Stock for " + movie2Text.getText() + " below:"),
                                movie2StockText,
                                new JLabel("Enter the Cost for " + movie3Text.getText() + " below:"),
                                movie3CostText,
                                new JLabel("Enter the Stock for " + movie3Text.getText() + " below:"),
                                movie3StockText
                        };
                        //listen for other movies cost and stock
                        int results2 = JOptionPane.showConfirmDialog(null, inputs2, "Enter Data", JOptionPane.DEFAULT_OPTION);
                        //check if 'ok' pressed
                        if (results2 == JOptionPane.OK_OPTION) {
                            //call function to get movie cost and average
                            getMoviesCostAndAvg(movie1Text.getText(), movie2Text.getText(), movie3Text.getText(), movie1CostText, movie1StockText, movie2CostText, movie2StockText, movie3CostText, movie3StockText);
                        }
                    }


                    break;
                default:
                    //stop loop and end program as another key was pressed
                    running = false;
                    break;
            }
        }
    }

    //function to get movie cost and average
    private static void getMoviesCostAndAvg(String movie1, String movie2, String movie3, JTextField movie1CostText, JTextField movie1StockText, JTextField movie2CostText, JTextField movie2StockText, JTextField movie3CostText, JTextField movie3StockText) {
        //check if the stock numbers are whole numbers
        if (movie1StockText.getText().matches("[0-9]+") && movie2StockText.getText().matches("[0-9]+") && movie3StockText.getText().matches("[0-9]+")) {
            //make try/catch to make sure all numbers entered are doubles
            try {
                //declare all calculation variables needed and give them their assigned values
                BigDecimal lordsCost, lordsStock, menaceCost, menaceStock, spyCost, spyStock, totalLords, totalMenace, totalSpy, totalStock, totalCost, average;System.out.print("in");
                lordsCost = BigDecimal.valueOf(Double.parseDouble(movie1CostText.getText()));
                lordsStock = BigDecimal.valueOf(Double.parseDouble(movie1StockText.getText()));
                menaceCost = BigDecimal.valueOf(Double.parseDouble(movie2CostText.getText()));
                menaceStock = BigDecimal.valueOf(Double.parseDouble(movie2StockText.getText()));
                spyCost = BigDecimal.valueOf(Double.parseDouble(movie3CostText.getText()));
                spyStock = BigDecimal.valueOf(Double.parseDouble(movie3StockText.getText()));
                totalLords = lordsCost.multiply(lordsStock);
                totalMenace = menaceCost.multiply(menaceStock);
                totalSpy = spyCost.multiply(spyStock);
                totalCost = totalLords.add(totalMenace.add(totalSpy)).setScale(2, RoundingMode.CEILING);
                totalStock = lordsStock.add(menaceStock.add(spyStock));
                average = totalCost.divide(totalStock, RoundingMode.HALF_UP).setScale(2, RoundingMode.CEILING);
                //show dialog with costs, names, stocks, total cost and average.
                JOptionPane.showMessageDialog(null, movie1+" is: $" + lordsCost + "\nYou have " + lordsStock + " copies of "+movie1+"\n" + movie2+ " is: $" + menaceCost + "\nYou have " +menaceStock + " copies of "+movie2+"\n"+movie3+" is: $" + spyCost + "\nYou have " + spyStock + " copies of "+movie3+"\nThe total value is: $" + totalCost + "\nThe average value is: $" + average);

            } catch (NumberFormatException ignore) {
                System.out.print("Invalid input");
            }
        }
    }
}
