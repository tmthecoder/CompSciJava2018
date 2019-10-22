/****
 * Name: Tejas Mehta
 * Date: June 3rd, 2019
 * Lab Name: LabOOP6-F3-Recursive Fractals
 * Extra: The frame resize also resizes the triangles, instead of collapsing in on them.
 */
package com.tejasmehta;

import javax.swing.*;

public class Main {
    private JFrame frame;
    //create frame
    private Main() {
        //main invokation, create frame and call class
        frame = new JFrame("Sierpinski Triangle");
        frame.setSize(1024, 768);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(frame.getSize());
        frame.add(new Sierpinski(frame.getSize()));
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String... argv) {
        //call frame
        new Main();
    }
}
