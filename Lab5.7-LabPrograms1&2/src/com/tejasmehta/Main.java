/****
 * Name: Tejas Mehta
 * Date: January 4th, 2019
 * Lab Name: Lab5.7-LabPrograms1&2
 * Extra: Added the choice for the user to enter classes and calculate their average
 */
package com.tejasmehta;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        //declare scanner and start loop
        while (true) {
            System.out.println("Pick which part you would like to test(1-3) or press any other key to quit");
            //Ask for choice and start switch
            String choice = in.nextLine();
            switch (choice) {
                case "1":
                    //First choice, invoke said methods and print last statement
                    blindMice1();
                    blindMice1();
                    blindMice2();
                    blindMice2();
                    System.out.println("They all run after the farmer's wife.");
                    break;
                case "2":
                    //Print dollars and name, addr, and val and dollar
                    printDollar();
                    printDollar();
                    nameAddr();
                    printDollar();
                    printDollar();
                    printDollar();
                    break;
                case "3":
                    //Ask for average
                    System.out.println("Do you know your mid-year average(y/N)?");
                    String avgKnow = in.nextLine();
                    //Call specific method on their entry of knowledge
                    if (avgKnow.toLowerCase().equals("y") || avgKnow.toLowerCase().equals("yes")) {
                        System.out.println(avgCalc(true, in));
                    } else if (avgKnow.toLowerCase().equals("n") || avgKnow.toLowerCase().equals("no")) {
                        System.out.println(avgCalc(false, in));
                    } else {
                        System.out.println("Invalid input, exiting...");
                        System.exit(0);
                    }
                    break;
                default:
                    //Exit as default entry
                    System.out.println("Exiting...");
                    System.exit(0);

            }
        }
    }
    //Print first blind mice statement
    public static void blindMice1() {
        System.out.println("Three blind mice");
    }
    //Print second bline mice statement
    public static void blindMice2() {
        System.out.println("See how they run");
    }
    //Print 30 dollar signs with a for loop
    public static void printDollar() {
        for (int i = 0; i < 30; i++){
            System.out.print("$");
        }
        System.out.print("\n");
    }
    //Print name, addr
    public static void nameAddr() {
        System.out.println("Name: Tejas Mehta");
        System.out.println("Address: 41 Rivendell Rd");
        System.out.println("City, State, Zip: Succasunna Nj, 07876");
    }
    //Average calc
    public static String avgCalc(boolean knows, Scanner in) {
        //Check if they know
        if(knows) {
            //Ask for average
            System.out.println("Enter your average");
            double avg = in.nextDouble();
            //Check average value and return accordingly
            if (avg > 65) {
                return "Good Job!";
            } else {
                return "Hook up with a smart classmate and STUDY!";
            }

        } else {
            System.out.println("Enter the amount of classes you are in");
            //Ask for amnt of classes
            int classesNum = in.nextInt();
            ArrayList<BigDecimal> grades = new ArrayList<>();
            //ArrayList for grades
            for (int i = 0; i < classesNum; i++) {
                //Ask for grades for each class up till number they said
                System.out.println("Enter the grade for class " + (i + 1));
                //Add it to ArrayList
                grades.add(BigDecimal.valueOf(in.nextDouble()));
            }
            //set total to 0
            BigDecimal total = BigDecimal.ZERO;
            //for loop to get all grades in arrayList and add them to total
            for (int i = 0; i < grades.size(); i++) {
                total.add(grades.get(i));
            }
            //Return respective value based on grades

            if (total.compareTo(BigDecimal.valueOf(65)) == -1) {
                return "Hook up with a smart classmate and STUDY!";
            } else {
                return "Good Job!";
            }
        }
    }
}
