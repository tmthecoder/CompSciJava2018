/****
 * Name: Tejas Mehta
 * Date: May 23rd, 2019
 * Lab Name: LabOOP5-Real-Gettysberg Address
 * Extra: Added a reverse sort function
 */
package com.tejasmehta;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Reader reader = new Reader(new File("src/gettysberg.txt"));
        //Create reader
        reader.scan();
        reader.removeDupe();
        reader.sort();
        //Scan and sort and print
        System.out.println("Normal Sort: " + reader);
        reader.revSort();
        //Reverse and print
        System.out.println("Reverse Sort: " + reader);
    }
}
