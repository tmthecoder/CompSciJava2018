/****
 * Name: Tejas Mehta
 * Date: November 14, 2018
 * Lab Name: Lab4.6-Worksheet Exiting Early
 * Extra: I added a choice for the user to enter two nunbers of their choice, with 2 scanner inputs.
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    boolean running = true;
	    //Declare running bool and scanner
        Scanner in = new Scanner(System.in);
	    while (running) {
	        //Ask for choices
            System.out.println("Pick a lab choice(1-3) or press any other key to exit");
            String choice = in.nextLine();
            switch (choice) {
                //Start case 1 and print answers
                case "1":
                    System.out.println("Enter Your Name:");
                    String name = in.nextLine();
                    System.out.println("Name with no A's");
                    for (int i = 0; i < name.length(); i++) {
                        if (name.toLowerCase().charAt(i) == 'a') {
                            continue;
                        }
                        System.out.println(name.charAt(i));
                    }
                    break;
                //Start case 2 and print answers
                case "2":
                    System.out.println("Enter a word:");
                    String word = in.nextLine();
                    for (int i = 0; i < word.length(); i++) {
                        if (word.toLowerCase().charAt(i) == 'e'){
                            System.out.println("Youghee!");
                            break;
                        }
                        System.out.println(word.charAt(i));
                    }
                    break;
                //Start case 3 and print answers
                case "3":
                    System.out.println("Enter high number:");
                    int highNum = in.nextInt();
                    System.out.println("Enter low number:");
                    int lowNum = in.nextInt();
                    while (lowNum <= highNum) {
                        System.out.println(highNum);
                        highNum--;
                    }
                    break;
            }
        }
    }
}
