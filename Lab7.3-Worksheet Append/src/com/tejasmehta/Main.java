/****
 * Name: Tejas Mehta
 * Date: February 27, 2019
 * Lab Name: Lab7.3-Worksheet Append
 * Extra: Asked them to enter a dog name in part 3 instead of using 3 presets
 */
package com.tejasmehta;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static File file;
    //Declare Booleans
    public static void main(String[] args) {
        //Start loop
        while (true) {
            Scanner in = new Scanner(System.in);
            //Declare Scanner and ask choice
            System.out.println("Enter a lab part(1-4) or press any key to quit");
            String choice = in.nextLine();
            //Ask for choice and do according function
            switch (choice) {
                case "1":
                    writeName();
                    break;
                case "2":
                    readCheck(in);
                    break;
                case "3":
                    appendFile(in);
                    break;
                case "4":
                    namePrint(in);
                    break;
                default:
                    //Exit
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
    //Write all names to file manually
    private static void writeName() {
        file = new File("src/Dog.txt");
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("Wally 10");
            pw.println("Jessie 9");
            pw.println("Skeeter 15");
            pw.println("Lucky 7");
            pw.println("Corky 5");
            pw.println("Sadie 6");
            pw.println("Alexis 1");
            pw.close();
            System.out.println("All dogs names written");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    //Read file using a loop and print old/young
    private static void readCheck(Scanner in) {
        file = new File("src/Dog.txt");
        try {
            in = new Scanner(file);
            while (true) {
                if (in.hasNext()) {
                    System.out.print(in.next());
                    int age = in.nextInt();
                    if (age >= 7) {
                        System.out.print(": Old Dog\n");
                    } else {
                        System.out.print(": Young Dog\n");
                    }
                    in.nextLine();
                } else {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    //Ask for append and append file accordingly
    private static void appendFile(Scanner in) {
        try {
            FileWriter fw = new FileWriter("src/Dog.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println();
            while (true) {
                System.out.print("Would you like to add a dog to the list?");
                String choice = in.nextLine();
                if (choice.toLowerCase().equals("y") || choice.toLowerCase().equals("yes")) {
                    System.out.println("Enter the dog's name and age, separated by a space");
                    //Append
                    pw.println(in.nextLine());
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Print all names, no ages of dogs
    private static void namePrint(Scanner in) {
        File file = new File("src/Dog.txt");
        try {
            in = new Scanner(file);
            while (true) {
                if (in.hasNext()) {
                    System.out.println(in.next());
                    in.next();
                } else {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
