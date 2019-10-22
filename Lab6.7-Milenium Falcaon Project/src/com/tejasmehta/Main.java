/****
 * Name: Tejas Mehta
 * Date: February 19, 2019
 * Lab Name: Lab6.7-Millennium Falcon Project
 * Extra: Added Obi-Wan as a Character(needs a percentage of 15)
 */
package com.tejasmehta;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static boolean go = false;
    //Declare needed class-vars
    private static boolean secondChk = false;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Deckare needed main vars
        Random random = new Random();
        intro();
        //Call intro function
        System.out.println("\nEnter m to Launch the Falcon");
        //Initiate launch
        String ans = in.nextLine();

        if (ans.toLowerCase().equals("m")) {
            //Get start time
            long start = System.currentTimeMillis();
            int launchCount = 1;
            //Print names
            System.out.println("       R2D2     C3P0     Han Solo     Luke Skywalker     Chewbacca     Princess Leia     Obi Wan");
            while (true) {
                //Recursively call functions until the final var is true
                System.out.println("Run " + launchCount +": "+ R2D2(random) + "    " + C3PO(random) + "     " + HanSolo(random) + "       " + LukeSkywalker(random) + "              " + Chewbacca(random) + "         " + Leia(random) + "             " + Obi(random));
                if (go) {
                    //Break
                    break;
                } else {
                    //Add if false and start again
                    launchCount++;
                }
            }
            long elapsed = (System.currentTimeMillis() - start) / 1000;
            System.out.println("We are GO FOR LAUNCH!");
            System.out.println("It took " + elapsed + " seconds");
        }
	// write your code here
    }
    //Intro function(print stars and name
    private static void intro() {
        for(int i = 0; i < 25; i++) {
            System.out.print("*");
        }
        System.out.println("\n   Millenium Falcon Launch Simulation\n   By: Tejme Shrox");
        for(int i = 0; i < 25; i++) {
            System.out.print("*");
        }
    }
    //Function for R2D2, compare random to 40 and change vars accordingly
    private static String R2D2(Random random) {
        int ready = random.nextInt(100);
        if (ready >= 40) {
            go = true;
            secondChk = true;
            return "Go   ";
        } else {
            go = false;
            secondChk = false;
            return "No Go";
        }
    }
    //Function for C3P0, compare random to 50 and change vars accordingly
    private static String C3PO(Random random) {
        int ready = random.nextInt(100);
        if (ready >= 50) {
            if (secondChk) {
                go = true;
                secondChk = true;
            }
            return "Go   ";
        } else {
            go = false;
            secondChk = false;
            return "No Go";
        }
    }
    //Function for Han Solo, compare random to 30 and change vars accordingly
    private static String HanSolo(Random random) {
        int ready = random.nextInt(100);
        if (ready >= 30) {
            if (secondChk) {
                go = true;
                secondChk = true;
            }
            return "Go   ";
        } else {
            go = false;
            secondChk = false;
            return "No Go";
        }
    }
    //Function for Luke Skywalker, compare random to 20 and change vars accordingly
    private static String LukeSkywalker(Random random) {
        int ready = random.nextInt(100);
        if (ready >= 20) {
            if (secondChk) {
                go = true;
                secondChk = true;
            }
            return "Go   ";
        } else {
            go = false;
            secondChk = false;
            return "No Go";
        }
    }
    //Function for Chewbacca, compare random to 35 and change vars accordingly
    private static String Chewbacca(Random random) {
        int ready = random.nextInt(100);
        if (ready >= 35) {
            if (secondChk) {
                go = true;
                secondChk = true;
            }
            return "Go   ";
        } else {
            go = false;
            secondChk = false;
            return "No Go";
        }
    }
    //Function for Princess Leia, compare random to 45 and change vars accordingly
    private static String Leia(Random random) {
        int ready = random.nextInt(100);
        if (ready >= 45) {
            if (secondChk) {
                go = true;
                secondChk = true;
            }
            return "Go   ";
        } else {
            go = false;
            secondChk = false;
            return "No Go";
        }
    }
    //Function for Obi Wan, compare random to 15 and change vars accordingly
    private static String Obi(Random random) {
        int ready = random.nextInt(100);
        if (ready >= 15) {
            if (secondChk) {
                go = true;
                secondChk = true;
            }
            return "Go   ";
        } else {
            go = false;
            secondChk = false;
            return "No Go";
        }
    }
}
