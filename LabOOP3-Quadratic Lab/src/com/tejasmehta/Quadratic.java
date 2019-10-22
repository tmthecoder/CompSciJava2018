package com.tejasmehta;
//(c) A+ Computer Science
// www.apluscompsci.com

/****
 * Name: Tejas Mehta
 * Date: May 17th, 2019
 * Lab Name: LabOOP3-Quadratic Lab
 * Extra: Same as main
 */

import java.util.Scanner;
import static java.lang.Math.*;

public class Quadratic
{
    private int a, b, c;
    private String message;

    //Set all to 0
    public Quadratic() {
        setEquation(0, 0, 0);
    }

    //Constructor, set to values given
    Quadratic(int quadA, int quadB, int quadC) {
        setEquation(quadA, quadB, quadC);
    }

    //Setter
    private void setEquation(int quadA, int quadB, int quadC) {
        a = quadA;
        b = quadB;
        c = quadC;
    }

    //get the roots using the quadratic formula
    void calcRoots() {
        double sqrt = Math.round(Math.sqrt((b * b) - (4 * a * c))*100)/100;
        double rootOne = Math.round(((-1 * b) + sqrt) / (2 * a) * 100) / 100;
        double rootTwo = Math.round(((-1 * b) - sqrt) / (2 * a) * 100) / 100;
        message = "Root One: " + rootOne + "\nRoot Two: " + rootTwo;
    }

    //Calculate the missing side using the law of cosines
    void calcCos() {
        double cos = 2 * a * b * (Math.cos(Math.toRadians(c)));
        System.out.println((Math.cos(Math.toRadians(c))));
        double answer = (double)Math.round(Math.sqrt((a * a) + (b * b) - cos)*100)/100;
        message = "'c' is equal to " + answer;
    }

    //Print function
    public void print() {
        System.out.println(message);
    }

    //complete either print or the toString()
    //toString override
    public String toString()
    {
        return message;
    }
}
