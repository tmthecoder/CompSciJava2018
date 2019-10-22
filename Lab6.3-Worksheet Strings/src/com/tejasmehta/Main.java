/****
 *Name: Tejas Mehta
 * Date: February 9, 2019
 * Lab Name: Lab6.3-Worksheet Strings
 * Extra: Made the password like a guessing game, giving them 3 chances to guess it
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declare loop and scanner
        while (true) {
            System.out.println("Enter a choice of labs(1-10) or press any other key to quit");
            //Ask for choice
            String choice = in.nextLine();
            //Get their answer and go to the appropriate method, or quit due to other keypress
            switch (choice) {
                case "1":
                    nameGuess(in);
                    break;
                case "2":
                    movieTitles(in);
                    break;
                case "3":
                    alphabetizer(in);
                    break;
                case "4":
                    aolSign(in);
                    break;
                case "5":
                    printName(in);
                    break;
                case "6":
                    cityPrint(in);
                    break;
                case "7":
                    sentenceCount(in);
                    break;
                case "8":
                    searchSpace();
                    break;
                case "9":
                    numPrint();
                    break;
                case "10":
                    nameFormat();
                    break;
                default:
                    System.out.print("Exiting....");
                    System.exit(0);
            }
        }
    }
    //Ask them to guess the password as a mini guessing game
    private static void nameGuess(Scanner in) {
        System.out.println("Try to guess the password(You get 3 chances)!");
        String pass = "Password";
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter your guess(chance " + i + ")!");
            String guess = in.nextLine();
            if (guess.equals(pass)) {
                System.out.println("You guessed it!");
                break;
            } else {
                if (i == 2) {
                    System.out.println("You didn't guess it!");
                } else {
                    System.out.println("Sorry, wrong guess");
                }
            }
        }
    }
    //Get movie titles and check which is longer, and handle it
    private static void movieTitles(Scanner in) {
        System.out.println("Enter a movie title:");
        String title1 = in.nextLine();
        System.out.println("Enter another movie title");
        String title2 = in.nextLine();
        if (title1.length() > title2.length()) {
            System.out.println(title1 + " is a longer title");
        } else if (title2.length() > title1.length()) {
            System.out.println(title2 + " is a longer title");
        } else {
            System.out.println("Both have the same length");
        }
    }
    //Get 2 words and put them in alphabetical order
    private static void alphabetizer(Scanner in) {
        System.out.println("Enter a word");
        String word1 = in.nextLine();
        System.out.println("Enter another word.");
        String word2 = in.nextLine();
        if (word1.compareToIgnoreCase(word2) == 0) {
            System.out.println("Alphabetical Order: " + word2 + ", " + word1);
        } else if (word1.compareToIgnoreCase(word2) == 1) {
            System.out.println("Alphabetical Order: " + word1 + ", " + word2);
        } else {
            System.out.println("Both are the same word!");
        }
    }
    //Get their entry of an id and check if it passes conditions and make it as such
    private static void aolSign(Scanner in) {
        System.out.println("Enter your aol ID (no spaces)");
        String id = in.nextLine();
        if (id.contains(" ")) {
            System.out.println("Please enter a valid id next time(no spaces)");
        } else {
            System.out.println("Your id is: " + id + "@aol.com");
        }
    }
    //Do name print in uppercase and theirs in lowercase
    private static void printName(Scanner in) {
        String person = "Charlie Brown";
        System.out.println(person.toUpperCase());
        System.out.println("Now enter your name");
        person = in.nextLine();
        System.out.println(person.toLowerCase());
    }
    //Get the ciry name and print it in reverse-case
    private static void cityPrint(Scanner in) {
        System.out.println("Enter the name of a city");
        String city = in.nextLine();
        System.out.println("The city reverse-case is:");
        for(int i = 0; i < city.length(); i++) {
            if (String.valueOf(city.charAt(i)).equals(String.valueOf(city.charAt(i)).toUpperCase())) {
                System.out.print(String.valueOf(city.charAt(i)).toLowerCase());
            } else {
                System.out.print(String.valueOf(city.charAt(i)).toUpperCase());
            }
        }
        System.out.println();
    }
    //Get a sentence and print all lowercase letters
    private static void sentenceCount(Scanner in) {
        System.out.println("Enter a sentence:");
        String sentence = in.nextLine();
        int countLower = 0;
        for(int i = 0; i < sentence.length(); i++) {
            if (String.valueOf(sentence.charAt(i)).equals(String.valueOf(sentence.charAt(i)).toLowerCase())) {
                countLower++;
                System.out.print(sentence.charAt(i));
            }
        }
        System.out.print("\nThose were the " + countLower + " lowercase letters in the sentence.\n");
    }
    //Search for a space and print the substring
    private static void searchSpace() {
        String detecttive = "Sherlock Homes";
        int charSpace = detecttive.indexOf(" ");
        System.out.println("The last name is:" + detecttive.substring(charSpace));
    }
    //Search for the 1st number and get the rest and multiply and print
    private static void numPrint() {
        String address = "West 103rd Street";
        int index = address.indexOf("1");
        int addrNum = Integer.parseInt(address.substring(index, index+2));
        System.out.println("The number x 12 is: " + (addrNum * 12));
    }
    //Get the name and format it as needed
    private static void nameFormat() {
        String name = "Ford, Harrison";
        int index = name.indexOf(",");
        System.out.println("The name is" + name.substring(index) + " " + name.substring(0, index));
    }
}
