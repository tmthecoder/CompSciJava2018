// DiceMain.java
package com.tejasmehta;

import java.util.Arrays;
/****
 * Name: Tejas Mehta
 * Date: May 15th, 2019
 * Lab Name: LabOOP1-DiceFun
 * Extra: Added teh double count function to the final output
 */

public class DiceMain {
	public static void main(String[] args) {
		Dice d = new Dice(6);
		Dice d2 = new Dice(6);
		//Declare initial objects
		Checker check = new Checker();
		//Declare initial vars
		int sum;

		int doubleCnt = 0;
		int[] numbers = {0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0};
		//Loop through 10,000 times and add to array of nums and check double
		for (int i = 0; i < 10000; i++) {
			int r1 = d.roll();
			int r2 = d2.roll();
			sum = r1+r2;
			numbers[sum-2]++;
			if (check.doubleCheck(r1, r2)) {
				doubleCnt++;
			}
		}
		//Loop through array and print output
		for(int i = 0; i < numbers.length; i++) {
			System.out.println((i+2) + " occurred: " + numbers[i] + " times");
		}
		//Print double count
		System.out.println("Double Count: " + doubleCnt);
	}
}