package com.tejasmehta;

//(c) A+ Computer Science
//www.apluscompsci.com
/****
 * Name: Tejas Mehta
 * Date: May 17th, 2019
 * Lab Name: LabOOP5-Monster Lab
 * Extra: Same as in main
 */
public class Monster {
    //Init vars
    private String name;
    private int howBig;
    private String msg = "";
    private String lName;
    //Blank Constructor
    public Monster() {
    }
    //Init constructor
    public Monster(String n, String ln, int size) {
        name = n;
        howBig = size;
        lName = ln;
    }
    //Name getter
    public String getName() {
        return "";
    }
    //Big getter
    public int getHowBig() {
        return 0;
    }
    //Check if bigger and change message
    void isBigger(Monster other) {
        msg = howBig > other.howBig ? msg + "Monster 1 is bigger than Monster 2" : msg + "Monster 1 is smaller than Monster 2";
    }
    //Check if name is same and change msg
    void namesTheSame(Monster other) {
        msg = name.equals(other.name) && lName.equals(other.lName) ? msg + "\nMonster 1 does have the same name as Monster 2" : msg + "\nMonster 1 doesn't have the same name as Monster 2";
    }
    //Override toString
    public String toString() {
        return msg;
    }
}