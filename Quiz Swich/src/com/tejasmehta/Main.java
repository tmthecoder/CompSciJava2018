/****
 * Name: Tejas Mehta
 * Date: October 29, 2018
 * Lab Name: Quiz Switch
 * Extra: None Needed
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare scanner
        Scanner in = new Scanner(System.in);
        //Ask for number inputs and store them in variables
        System.out.println("Enter your first number below:");
        int firstNumber = in.nextInt();
        System.out.println("Enter your second number below:");
        int secondNumber = in.nextInt();
        //Check if they are positive
        if (firstNumber >= 0 && secondNumber >= 0) {
            //Ask for operation choice
            System.out.println("Pick from the operations below:\n1.  add\n" + "2.  subtract\n" + "3.  multiply\n" + "4.  divide");
            String choice = in.nextLine();
            choice = in.nextLine();
            //Check operation and print respective output
            switch (choice) {
                case "1":
                    System.out.println(firstNumber + secondNumber);
                    break;
                case "2":
                    System.out.println(firstNumber - secondNumber);
                    break;
                case "3":
                    System.out.println(firstNumber * secondNumber);
                    break;
                case "4":
                    System.out.println(firstNumber / secondNumber);
                    break;
                default:
                    System.out.println("You didn't pick a valid choice!");
                    System.exit(0);
                    break;
            }
        } else {
            //Invalid input, exit program
            System.out.println("Please enter positive numbers");
            System.exit(0);
        }
    }
}
