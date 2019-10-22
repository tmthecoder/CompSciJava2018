/****
 * Name: Tejas Mehta
 * Date: December 6, 2018
 * Lab Name: Lab5.1-Method Worksheet
 * Extra: Added the choice of the user to choose their operation of what to do with the squares.
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        //Declare scanner and running var
        boolean running = true;
        while (running) {
            //Ask for user's choice
            System.out.println("Enter the lab you would like to pick(1-3) or press any key to quit:");
            String choice = in.nextLine();
            switch (choice) {
                //Case 1, so call the getHeader
                case "1":
                    getCompanyHeader();
                    break;
                //Get numbers and call squared Function
                case "2":
                    System.out.println("Enter first integer");
                    int num1 = in.nextInt();
                    System.out.println("Enter second integer");
                    int num2 = in.nextInt();
                    System.out.println("Enter your operation:");
                    String operation = in.nextLine();
                    operation = in.nextLine();
                    squaredSum(num1, num2, operation);
                    break;
                //Get numbers, character and call function
                case "3":
                    System.out.println("Enter a single character");
                    String character = in.nextLine();
                    System.out.println("Enter the amount of times per line");
                    int lineAmnt = in.nextInt();
                    System.out.println("Enter the amount of lines");
                    int lineCnt = in.nextInt();
                    numPrint(character, lineAmnt, lineCnt);
                    break;
                default:
                    //Exit as the entry wasn't valid
                    System.exit(0);

            }
        }
    }


    public static void getCompanyHeader() {
        //Print a header
        System.out.println("This is a company header");
    }
    public static void squaredSum(int a, int b, String operation) {
        //declare variable
        int answer;
        //Check operation and do it respectively, printing the results
        if (operation.equals("+")) {
            answer = (a * a) + (b * b);
            System.out.println("The sum of the squares is " + answer);
        } else if(operation.equals("-")){
            answer = (a * a) - (b * b);
            System.out.println("The difference of the squares is " + answer);
        } else if (operation.equals("*")) {
            answer = (a * a) * (b * b);
            System.out.println("The product of the squares is " + answer);
        } else if (operation.equals("/")){
            answer = (a * a) / (b * b);
            System.out.println("The division of the squares is " + answer);
        } else {
            System.out.println("The operation was not a recognized operation. Please try again.");
        }
    }
    public static void numPrint(String character, int lineAmnt, int lineCnt) {
        //Declare string variable
        String printString = "";
        //For loop to get the amount of times per line
        for (int i = 0; i < lineAmnt; i++) {
            printString = printString + character;
        }
        //For loop to print it x amount of lines
        for (int i = 0; i < lineCnt; i++) {
            System.out.println(printString);
        }
    }
}
