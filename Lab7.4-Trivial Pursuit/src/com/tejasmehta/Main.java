/****
 * Name: Tejas Mehta
 * Date: March 5th, 2019
 * Lab Name: Lab 7.4-Trivial Pursuit
 * Extra: Added an extra question, making it 6 questions
 */
package com.tejasmehta;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare initial file and loop
        File userAns = new File("src/userans.txt");
        while (true) {
            Scanner in = new Scanner(System.in);
            //Start scanner and ask pref
            System.out.println("Do you want to take the Star Wars Quiz(press 1) or get yours graded(press 2), or quit(Any other key)?");
            String choice = in.nextLine();
            //Switch to see what they want to do or exit
            switch (choice) {
                case "1":
                    triviaAsk(in, userAns);
                    break;
                case "2":
                    grade(userAns, in);
                    break;
                default:
                    //exit
                    System.out.println("Exiting....");
                    System.exit(0);
            }
        }
    }
    //Trivia function
    private static void triviaAsk(Scanner in, File file) {
        try {
            //Declare printwriter attachment
            PrintWriter pw = new PrintWriter(file);
            //While loop because of unknown users
            while (true) {
                //Ask for all entries/questions and write their answer to file
                System.out.println("Enter your name");
                pw.println(in.nextLine());
                System.out.println("Here is question 1: How many star wars episodes(not including spinoffs) are currently made?\na. 6\nb. 7\nc. 8\nd. 9");
                pw.println(in.nextLine());
                System.out.println("Here is question 2: In which episode does Luke realize Vader is his father?\na. 4\nb. 5\nc. 6\nd. 7");
                pw.println(in.nextLine());
                System.out.println("Here is question 3: In which episode do we see Obi-Wan die?\na. 4\nb. 5\nc. 6\nd. 7");
                pw.println(in.nextLine());
                System.out.println("Here is question 4: What episode was first in theatres?\na. 1\nb. 3\nc. 4\nd. 6");
                pw.println(in.nextLine());
                System.out.println("Here is question 5: Which character is killed by Obi-Wan?\na. Count Dooku\nb. Darth Vader\nc. Emperor Palpatine\nd. Darth Maul");
                pw.println(in.nextLine());
                System.out.println("Here is question 6: Who does Anakin kill in episode 3?\na. Count Dooku\nb. Darth Vader\nc. Emperor Palpatine\nd. Darth Maul");
                pw.println(in.nextLine());
                System.out.println("You're done with the trivia! Does another person want to take the quiz?");
                String choice = in.nextLine();
                //Ask if they want to continue and act accordingly
                if (choice.toLowerCase().equals("y") || choice.toLowerCase().equals("yes")) {
                    System.out.println("Okay, restarting now!");
                } else if (choice.toLowerCase().equals("n") || choice.toLowerCase().equals("no")){
                    System.out.println("Okay, exiting now!");
                    pw.close();
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    private static void grade(File file, Scanner in) {
        try {
            //Attack scanner to file & check for next exists
            in = new Scanner(file);
            while (in.hasNext()) {
                //Read name and loop through answers, comparing to key
                String name = in.nextLine();
                String answerkey = "cbacda";
                int correct = 0;
                for(int i = 0; i < 6; i++) {
                    char comp = in.nextLine().charAt(0);
                    if (comp == answerkey.charAt(i)) {
                        correct++;
                    }
                }
                //Print out correct
                System.out.println(name + ": " + correct + "/6");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
