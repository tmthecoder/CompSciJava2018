/****
 * Name: Tejas Mehta
 * Date: May 3rd, 2019
 * Lab Name: Lab9.4-Worksheet 3D-Drawings
 * Extra: Made the distance for the 2nd shape in the 3rd object random, making different variations on each redraw
 */
package com.tejasmehta;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        JFrame frame = buildFrame();
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random random = new Random();
                g.setColor(Color.BLUE);
                //Declare init vars
                //3d rect
                int[] rectX = {20, 200, 180, 0};
                int[] rectY = {0, 0, 30, 30};
               g.fillPolygon(rectX, rectY, 4);
                //Make polygon 1(rect)
               int[] r2x = {20, 0, 0, 20};
               int[] r2y = {0, 30, 110, 80};
               g.fillPolygon(r2x, r2y, 4);
                //Make polygon 2(rect)
               int[] r3x = {0, 180, 200, 20};
               int[] r3y = {110, 110, 80, 80};
               g.fillPolygon(r3x, r3y, 4);
                //Make polygon 3(rect)
               int[] r4x = {180, 200, 200, 180};
               int[] r4y = {0, 0, 80, 110};
               g.fillPolygon(r4x, r4y, 4);
                //Make polygon 49rect)
               g.setColor(Color.BLACK);
               //Label it
               g.drawString("3D-Rectangle", 5, 120);
                //now for 2nd drawing
               g.setColor(Color.GREEN);
               g.fillRect(0, 130, 100, 100);
               //Make init rectangle
               g.setColor(Color.BLACK);
               g.drawLine(0, 130, 100, 230);
               //Initial line
               g.fillOval(15, 145, 20, 20);
               g.fillOval(55, 185, 20, 20);
               //Draw each circle
               g.setColor(Color.BLUE);
               g.fillOval(25, 155, 20, 20);
               g.fillOval(65, 195, 20, 20);
               g.setColor(Color.BLACK);
               //Label
               g.drawString("2nd Draw", 5, 240);
               //End shapes
                //Draw init ovals for cylinder
               g.drawOval(5, 250, 100, 20);
               g.drawLine(5, 260, 5, 360);
               g.drawLine(105, 260, 105, 360);
               g.drawOval(5, 350, 100, 20);
                //Draw second smaller bottom base with random nums
               int rNum = random.nextInt(50) + 50;
                g.drawOval(150, 250, 100, 20);
                g.drawLine(150, 260, 150, 360);
                g.drawLine(250, 260, rNum + 150, 360);
                g.drawOval(150, 350, rNum, 20);
            }
        };
        frame.add(panel);
    }
    //Frame builder
    private static JFrame buildFrame() {
        //Build frame, declare frame, size and operation
        JFrame frame = new JFrame("Lab9.4");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);
        return frame;
    }
}
