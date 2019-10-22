package com.tejasmehta;

import java.util.Scanner;

/****
 * Name: Tejas Mehta
 * Date: May 17th, 2019
 * Lab Name: LabOOP4-Distance Lab
 * Extra: Calculated the midpoint as well
 */
public class Main {

    public static void main(String[] args) {
        //Declare init scanner
        Scanner in = new Scanner(System.in);
        //Ask for all values(2 coordinate points)
        System.out.println("Enter x one value:");
        int x1 = in.nextInt();
        System.out.println("Enter y one value:");
        int y1 = in.nextInt();
        System.out.println("Enter x two value:");
        int x2 = in.nextInt();
        System.out.println("Enter y two value:");
        int y2 = in.nextInt();
        //Construct class, calculate and print
        Distance dist = new Distance(x1, y1, x2, y2);
        dist.calcDistance();
        System.out.println(dist);
    }
}
