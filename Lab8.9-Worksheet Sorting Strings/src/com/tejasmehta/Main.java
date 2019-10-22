/****
 * Name: Tejas Mehta
 * Date: March 21st, 2019
 * Lab Name: Lab8.9-Sorting Strings
 * Extra: Asked the user for a name to search for
 */
package com.tejasmehta;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Declare scanner and start loop
		while(true) {
			System.out.println("Enter a lab choice(1-3) or press any other key to quit");
			//Ask for choice
			String choice = in.nextLine();
			//Check the choices and perform according methodd
			switch (choice) {
				case "1":
					String[] animals = {"camel", "ant", "dog", "cat", "horse", "mule", "java", "goose"};
					//Declare array and print original and sorted versions
					System.out.println("The original array: " + Arrays.toString(animals));
					System.out.println("The Sorted array: " + Arrays.toString(AnimalSort(animals)));
					break;
				case "2":
					FriendSort(in);
					break;
				case "3":
					TermSort(in);
					break;
				default:
					System.out.println("Okay. Exiting...");
					System.exit(0);
			}
		}
    }
    //Method to sort an alphabetical array, to sort the animals one
    private static String[] AnimalSort(String[] animals) {
		int j;
		boolean flag = true;
		String temp;
		//While flag is true
		while (flag) {
			flag = false;
			for(j = 0; j < animals.length-1; j++) {
				//perform actions accordingly and sort
					if (animals[j].compareToIgnoreCase(animals[j + 1]) > 0) {
						temp = animals[j];
						animals[j] = animals[j+1];
						animals[j+1] = temp;
						flag = true;
					}

			}
		}
		return animals;
	}
	//Method to ask for the friends and sort it, then search for a name
	private static void FriendSort(Scanner in) {
    	boolean found = false;
    	String[] friends = new String[5];
    	//Declare vars and ask for friend names
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter the name of friend #" + (i+1) + ": ");
			friends[i] = in.nextLine();
		}
		//Print array
		System.out.println("Here is the array: " + Arrays.toString(friends));
		int j;
		boolean flag = true;
		String temp;
		//While flag is true
		while (flag) {
			flag = false;
			for(j = 0; j < friends.length-1; j++) {
				//Check ascending and perform actions accordingly
				if (friends[j].compareToIgnoreCase(friends[j + 1]) > 0) {
					temp = friends[j];
					friends[j] = friends[j+1];
					friends[j+1] = temp;
					flag = true;
				}

			}
		}
		//Sort and print sorted array
		System.out.println("The sorted array is: " + Arrays.toString(friends));
		System.out.println("Enter a name to search for");
		//Ask for search and perform search
		String search = in.nextLine();
		for(int i = 0; i < friends.length; i++) {
			if(friends[i].equals(search)) {
				System.out.println(search + " was found at position " + i);
				found = true;
			}
		}
		//Check if its found and print accordingly
		if (!found) {
			System.out.println("Could not find " + search + " in the array");
		}
	}
	//Method to sort the terms and search for mouse
	private static void TermSort(Scanner in) {
    	String[] terms = new String[10];
    	for (int i = 0; i < 10; i++) {
			System.out.println("Enter term #" + (i+1) + ":");
			terms[i] = in.nextLine();
		}
    	//Ask for terms and sort them
		int j;
		boolean flag = true;
		String temp;
		//While flag is true
		while (flag) {
			flag = false;
			for(j = 0; j < terms.length-1; j++) {
				//Check ascending and perform actions accordingly
				if (terms[j].compareToIgnoreCase(terms[j + 1]) > 0) {
					temp = terms[j];
					terms[j] = terms[j+1];
					terms[j+1] = temp;
					flag = true;
				}

			}
		}
		//Print sorted terms and perform binary search
		System.out.println("The terms sorted alphabetically are: " + Arrays.toString(terms));
		binarySearch("mouse", terms.length, 0, terms);

	}
	//Method for the binary search
	private static void binarySearch(String key, int upBound, int lowBound, String[] arr) {
		//Declare initial vars
		int position = (lowBound + upBound)/2;
		int compcount = 1;
		//Check that the array doesn't equal the key already and that bounds are correctly set
		while ((arr[position].equals(key)) && (lowBound <= upBound)) {
			compcount++;
			//Incemement comp and check if it's above or below and increment accordingly
			if(arr[position].compareToIgnoreCase(key) > 0) {
				upBound = position - 1;
			} else {
				lowBound = position + 1;
			}
			//Reset position
			position = (lowBound+upBound)/2;
		}
		//Check if number was found or not and print result accordingly
		if(lowBound <= upBound) {
			System.out.println(key + " was found in the array at position " + position + ". " + compcount + " comparisons were made");
		} else {
			System.out.println(key + " wasn't found in the array. " + compcount + " comparisons were made");
		}
	}
}
