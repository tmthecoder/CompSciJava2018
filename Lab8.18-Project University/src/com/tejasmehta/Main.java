/****
 * Name: Tejas Mehta
 * Date: April 10th, 2019
 * Lab Name: Lab8.18-Project University
 * Extra: Asked for a minimum graduating GPA & minimum hours
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declare scanner & arrays
	    int[] ids = {123456, 124563, 134522, 143266, 145667, 187622, 164522};
	    String[] names = {"Smith, Kevin", "Jone, Sarah", "Kelly,Jonathan", "Clift, Edward", "Ogden, Beatrice", "Walter, Benjamin", "Edwards, Steven"};
	    int[] hours = {144, 134, 130, 146, 133, 120, 124};
	    double[] gpa = {3.0, 2.5, 3.5, 1.5, 4.0, 3.0, 1.8};
	    //Ask for minimum counts
        System.out.println("Enter the minimum GPA");
        double gpaMin = in.nextDouble();
        System.out.println("Enter the minimum hour count");
        int hoursMin = in.nextInt();
        int j;
        //Declare looper & flag
        boolean flag = true;
        //Declare all tempVars
        int idTmp;
        String temp;
        int hoursTmp;
        double gpaTmp;
        //Loop and sort by name
        while (flag) {
            flag = false;
            for (j = 0; j < names.length - 1; j++) {
                //Check ascending and perform actions accordingly
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                    //All swap code for each array parallel
                    temp = names[j];
                    idTmp = ids[j];
                    hoursTmp = hours[j];
                    gpaTmp = gpa[j];
                    names[j] = names[j + 1];
                    ids[j] = ids[j + 1];
                    hours[j] = hours[j + 1];
                    gpa[j] = gpa[j + 1];
                    names[j + 1] = temp;
                    ids[j + 1] = idTmp;
                    hours[j + 1] = hoursTmp;
                    gpa[j + 1] = gpaTmp;
                    flag = true;
                }
            }
        }
        //Call function to check all students
        CheckStudents(ids, names, hours, gpa, hoursMin, gpaMin);
    }
    //Function to check all students
    private static void CheckStudents(int[] ids, String[] names, int[] hours, double[] gpas, int minHours, double minGpa) {
        for(int i = 0; i < ids.length; i++) {
            //Check which they fall under and print accordingly
            if (gpas[i] >= minGpa && hours[i] >= minHours) {
                System.out.println(ids[i] + "\t" + names[i] + "\t" + "OK to graduate");
            } else if (gpas[i] >= minGpa && hours[i] < minHours) {
                System.out.println(ids[i] + "\t" + names[i] + "\t" + "Not enough credit hours");
            } else if (gpas[i] < minGpa && hours[i] > minHours) {
                System.out.println(ids[i] + "\t" + names[i] + "\t" + "GPA is too low");
            } else {
                System.out.println(ids[i] + "\t" + names[i] + "\t" + "GPA and Hours are too low");
            }
        }
    }
}
