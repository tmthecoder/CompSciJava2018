/****
 * Name: Tejas Mehta
 * Date: May 23rd, 2019
 * Lab Name: LabOOP6-F-Fruit Stand
 * Extra; Added interfaces
 */
package com.tejasmehta;
//Class declare
public class Fruit {
    private String fruitName;
    private int quantity;
    //State vars
    //Constructor, accpet name and quantity
    Fruit(String name, int num) {
        fruitName = name;
        quantity = num;
    }

    //Override toString and print name/quantity
    @Override
    public String toString() {
        return fruitName + "\t" + quantity;
    }
}
