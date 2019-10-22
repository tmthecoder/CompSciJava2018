package com.tejasmehta;
//(c) A+ Computer Science
//www.apluscompsci.com
/****
 * Name - Tejas Mehta
 * Date - May 15th, 2019
 * Lab Name: LabOOP2-Miles Per Hour
 * Extra: Same as in Main file
 */
public class MilesPerHour {
    private int distance, hours, minutes, gallons;
    private double mph,mpg;
    //Default constructor
    MilesPerHour() {
        setNums(0,0,0, 0);
        mph=0.0;
    }
    //MPH set via vars given
    MilesPerHour(int dist, int hrs, int mins, int gallonCnt) {
        setNums(dist, hrs, mins, gallonCnt);
    }
    //Set all numbers got from previous function
    private void setNums(int dist, int hrs, int mins, int gallonCnt) {
        distance = dist;
        hours = hrs;
        minutes = mins;
        gallons = gallonCnt;
    }
    //Calculate and round mph/mpg to 2 decimal places
    void calcMPH() {
        double allHrs = hours + (double)minutes/60;
        mph = (double)Math.round(distance/allHrs * 100)/100;
        mpg = (double)Math.round((double)distance/gallons*100)/100;
    }
    //Print the mog
    public void print() {
        System.out.println("Miles Per Hour: " + mph + " MPH\nMiles Per Gallon: " + mpg);
    }

    //to string override
    public String toString() {
        return "Miles Per Hour: " + mph + " MPH\nMiles Per Gallon: " + mpg;
    }
}