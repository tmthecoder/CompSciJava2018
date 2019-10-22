/****
 * Name: Tejas Mehta
 * Date: February 4th, 2018
 * Lab Name: Lab6.1-Worksheet Math Methods
 * Extra: Asked the user for a range of numbers for powers
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        //Declare vars
        boolean first = true;
        while (true) {
            //Start loop
            System.out.println("What lab part would you like to do(1-8)?");
            //Ask for lab
            String choice = in.nextLine();
            if (!first) {
                choice = in.nextLine();
            }
            //Ask for necessary inputs and Go to corresponding Function
            switch (choice) {
                case "1":
                    System.out.println("Enter any Decimal Number");
                    DecimalRound(in.nextDouble());
                    break;
                case "2":
                    System.out.println("Enter your age:");
                    int age = in.nextInt();
                    System.out.println("Enter your friends age:");
                    AgeDiff(age, in.nextInt());
                    break;
                case "3":
                    SqrtPrint();
                    break;
                case "4":
                    System.out.println("Enter the first number of the range");
                    int firstR = in.nextInt();
                    System.out.println("Enter the second number of the range");
                    int secondN = in.nextInt();
                    //Check greater and then go to function
                    if (firstR > secondN) {
                        PowPrint(secondN, firstR);
                    } else {
                        PowPrint(firstR, secondN);
                    }
                    break;
                case "5":
                    System.out.println("Enter a number");
                    double firstNum = in.nextDouble();
                    System.out.println("Enter another number");
                    double secondNum = in.nextDouble();
                    getGreater(firstNum, secondNum);
                    break;
                case "6":
                    CostumeDetails();
                    break;
                case "7":
                    PrintExponential();
                    break;
                case "8":
                    TriangleDetails();
                    break;
                default:
                    System.out.println("Exiting ...");
                    System.exit(0);
            }
            first = false;
        }
    }
    //Rounding function
    private static void DecimalRound(double num) {
        System.out.println("Your number rounded is: " + Math.round(num));
    }
    //Difference abs function
    private static void AgeDiff(int age1, int age2) {
        System.out.println("The difference between age is " + Math.abs(age1 - age2));
    }
    //Sqrt Print function for 1-20
    private static void SqrtPrint() {
        for(int i = 1; i <= 20; i++) {
            System.out.println("The Square Root of " + i + " is " + Math.sqrt(i));
        }
    }
    //Print powers for x amount of numbers
    private static void PowPrint(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.print(i + "    ");
            for(int pow = 1; pow <= 3; pow++) {
                System.out.print(Math.pow(i, pow) + "    ");
            }
            System.out.println();
        }
    }
    //Get greater number
    private static void getGreater(double a, double b) {
        System.out.println("The Greater Number is " + Math.max(a, b));
    }
    //Get costume details
    private static void CostumeDetails() {
        int[] nums = new int[4];
        nums[0] = 36;
        nums[1] = 38;
        nums[2] = 40;
        nums[3] = 42;
        int totalPipe = 0;
        for (int num : nums) {
            //Get height and vals per
            totalPipe += Math.round(num * 2 * 3.14);
            System.out.println("The amount of fabric needed for a height of " + num + " in is " + Math.round(Math.pow(num, 2) * 3.14) + " in");
        }
        //Total cal
        System.out.println("The total amount of tubing needed is " + totalPipe);

    }
    //Exponential functoion code
    private static void PrintExponential(){
        double k = 0.25935;
        double e = 2.71;
        int a0 = 40;
        for(int t = 0; t <= 24; t++) {
            System.out.println("At " + t + " hours, there are " + Math.round(a0 * Math.pow(e, (k * t))) + " bacteria");
        }
    }
    //Print triangle details and angle measure
    private static void TriangleDetails() {
        System.out.println("The Hypotenuse length is " + Math.round(Math.hypot(9, 13)));
        System.out.println("The angle measure is " + Math.round(Math.acos(13/Math.hypot(9, 13))));
    }
}
