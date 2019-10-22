/****
 * Name: Tejas Mehta
 * Date: February 25, 2019
 * Lab Name: Worksheet Read
 * Extra: Prints the total amount of employees as well.
 */
package com.tejasmehta;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Main {
    private static File file;
    //Declare empty file
    public static void main(String[] args) {
        //Start loop
        while (true) {
            Scanner in = new Scanner(System.in);
            //Declare scanner and ask choice
            System.out.println("Choose a lab(1-3) or press any key to quit");
            String choice = in.nextLine();
            //Perform method according to choice
            switch (choice) {
                case "1":
                    CoursesChk(in);
                    break;
                case "2":
                    PayrollChk(in);
                    break;
                case "3":
                    IntCheck(in);
                    break;
                default:
                    //Exit
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
    private static void CoursesChk(Scanner in) {
        //Declare file
        file = new File("src/Course.txt");
        //Try for sanner attachment
        try {
            in = new Scanner(file);
            //Get vars from file and print them to console
            String name = in.nextLine();
            String subj = in.nextLine();
            int gr1 = in.nextInt(), gr2 = in.nextInt(), gr3 = in.nextInt();
            in.nextLine();
            String favTeach = in.nextLine();
            System.out.println("Name: " + name);
            System.out.println("Fav Subj: " + subj);
            System.out.println("Grade Avg: " + (gr1+gr2+gr3)/3);
            System.out.println("Fav Teacher: " + favTeach);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void PayrollChk(Scanner in) {
        //Declare file
        file = new File("src/Payroll.txt");
        //Declare needed vars
        String name = "";
        int wage = 0;
        int hours = 0;
        int count = 0;
        String addInfo = "";
        try {
            //Try attach
            in = new Scanner(file);
            //While loop to keep getting as number is unknown & print needed info
            while (true) {
                if(in.hasNext()) {
                    name = in.nextLine();
                    in.next();
                    wage = in.nextInt();
                    in.next();
                    in.next();
                    hours = in.nextInt();
                    in.nextLine();
                    addInfo = in.nextLine();
                    System.out.println(name);
                    System.out.println("Wage: " + wage);
                    System.out.println("Hours: " + hours);
                    System.out.println("Gross Pay: " + wage * hours);
                    System.out.println(addInfo);
                    count++;
                } else {
                    System.out.println("Total employees: " + count);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void IntCheck(Scanner in) {
        //Declare file
        file = new File("src/Numbers.txt");
        //Declare vars
        int counter = 0;
        int total = 0;
        int oddCnt = 0;
        int evenCnt = 0;
        try {
            //Try catch for file attach
            in = new Scanner(file);
            //While loop for checking unknown amnt of times and print needed amnt
            while (true) {
                if (in.hasNext()) {
                    in.next();
                    in.next();
                    int num = in.nextInt();
                    total+=num;
                    counter++;
                    System.out.println("Random: " + num);
                    in.nextLine();
                    if (num % 2 == 0) {
                        evenCnt++;
                    } else {
                        oddCnt++;
                    }
                } else {
                    //Print final data and exit
                    System.out.println("Amount of evens: " + evenCnt);
                    System.out.println("Amount of odds: " + oddCnt);
                    System.out.println("Average: " + total/counter);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
