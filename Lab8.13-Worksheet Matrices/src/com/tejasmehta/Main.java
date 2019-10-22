/****
 * Name: Tejas Mehta
 * Date: April 8th, 2019
 * Lab Name: Lab8.13-Worksheet Matrices
 * Extra: Asked the user for the array input
 */
package com.tejasmehta;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare vars and get vals
	    int[][] magicSquare = GetMagicNums(4);
	    PrintSquare(magicSquare);
	    System.out.print("Your square " + CheckMagicSquare(magicSquare));
    }
    //Method to ask user entry for the square
    private static int[][] GetMagicNums(int bound) {
        Scanner in = new Scanner(System.in);
        int[][] nums = new int[bound][bound];
        for(int i = 0; i < bound; i++) {
           for(int j = 0; j < bound; j++) {
               System.out.println("Enter number for row " + (i + 1) + ", column " + (j + 1) + ":");
               nums[i][j] = in.nextInt();
           }
        }
        return nums;
    }
    //Method to show them the square
    private static void PrintSquare(int[][] square) {
        System.out.println("Your magic square is: ");
        for (int[] ints : square) {
            System.out.println(Arrays.toString(ints));
        }
    }
    //Method to check the different parts of the square
    private static String CheckMagicSquare(int[][] square) {
        String msg = "";
        int constantNum = 0;
        boolean keepCheck = true;
        //Declare base vars and check for row constant
        for(int i = 0; i < square.length; i++) {
            int countRow = 0;
            //Check each row and count, if not set message false
            for(int j = 0; j <square.length; j++) {
                countRow+=square[i][j];
            }
            if (i == 0) {
                constantNum = countRow;
            } else {
                if (countRow == constantNum) {
                    keepCheck = true;
                } else {
                    msg = "is not a magic square";
                    keepCheck = false;
                    break;
                }
            }
        }
        if (keepCheck) {
            for (int i = 0; i < square.length; i++) {
                int countColumn = 0;
                //Check each row and count, if not set message false
                for (int j = 0; j < square.length; j++) {
                    countColumn += square[j][i];
                }
                if (countColumn == constantNum) {
                    keepCheck = true;
                } else {
                    msg = "is not a magic square";
                    keepCheck = false;
                    break;
                }
            }
        }
        if (keepCheck) {
            for (int i = 0; i < square.length; i++) {
                int countDiag = 0;
                //Check each diag and count, if not set message false
                for (int j = 0; j < square.length; j++) {
                    if (i == j) {
                        countDiag += square[j][i];
                    }
                }
                if (countDiag == constantNum) {
                    keepCheck = true;
                    msg = "is a magic square";
                } else {
                    msg = "is not a magic square";
                    keepCheck = false;
                    break;
                }
            }
        }
        return msg;
    }
}
