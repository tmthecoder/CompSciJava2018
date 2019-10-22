package com.tejasmehta;
/****
 * Name: Tejas Mehta
 * Date: May 17th, 2019
 * Lab Name: LabOOP3-Quadratic Lab
 * Extra: Made a Law of Cosines Calculator
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //init vars
        Scanner in = new Scanner(System.in);
        while (true) {
            //Ask for formula solver choice and call appropriate method
            System.out.println("Enter 1 for quadratic, and 2 for law of cosines");
            int input = in.nextInt();
            switch (input) {
                case 1:
                    QuadraticSolve(in);
                    break;
                case 2:
                    CosineSolve(in);
                    break;
                default:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
    //Construct quadratic and solve
    private static void QuadraticSolve(Scanner in) {
        Quadratic quadratic = getVals(in, "Enter 'c' value:");
        quadratic.calcRoots();
        System.out.println(quadratic);
    }
    //Get user input and return as a constructed class
    private static Quadratic getVals(Scanner in, String s) {
        System.out.println("Enter 'a' value:");
        int a = in.nextInt();
        System.out.println("Enter 'b' value:");
        int b = in.nextInt();
        System.out.println(s);
        int c = in.nextInt();
        return new Quadratic(a, b, c);
    }
    //Construct class and solve
    private static void CosineSolve(Scanner in) {
        Quadratic quadratic = getVals(in, "Enter angle value:");
        quadratic.calcCos();
        System.out.println(quadratic);
    }
}
