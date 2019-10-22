package com.tejasmehta;

import java.util.Scanner;

/****
 * Name - Tejas Mehta
 * Date - May 15th, 2019
 * Lab Name: LabOOP2-Miles Per Hour
 * Extra: Calculated Miles Per Gallon
 */
public class Main {

    public static void main(String[] args) {
        //Declare scanner and ask for all vars needed
        Scanner in = new Scanner(System.in);
        System.out.println("Enter distance: ");
        int dist = in.nextInt();
        System.out.println("Enter hours: ");
        int hours = in.nextInt();
        System.out.println("Enter minutes: ");
        int mins = in.nextInt();
        System.out.println("How many gallons were used?");
        int gallons = in.nextInt();
        //Declare calc Object
        MilesPerHour mphCalc = new MilesPerHour(dist, hours, mins, gallons);
        //Calculate mph
        mphCalc.calcMPH();
        //Print
        System.out.println(mphCalc);
    }
}
