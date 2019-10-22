/****
 * Name: Tejas Mehta
 * Date: March 29th, 2019
 * Lab Name: Lab8.12-Worksheet Banners
 * Extra: Printed the banner names for #2 in a random order & allowed the user to pick from the 2 names for #3
 */
package com.tejasmehta;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Start loop and declare vars
        while (true) {
            System.out.println("Pick a lab part(1-3) or press any other key to quit");
            //Ask choice
            String choice = in.nextLine();
            switch (choice) {
                //Check choice and call method
                case "1":
                    try {
                        RandomBannerPrint();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case "2":
                    //Ask for name and call method
                    System.out.println("Enter 1 for Keanu Reeves or 2 for Carrie-Ann Moss");
                    String name = "";
                    int num = in.nextInt();
                    in.nextLine();
                    if (num == 1) {
                        name = "Keanu Reeves";
                    } else {
                        name = "Carrie-Ann Moss";
                    }
                    System.out.println((NameOrder(name)));
                    break;
                case "3":
                    //Print reloaded script
                    MatrixReloaded();
                    break;
                default:
                    //Exit
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
    //Print banner randomly
    private static void RandomBannerPrint() throws InterruptedException {
        String[] banners = {"The Matrix has you.", "Follow the white rabbit.", "Knock, knock, Neo."};
        //Get random number sequence
        int[] sequencePrint = new int[banners.length];
        Random random = new Random();
        sequencePrint[0] = random.nextInt(3);
        if(sequencePrint[0] == 2) {
            int nextS = random.nextInt(2);
            if (nextS == 0) {
                sequencePrint[1] = 0;
            } else {
                sequencePrint[1] = 1;
            }
        } else if (sequencePrint[0] == 1) {
            int nextS = random.nextInt(2);
            if (nextS == 0) {
                sequencePrint[1] = 0;
            } else {
                sequencePrint[1] = 2;
            }
        } else {
            int nextS = random.nextInt(2);
            if (nextS == 0) {
                sequencePrint[1] = 1;
            } else {
                sequencePrint[1] = 2;
            }
        }
        //Print with wait
        for(int i = 0; i < banners.length; i++) {
            for(int j = 0; j < banners[sequencePrint[i]].length(); j++) {
                System.out.print(banners[sequencePrint[i]].charAt(j));
            }
            System.out.print("\n");
            Thread.sleep(1000);
        }
    }
    //Method to order names
    private static String NameOrder(String name){
        //Get name, and get the index of space and order
        String nameOrdered = "";
        int spaceChar = name.indexOf(" ");
        String first = name.substring(0, spaceChar);
        String last = name.substring(spaceChar);
        nameOrdered = last + ", " + first;
        return nameOrdered;
    }
    //Method to reloaded part
    private static void MatrixReloaded() {
        String print = "Matrix Reloaded";
        //Print banner
        for(int i = 0; i < print.length(); i++) {
            System.out.print(print.charAt(i));
        }
        System.out.print("\n");
        //Get names, print, sort, and print again
        String[] names = {"Neo", "Morpheus", "Trinity", "Smith", "Mouse",  "Cypher"};
        System.out.println("The names are: " + Arrays.toString(names));
        AlphabetSort(names);

    }
    //Method to alphabet bubble sort
    private static void AlphabetSort(String[] arr) {
        int j;
        boolean flag = true;
        String temp;
        //While flag is true
        while (flag) {
            flag = false;
            for(j = 0; j < arr.length-1; j++) {
                //Check ascending and perform actions accordingly
                    if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        flag = true;
                    }

            }
        }
        System.out.println("The sorted array is: " + Arrays.toString(arr));
    }
}
