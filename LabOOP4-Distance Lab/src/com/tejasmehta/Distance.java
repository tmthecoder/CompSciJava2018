package com.tejasmehta;
//(c) A+ Computer Science
//www.apluscompsci.com

/****
 * Name: Tejas Mehta
 * Date: May 17th, 2019
 * Lab Name: LabOOP4-Distance Lab
 * Extra: Same as main
 */

public class Distance {
    private int xOne,yOne,xTwo,yTwo;
    private double distance;
    private String midpoint;
    //init vars and blank constructor
    public Distance() {
        setCoordinates(0, 0, 0, 0);
    }
    //Constructer for given vals
    Distance(int x1, int y1, int x2, int y2) {
        setCoordinates(x1, y1, x2, y2);
    }
    //Coordinate setter
    private void setCoordinates(int x1, int y1, int x2, int y2) {
        xOne = x1;
        yOne = y1;
        xTwo = x2;
        yTwo = y2;
    }
    //To calculate the distance & midpoint within two points(using distance formula & midpoint formula)
    void calcDistance() {
        double first = Math.pow((xOne-xTwo) , 2);
        double second = Math.pow((yOne-yTwo) , 2);
        distance = (double)Math.round(Math.sqrt(first+second)*100)/100;
        double xMdpt = (double)(xOne+xTwo)/2;
        double yMdpt = (double)(yOne+yTwo)/2;
        midpoint = "(" + xMdpt + ", " + yMdpt + ")";
    }
    //getter for dist
    public double getDistance() {
        return 0.0;
    }
    //Print function
    public void print() {
        System.out.println("The distance is: " + distance + "\n The midpoint is " + midpoint);
    }

    //complete print or the toString
    //toString override
    public String toString() {
        return "The distance is: " + distance + "\nThe midpoint is " + midpoint;
    }
}