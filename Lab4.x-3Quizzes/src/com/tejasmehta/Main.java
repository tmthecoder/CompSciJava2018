/****
 * Name: Tejas Mehta
 * Lab Name: Lab4.x-3Quizzes
 * Date: November 30, 2018
 * Extra: None needed(Quiz)
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean running = true;
        //Declare running var and scanner
        Scanner in = new Scanner(System.in);
        while (running) {
            System.out.println("Pick a choice(1-5) of a lab:");
            String choice = in.nextLine();
            //Switch to see which was picked
            switch (choice) {
                //Case 1, print java rules
                case "1":
                    for(int i = 0; i < 10; i++){
                        System.out.println("Java Rules!");
                    }
                    break;
                //case 2, print all numbers
                case "2":
                    for(int i = 100; i > 0; i--){
                        System.out.println(i);
                    }
                    break;
                //case 3, print happy holidays
                case "3":
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Happy Holidays!");
                    }
                    break;
                //case 4, print between 10 and 15
                case "4":
                    for (int i = 10; i <= 15; i++) {
                        System.out.println(i);
                    }
                    break;
                //case 5, print even from 50-70
                case "5":
                    for (int i = 50; i <= 70; i+=2) {
                        System.out.println(i);
                    }
                    break;
                //exit due to invalid entry
                default:
                    System.exit(0);
            }
        }
    }
}
