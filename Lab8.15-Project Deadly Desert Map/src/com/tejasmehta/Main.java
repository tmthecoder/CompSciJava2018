/****
 * Name: Tejas Mehta
 * Date: April 8th, 2019
 * Lab Name: Lab8.15-Project Deadly Desert Map
 * Extra: Had the user enter a custom hotspot value to check for
 */
package com.tejasmehta;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare initial map and scanner
        Scanner in = new Scanner(System.in);
        int[][] map = {
                {5, 1, 3, 1, 2, 4, 2, 1},
                {2, 4, 0, 3, 1, 4, 3, 2},
                {6, 1, 5, 2, 1, 5, 4, 1},
                {2, 3, 4, 1, 2, 2, 1, 0},
                {4, 1, 4, 2, 6, 4, 2, 3},
                {1, 3, 3, 3, 4, 1, 5, 2},
        };
        //Ask for high number
        System.out.println("Enter your hotspot number:" );
        int hotspotNum = in.nextInt();
        //Make plotted
        String[][] plotted = MapPlotter(map, hotspotNum);
        //Print it
        PrintPlot(plotted);
    }
    //Function to plot the map and hotspots
    private static String[][] MapPlotter(int[][] map, int hotspot) {
        String[][] plotted = new String[6][8];
        //Make the string map
        System.out.println("Original Map:");
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 8; j++) {
                plotted[i][j] = String.valueOf(map[i][j]);
            }
            System.out.println(Arrays.toString(plotted[i]));
        }
        //Loop through each number, excluding top and end rows/columns, checking constantly
        for(int i = 1; i < 5; i++) {
            for(int j = 1; j < 7; j++) {
                int count = 0;
                count+=map[i][j];
                count+=map[i+1][j];
                count+=map[i-1][j];
                count+=map[i][j+1];
                count+=map[i][j-1];
                if (count > hotspot) {
                    plotted[i][j] = "D";
//                    plotted[i+1][j] = "D";
//                    plotted[i-1][j] = "D";
//                    plotted[i][j+1] = "D";
//                    plotted[i][j-1] = "D";
                }
            }
        }
        return plotted;
    }
    //Print function(loop and print each array
    private static void PrintPlot(String[][] plotted) {
        System.out.println("The danger plotted map is: ");
        for (String[] strings : plotted) {
            System.out.println(Arrays.toString(strings));
        }
    }
}
