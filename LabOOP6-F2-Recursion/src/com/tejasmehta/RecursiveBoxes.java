package com.tejasmehta;
/****
 * Name: Tejas Mehta
 * Date: May 28th, 2019
 * Lab Name: LabOOP6-F2-Recursion
 * Extra: Same as main
 */
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

public class RecursiveBoxes extends JPanel {
    private int boxes;
    //Init constructor for Frame
    RecursiveBoxes(int b) {
        boxes = b;
        setSize(640,480);
        setBackground(Color.WHITE);
        setVisible(true);
    }
    //Paint function, call drawBoxes
    public void paintComponent( Graphics window ){
        super.paintComponent(window);
        window.setColor(Color.ORANGE);
        window.setFont(new Font("TAHOMA",Font.BOLD,12));

        window.drawString("Drawing Boxes Using Recursion ",20,80);
        drawBoxes(window,10,10);
    }
    //Draw function, for boxes via given arg
    private void drawBoxes(Graphics window, int x, int y) {
        //base case
        window.setColor(Color.BLUE);

        for(int i = 0; i < boxes; i++) {
            window.drawRect(90 + x, 90 + y, 20 + x, 20 + x);
            x+=10;
            y+=10;
        }
    }
}