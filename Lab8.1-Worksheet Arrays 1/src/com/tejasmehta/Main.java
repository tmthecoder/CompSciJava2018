/****
 * Name: Tejas Mehta
 * Date: March 13, 2019
 * Lab Name: Lab8.1-Worksheet Arrays 1
 * Extra: Asked the user how many numbers should be in the random array
 */
package com.tejasmehta;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declare scanner and start loop
	    while (true) {
            System.out.println("Enter the lab part(1-3) or any other key to quit");
            //Ask for part
            String choice = in.nextLine();
            //check their choice and perform the respective function
            switch (choice) {
                case "1":
                    System.out.println("The grade average is " + GradeAvg());
                    break;
                case "2":
                    RandArray(in);
                    break;
                case "3":
                    System.out.print(ArrAges(in) + " people are above the age of 15");
                    break;
                default:
                    //Exit due to entry
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
    //Function to calculate the gradeAvg
    private static double GradeAvg() {
        //declare double array and loop through for avg
        double[] finalGrade = {85.8, 93.7, 76, 88.5, 100, 91.3};
        double total = 0;
        for (double v : finalGrade) {
            total += v;
        }
        //Return rounded avg
        return Math.round(total/finalGrade.length);
    }
    //Function for random array
    private static void RandArray(Scanner in) {
        //Ask for amount of numbers in array
        System.out.println("How many random numbers should I make?");
        int randAmnt = in.nextInt();
        int[] randomArray = new int[randAmnt];
        //Create the array and initialize random
        Random random = new Random();
        int evenCnt = 0;
        System.out.print("Array: ");
        //Loop through to get count of even and add randoms to array
        for(int i = 0; i < 10; i++) {
            randomArray[i] = random.nextInt(10);
            System.out.print(randomArray[i] + " ");
            if (randomArray[i] % 2 == 0) {
                evenCnt++;
            }
        }
        System.out.print("\n");
        //Print arrays backwards
        for(int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[randomArray.length - (i + 1)] + " ");
        }
        System.out.println("\nEven Number count: " + evenCnt);
        in.nextLine();
    }
    //Function for ages
    private static int ArrAges(Scanner in) {
        int[] ages = new int[20];
        //Declare arrays and count
        int count = 0;
        //Get the age and check if it's above 15
        for(int i = 0; i < ages.length; i++) {
            System.out.println("Enter age # " + (i + 1) + ":");
            ages[i] = in.nextInt();
            if (ages[i] > 15) {
                count++;
            }
        }
        //Return count
        return count;
    }
}
