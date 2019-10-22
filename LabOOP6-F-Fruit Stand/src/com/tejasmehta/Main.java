/****
 * Name: Tejas Mehta
 * Date: May 23rd, 2019
 * Lab Name: LabOOP6-F-Fruit Stand
 * Extra; Added interfaces
 */
package com.tejasmehta;

import java.util.ArrayList;
import java.util.Scanner;

public class Main implements FruitI{

    private String fruitName;
    private int quantity;
    //State vars & constructor
    private Main(String name, int num) {
        fruitName = name;
        quantity = num;
    }
    //print method(override)
    @Override
    public void print() {
        System.out.println(fruitName + "\t" + quantity);
    }
    //Main
    public static void main(String[] args) {
        ArrayList<Main> fruits = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //Declare scanner & list, start loop
        while (true) {
            System.out.println("Enter the name of the fruit");
            String name = in.next();
            System.out.println("Enter the quantity:");
            int num = in.nextInt();
            //Get name and quantity, use init via main
            fruits.add(new Main(name, num));
            System.out.println("Do you want to continue shopping?(y/n)");
            String resp = in.next();
            //Get continue and act appropriately
            if (resp.toLowerCase().equals("n") || resp.toLowerCase().equals("no")) {
                break;
            }
        }
        System.out.println("Item\tQuantity");
        //Print each item out
        for (Main fruit : fruits) {
            fruit.print();
        }
    }

}
//Interface
interface FruitI {
    //Print method
    void print();
}

