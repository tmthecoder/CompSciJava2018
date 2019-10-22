/****
 * Name: Tejas Mehta
 * Lab Name: Lab2.5-Computer Abuse
 * Date: October 25, 2018
 * Extra:
 */
package com.tejasmehta;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Set bools to needed values
        boolean running = true;
        boolean offenseFour = false;
        BigDecimal totalFine = BigDecimal.ZERO;
        //Declare Scanner and ask for needed inputs
        Scanner in = new Scanner(System.in);
        System.out.println("Society for the Prevention of Cruelty to Computers");
        System.out.println("What is the investigator's name?");
        String investigator = in.nextLine();
        System.out.println("What is the offender's name?");
        String offender = in.nextLine();
        System.out.println("What cruelty offense(s) did you observe?(Please separate multiple offenses with a comma)  Here are the choices:\n" +
                "     1. Name calling at the computer.  ($49.95)\n" +
                "     2. Finger shaking at the computer.  ($99.95)\n" +
                "     3. Yelling loudly at the computer.  ($149.95)\n" +
                "     4. Physically attacking the computer.  ($499.95)");
        String offense = in.nextLine();
        //Check if they entered multiple offenses, and then split them and get total price
        if (offense.contains(",")) {
            String text = offense;
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
            //Ckeck if there were more than four offenses entered, and then exit program
            if (allNums.length > 4) {
                System.out.println("You did not enter an appropriate response.  The program is ending.");
                System.exit(0);
            } else {
                //Split offenses and check if they are in the range of given offenses
                for (int i = 0; i < allNums.length; i++) {
                    if (allNums[i] == 0 || allNums[i] > 4) {
                        running = false;
                        System.out.println("You did not enter an appropriate response.  The program is ending.");
                        System.exit(0);
                    } else {
                        //Check the number and add it to the total fine
                        if (allNums[i] == 1) {
                            totalFine = totalFine.add(BigDecimal.valueOf(49.95));
                        } else if (allNums[i] == 2) {
                            totalFine = totalFine.add(BigDecimal.valueOf(99.95));
                        } else if (allNums[i] == 3) {
                            totalFine = totalFine.add(BigDecimal.valueOf(149.95));
                        } else if (allNums[i] == 4) {
                            totalFine = totalFine.add(BigDecimal.valueOf(499.95));
                            offenseFour = true;
                        }
                    }
                }
                //Call show total offense function
                showTotal(offenseFour, totalFine, investigator, offender);

            }
        } else {
            switch (offense) {
                case "1":
                    totalFine = BigDecimal.valueOf(49.95);
                    break;
                case "2":
                    totalFine = BigDecimal.valueOf(99.95);
                    break;
                case "3":
                    totalFine = BigDecimal.valueOf(149.95);
                    break;
                case "4":
                    totalFine = BigDecimal.valueOf(499.95);
                    offenseFour = true;
                    break;
                default:
                    System.out.println("You did not enter an appropriate response.  The program is ending.");
                    System.exit(0);
            }
            //Call show total offense function
            showTotal(offenseFour, totalFine, investigator, offender);
        }

    }

    private static void showTotal(boolean offenseFour, BigDecimal totalFine, String investigator, String offender) {
        //Check if offender is donald and if the fine is fine 4, and then add the 45% extra and print out the fine, if not, show the fine
        if ((offender.equals("donald") || offender.equals("Donald")) && offenseFour) {
            BigDecimal newFineAbuse = BigDecimal.valueOf(499.95).multiply(BigDecimal.valueOf(1.45)).setScale(2, RoundingMode.HALF_UP);
            totalFine = totalFine.subtract(BigDecimal.valueOf(499.95)).add(newFineAbuse);
            System.out.println("The total fine is $" + totalFine + " as reported by " + investigator);
        } else {
            System.out.println("The total fine is $" + totalFine + " as reported by " + investigator);
        }
    }
}
