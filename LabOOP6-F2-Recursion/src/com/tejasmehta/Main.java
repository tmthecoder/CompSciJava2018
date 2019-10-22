package com.tejasmehta;
/****
 * Name: Tejas Mehta
 * Date: May 28th, 2019
 * Lab Name: LabOOP6-F2-Recursion
 * Extra: Allowed the user to input boxes
 */

import javax.swing.*;

public class Main extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    //Set init vars and constructor
    private Main(int boxes) {
        super("Graphics Runner");
        setSize(WIDTH,HEIGHT);
        //Init frame set size
        getContentPane().add(new RecursiveBoxes(boxes));

        setVisible(true);
    }
    //Main
    public static void main( String args[] ) {
        //Get amount via dialog and make Boxes
        int boxes = Integer.parseInt(JOptionPane.showInputDialog("Input Amount of Boxes: "));
        Main run = new Main(boxes);
    }
}
