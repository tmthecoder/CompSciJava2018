/****
 * Name: Tejas Mehta
 * Date: December 18, 2018
 * Lab Name: Lab5.3-Methods Quiz
 * Extra: None needed
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Declare scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        //Get the length
        double length = in.nextDouble();
        System.out.println("Enter the width of the rectangle");
        //Get the width
        double width = in.nextDouble();
        //Print asterics
        astericPrint();
        //Print perimeter
        System.out.println("\nThe perimeter of the rectangle is: " + perimeter(length, width));
        //Print asterics
        astericPrint();
        //Print area
        System.out.println("\nThe area of the rectangle is: " + area(length, width));
        //Print asterics
        astericPrint();

    }
    public static void astericPrint() {
        //For loop to print until 75 is reached
        for (int i = 1; i <= 75; i++) {
            System.out.print("*");
        }
    }
    public static double perimeter(double length, double width) {
        //Return based on the formula p = 2l + 2w
        return (length * 2) + (width * 2);
    }
    public static double area(double length, double width) {
        //return based on the formula a = lw
        return length * width;
    }
}
