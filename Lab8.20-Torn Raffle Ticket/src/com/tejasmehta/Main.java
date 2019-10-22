/****
 * Name: Tejas Mehta
 * Date: April 12, 2019
 * Lab Name: Lab8.20-Torn Raffle Ticket
 * Extra: Added the option to pick multiple winners
 */
package com.tejasmehta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	//Declare init vars and get all arrays
    	int[] firstNums = GetNumArray(new File("src/firstnum.txt"), in);
    	int[] lastNums = GetNumArray(new File("src/lastnum.txt"), in);
    	String[] firstNames = GetStringArray(new File("src/firstname.txt"), in);
		String[] lastNames = GetStringArray(new File("src/lastname.txt"), in);
		//Sort first name set
		int j;
		//Declare looper & flag
		boolean flag = true;
		//Declare all tempVars
		int numTmp;
		String temp;
		//Loop and sort by name
		while (flag) {
			flag = false;
			for (j = 0; j < firstNums.length - 1; j++) {
				//Check ascending and perform actions accordingly
				if (firstNums[j] > (firstNums[j + 1])) {
					//All swap code for each array parallel
					temp = firstNames[j];
					numTmp = firstNums[j];
					firstNames[j] = firstNames[j + 1];
					firstNums[j] = firstNums[j+1];
					firstNames[j + 1] = temp;
					firstNums[j+1] = numTmp;
					flag = true;
				}
			}
		}
		//Sort last names
		int i;
		//Declare looper & flag
		boolean flag2 = true;
		//Declare all tempVars
		int numTmp2;
		String temp2;
		//Loop and sort by name
		while (flag) {
			flag2 = false;
			for (i = 0; i < lastNums.length - 1; i++) {
				//Check ascending and perform actions accordingly
				if (lastNums[i] > (lastNums[i + 1])) {
					//All swap code for each array parallel
					temp2 = lastNames[i];
					numTmp2 = lastNums[i];
					lastNames[i] = lastNames[i + 1];
					lastNums[i] = lastNums[i+1];
					lastNames[i + 1] = temp2;
					lastNums[i+1] = numTmp2;
					flag2 = true;
				}
			}
		}
		//Print sorted and get the winners
		PrintSorted(firstNums, firstNames, lastNames);
		GetWinners(firstNums, firstNames, lastNames, in);

	}
	//Get a number array from file
    private static int[] GetNumArray(File file, Scanner in) {
    	int[] nums;
    	int count = 0;
    	//Attach to file
		try {
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//Get init count
		while (in.hasNextInt()) {
			count++;
			in.nextInt();
		}
		nums = new int[count];
		//Reattach
		try {
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//Add each to array
		for(int i = 0; i < nums.length; i++) {
			nums[i] = in.nextInt();
		}
		return nums;
	}
	//Get string array from file
	private static String[] GetStringArray(File file, Scanner in) {
		String[] names;
		int count = 0;
		//Attach to file
		try {
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//Get count
		while (in.hasNext()) {
			count++;
			in.next();
		}
		//Init array and reattach
		names = new String[count];
		try {
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//Add vals to array
		for(int i = 0; i < names.length; i++) {
			names[i] = in.next();
		}
		return names;
	}
	//Print sorted array
	private static void PrintSorted(int[] nums, String[] first, String[] last) {
    	for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + "\t" + first[i] + "\t" + last[i]);
		}
	}
	//Get winner
	private static void GetWinners(int[] nums, String[] first, String[] last, Scanner in) {
		System.out.println("How many winners to pick?");
		int winCnt = in.nextInt();
		//Loop through nums and check aaccordingly
		for(int i = 0; i < winCnt; i++) {
			System.out.println("Enter winner #" + (i+1));
			int winNum = in.nextInt();
			for(int j = 0; j < nums.length;j++) {
				boolean winner = false;
				if(nums[j] == winNum) {
					System.out.println("A winner is: " + first[j] + " " + last[j]);
					winner = true;
				}
				if (j == nums.length - 1 && !winner) {
					System.out.println("No winner of that number");
				}
			}
		}
	}
}
