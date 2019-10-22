package com.tejasmehta;

import java.util.Scanner;

/****
 * Name: Tejas Mehta
 * Date: May 17th, 2019
 * Lab Name: LabOOP5-Monster Lab
 * Extra: Took the monster's last name
 */
public class Main {

    public static void main(String[] args) {
        //Init scanner & loop
        Scanner in = new Scanner(System.in);
        while (true) {
            //Ask for 1st monster's values
            System.out.println("Enter Monster 1's name:");
            String name = in.next();
            System.out.println("Enter Monster 1's last name");
            String lName = in.next();
            System.out.println("Enter Monster 1's size:");
            //Ask for 2nd monster's val
            int size = in.nextInt();
            System.out.println("Enter Monster 2's name");
            String oName = in.next();
            System.out.println("Enter Monster 2's last name");
            String olName = in.next();
            System.out.println("Enter Monster 2's size:");
            int oSize = in.nextInt();
            //Construct and check
            Monster monster1 = new Monster(name, lName, size);
            Monster monster2 = new Monster(oName, olName, oSize);
            monster1.isBigger(monster2);
            monster1.namesTheSame(monster2);
            System.out.println(monster1);
        }
    }
}
