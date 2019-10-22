/****
 * Name: Tejas Mehta
 * Date: April 29, 2019
 * Lab Name: Lab9.3-Worksheet Drawings
 * Extra: Made arc eyebrows for the face
 */
package com.tejasmehta;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = buildFrame();
        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //All for house
                int x1Points[] = {50, 100, 0};
                int y1Points[] = {0, 50, 50};
                Polygon p = new Polygon(x1Points, y1Points, 3);
                //Triangle
                g.drawPolygon(p);
                g.setColor(Color.RED);
                //Red border
                g.fillRect(0, 50, 100, 100);
                g.setColor(Color.YELLOW);
                //Door and windows
                g.fillRect(40, 110, 20, 40);
                g.fillRect(10, 70, 20, 20);
                g.fillRect(70, 70, 20, 20);
                //All for olympic Rings
                g.setColor(Color.BLACK);
                //All 5 rings
                g.drawOval(150, 0,50, 50);
                g.drawOval(190, 0, 50, 50);
                g.drawOval(230, 0, 50, 50);
                g.drawOval(170, 30, 50, 50);
                g.drawOval(210, 30, 50, 50);
                //All for face
                g.setColor(Color.YELLOW);
                //Yellow oval
                g.fillOval(330, 0, 200, 100);
                g.setColor(Color.BLACK);
                //All eyes and eyebrows
                g.fillArc(360, 20, 50, 30, 0, 180);
                g.fillOval(375, 30, 20, 20);
                g.fillArc(450, 20, 50, 30, 0, 180);
                g.fillOval(465, 30, 20, 20);
                //Nose
                g.fillOval(425, 30, 10, 40);
                //Face
                g.fillArc(390, 75, 80, 15, 0, -180);

            }
        };
        frame.add(pane);
    }
    //Function to create pane and all all values
    private static JFrame buildFrame() {
        //Build frame, declare frame, size and operation
        JFrame frame = new JFrame("Lab9.3");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);
        return frame;
    }
}
