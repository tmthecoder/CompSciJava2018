/****
 * Name: Tejas Mehta
 * Date: February 25, 2019
 * Lab Name: Lab7.1-Worksheet Create
 * Extra: Let the user enter their own infor for the Courses.txt portion
 */
package com.tejasmehta;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static PrintWriter pw;
    private static File nf = null;
    //Declare main vars
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declare scanner and start loop
        while (true) {
            System.out.println("What lab would you like to do(1-3) or press any other key to quit");
            //Ask lab choice
            String choice = in.nextLine();
            //Check for choice and do code respectively
            switch (choice) {
                case "1":
                    //Ask for all info and call function
                    System.out.println("Enter your name(First/Last):");
                    String name = in.nextLine();
                    System.out.println("Enter your favorite course name");
                    String favCourse = in.nextLine();
                    System.out.println("Enter your last 3 test grades(separated however)");
                    String testGrades = in.nextLine();
                    System.out.println("Enter the name of your favorite Teacher");
                    String favTeacher = in.nextLine();
                    writeFileCourse(name, favCourse, testGrades, favTeacher);
                    break;
                case "2":
                    //Ask for employee count and call function
                    System.out.println("How many employees do you have?");
                    int employees = in.nextInt();
                    in.nextLine();
                    payrollCreate(employees, in);
                    break;
                case "3":
                    //Ask num count and call function
                    System.out.println("How many random numbers do you want generated?");
                    int numbers = in.nextInt();
                    in.nextLine();
                    Randoms(numbers);
                    break;
                default:
                    //Exit due to other input
                    System.out.println("Exiting....");
                    System.exit(0);
            }
        }
    }
    private static void writeFileCourse(String name, String favCourse, String testGrades, String favTeacher) {
        //Make new file
        nf = new File("src/Course.txt");
        try {
            //Write said values to it
            pw = new PrintWriter(nf);
            pw.println("Their name is: " + name);
            pw.println("Favorite course is: " + favCourse);
            pw.println("Last 3 test Grades: " + testGrades);
            pw.println("Favorite Teacher is: " + favTeacher);
            pw.close();
        } catch (FileNotFoundException e) {
            //Error handle
            System.out.println("There was an error: " + e.getMessage());
        }
    }
    private static void payrollCreate(int employees, Scanner in) {
        //Make new file
        nf = new File("src/Payroll.txt");
        try {
            //Make new writer
            pw = new PrintWriter(nf);
            for(int i = 1; i <= employees; i++) {
                //Loop to ask per employee info
                System.out.println("Enter name for employee " + i + ": ");
                pw.println("Name: " + in.nextLine());
                System.out.println("Enter wage for employee " + i + ": ");
                pw.println("Wage: " + in.nextLine());
                System.out.println("Enter hours worked in the past week for employee " + i + ": ");
                pw.println("Hours Worked: " + in.nextLine());
                System.out.println("Enter any employee information for employee " + i + ":");
                pw.println("Additional Info: " + in.nextLine());
            }
            pw.close();
        } catch (FileNotFoundException e) {
            //Error handle
            System.out.println("There was an error: " + e.getMessage());
        }
    }
    private static void Randoms(int numbers) {
        //Random
        Random random = new Random();
        //Make new file
        nf = new File("src/Numbers.txt");
        try {
            //New writer and write randoms
            pw = new PrintWriter(nf);
            for(int i = 1; i <= numbers; i++) {
                pw.println("Random " + i + ": " + random.nextInt(100));
            }
            pw.close();
        } catch (FileNotFoundException e) {
            //Error handle
            System.out.println("There was an error: " + e.getMessage());
        }
    }
}
