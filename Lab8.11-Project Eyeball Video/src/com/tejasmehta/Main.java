/****
 * Name: Tejas Mehta
 * Date: March 15th, 2019
 * Lab Name: Lab8.11-Project Eyeball Video
 * Extra: Added the point where you can have a rental fee of any amount of days, dynamically calculating fees, and Did late fees by randomly assigning a number from 0-5, and customer IDs by assigning a random nunber between 100 & 1000
 */
package com.tejasmehta;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Declare initial vars and get the different parts in the arrays
        String[] customers = {"Tejas", "Frank", "Agranya", "Sanay", "Connor", "Sanay", "Ben", "Nathaniel", "Sai","Elijah"};
        int[] lateDays = GetLateDate(customers.length);
        int[] customerID = GetCustomerID(customers.length);
        double[] fees = GetFeeAmnt(lateDays, customers.length);
        String[] status = GetStatus(lateDays, customers.length);
        //Sort by id and check for fees
        SortbyID(customerID, customers, lateDays, fees, status);
        checkFees(customers, status);
    }
    //Get the days late by making a random and generating random numbers
    private static int[] GetLateDate(int length) {
        int[] lateDays =new int[length];
        Random random = new Random();
        for(int i = 0; i < lateDays.length; i++) {
            lateDays[i] = random.nextInt(6);
        }
        return lateDays;
    }
    //Make a random 3 digit number for each customer's id
    private static int[] GetCustomerID(int length) {
        int[] customerIDS = new int[length];
        Random random = new Random();
        for(int i = 0; i < customerIDS.length; i++) {
            customerIDS[i] = random.nextInt(900) + 100;
        }
        return customerIDS;
    }
    //Get the fee amount by multiplying the number by the amount of days and respective value
    private static double[] GetFeeAmnt(int[] lateDays, int length) {
        double[] fees = new double[length];
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        for(int i = 0; i < lateDays.length; i++) {
            if(lateDays[i] < 5) {
                fees[i] = Double.parseDouble(df.format(1.49*lateDays[i]));
            } else {
                fees[i] = Double.parseDouble(df.format(0.69*lateDays[i]));
            }
        }
        return fees;
    }
    //Get the user's status based on if they have any amount of late days
    private static String[] GetStatus(int[] lateDays, int length) {
        String[] status = new String[length];
        for(int i = 0; i < lateDays.length; i++) {
            if(lateDays[i] > 0){
                status[i] = "Late";
            } else {
                status[i] = "Not Late";
            }
        }
        return status;
    }
    //Sort by their ids(bubble sort)
    private static void SortbyID(int[] arr, String[] customers, int[] latedays, double[] fees, String[] status) {
        int j;
        boolean flag = true;
        int temp, temp3;
        String temp2, temp5;
        double temp4;
        //While flag is true
        while (flag) {
            flag = false;
            for(j=0; j < arr.length-1; j++) {
                //Check for ascending or descending and perform sort if needed
                    if (arr[j] > arr[j+1]) {
                        //Multiple temp vars, and swap each as needed
                        temp = arr[j];
                        temp2 = customers[j];
                        temp3 = latedays[j];
                        temp4 = fees[j];
                        temp5 = status[j];
                        arr[j] = arr[j+1];
                        customers[j] = customers[j+1];
                        latedays[j] = latedays[j + 1];
                        fees[j] = fees[j + 1];
                        status[j] = status[j + 1];
                        arr[j+1] = temp;
                        customers[j+1] = temp2;
                        latedays[j+1] = temp3;
                        fees[j+1] = temp4;
                        status[j+1] = temp5;
                        flag = true;

                }
            }
        }
        System.out.println("Sorted by customer ID: ");
        //Print sorted
        for(int i = 0; i < customers.length; i++) {
            System.out.println(customers[i] + "\t\t" + arr[i] + "\t\t" + latedays[i] + "\t\t" + fees[i] + "\t\t" + status[i]);
        }
    }
    //Function to check who owes late fees & print who does and doesn't
    private static void checkFees(String[] customers, String[] status) {
        System.out.println("People who owe late fees:");
        for(int i = 0; i < status.length; i++) {
            if (status[i].toLowerCase().equals("late")) {
                System.out.println(customers[i]);
            }
        }
        System.out.println("People who don't owe late fees:");
        for(int i = 0; i < status.length; i++) {
            if (status[i].toLowerCase().equals("not late")) {
                System.out.println(customers[i]);
            }
        }
    }
}
