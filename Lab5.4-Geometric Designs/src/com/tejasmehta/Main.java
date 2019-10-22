/****
 * Name: Tejas Mehta
 * Date: December 18, 2018
 * Lab Name: Lab5.4-Geometric Designs
 * Extra: Allowed users to enter a length and width for their designs
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare variables and start loop
        Scanner in = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Enter a shape to make(1-6)");
            String choice = in.nextLine();
            switch (choice) {
                //first case, go to method
                case "1":
                    printIsocelesRight();
                    break;
                //second case, get length and width then go to method
                case "2":
                    System.out.println("Enter the length for the shape");
                    int length = in.nextInt();
                    System.out.println("Enter the width for the shape");
                    int width = in.nextInt();
                    printRectangle(length, width);
                    break;
                //third case, go to method
                case "3":
                    printIsoceles();
                    break;
                //fourth case, go to method
                case "4":
                    printOpenRectangle();
                    break;
                //fifth case, go to method
                case "5":
                    printOpenIsosceles();
                    break;
                //sixth case, go to method
                case "6":
                    printRectOvSqOvRect();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    //Print isosceles right
    public static void printIsocelesRight() {
        //First for loop for line amnt
        for(int i = 1; i <= 6; i++){
            //Second for loop for count of chars per line
            for (int num = 1; num <= i; num++) {
                System.out.print("$");
            }
            System.out.print("\n");
        }
        //print name
        System.out.println("Isosceles Right Triangle");
    }
    //Print rectangle
    public static void printRectangle(int length, int width) {
        //For loop to get length(amnt of lines)
        for (int i = 1; i <= length; i++) {
            //for loop to print width(Chars per line)
            for (int cnt = 1; cnt <= width; cnt++) {
                System.out.print("%");
            }
            System.out.print("\n");
        }
        //Print name
        System.out.println("Rectangle");
    }
    //Print isosceles
    public static void printIsoceles() {
        int cntVar = 1;
        int spaceCnt = 4;
        //Declare variables
        //for loop to print spaces
        for(int i = 1; i <= 5; i++) {
            for (int space = 1; space <= spaceCnt; space++) {
                System.out.print(" ");
            }
            //for loop to print chars
            for (int cnt = 1; cnt <= cntVar; cnt++) {
                System.out.print("#");
            }
            System.out.print("\n");
            //Change vars accordingly
            cntVar += 2;
            spaceCnt--;
        }
        //Print name
        System.out.println("Isosceles Triangle");
    }
    //Print open rectangle
    public static void printOpenRectangle() {
        System.out.println("&&&&&&&&");
        //print top
        //for loop to print interior
        for(int i = 0; i < 3; i++) {
            System.out.println("&      &");
        }
        //print bottom and name
        System.out.println("&&&&&&&&");
        System.out.println("Open Rectangle");
    }
    //Print open isosceles
    public static void printOpenIsosceles() {
        int spaceCnt = 4;
        int intraSpace = 1;
        //Declare base var and print top
        System.out.println("     @");
        //For loop for lines
        for (int i = 1; i <= 4; i++) {
            //For loop for spaces initial
            for (int space = 1; space <= spaceCnt; space++) {
                System.out.print(" ");
            }
            //Print first @
            if (intraSpace != 0) {
                System.out.print("@");
            } else {
                System.out.print(" ");
            }
            //For loop to print spaces between @
            for (int intSpace = 1; intSpace <= intraSpace; intSpace++) {
                System.out.print(" ");
            }
            //Print second @
            System.out.print("@");

            System.out.print("\n");
            //Change vars accordingly
            spaceCnt--;
            intraSpace+=2;
        }
        //Print bottom and name
        System.out.println("@@@@@@@@@@@");
        System.out.println("Open Isosceles");
    }
    //Print "I" shaped figure
    public static void printRectOvSqOvRect() {
        //For loop to print top part
        for (int i = 1; i <= 2; i++) {
            System.out.println("@@@@@@");
        }
        //For loop to print middle part
        for (int i = 1; i < 4; i++) {
            System.out.println(" @@@@ ");
        }
        //For loop to print botton part
        for (int i = 1; i <= 2; i++) {
            System.out.println("@@@@@@");
        }
        //Print name
        System.out.println("Rectangle over Square over Rectangle");
    }
}
