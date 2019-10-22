/****
 * Name: Tejas Mehta
 * Date: April 25th, 2019
 * Lab Name: Lab9.1-Worksheet Basics
 * Extra: Filled in the shapes for part 3
 */
package com.tejasmehta;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        setForeground(Color.ORANGE);
        setBackground(Color.BLUE);
        //First Rect
        g.drawRect(40, 30, 100, 300);
        g.setColor(Color.blue);
        g.fillRect(40, 30, 100, 300);
        //Second draw
        g.drawRect(40, 30, 110, 120);
        g.setColor(Color.blue);
        g.fillRect(40, 30, 110, 120);
        //Third draw(circle)
        g.drawOval(75, 75, 25, 25);
        g.fillOval(75, 75, 25, 25);
        //Fourth Draw
        g.drawString("Graphics are easy in Java!", 200, 200);
        //Part 2: Square with circles and text
        g.fillOval(0, 0, 90, 90);
        g.fillOval(0, 90, 90, 90);
        g.fillOval(0, 180, 90, 90);
        g.fillOval(0, 270, 90, 90);
        g.fillOval(90, 270, 90, 90);
        g.fillOval(180, 270, 90, 90);
        g.fillOval(180, 270, 90, 90);
        g.fillOval(270, 270, 90, 90);
        Font myFont = new Font("Arial", Font.BOLD, 50);
        g.setFont(myFont);
        g.drawString("GO", 180, 180);
        g.drawString("TEAM!", 150, 230);
        //Part 3: Similar shapes
        //Similar Rects
        g.fillRect(0,0, 50, 100);
        g.fillRect(55, 0, 25, 50);
        //Similar due to proportion(1:2)
        g.drawString("Similar Rect",0, 120);
        //Similar Squares
        g.fillRect(0, 140, 50, 50);
        g.fillRect(55, 140, 25, 25);
        //Similar due to proportion(1:2)
        g.drawString("Similar Squares",0, 210);
        //Similar Circles
        g.fillOval(0, 230, 50, 50);
        g.fillOval(55, 230, 25, 25);
        //Similar due to proportion(1:2)
        g.drawString("Similar Circles",0, 300);
    }
    public static void main(String[ ] args) {
        Main d = new Main();
        JFrame f = new JFrame("Lab9.1");
        f.add(d); //adds DisplayGraphics to the frame for viewing
        f.setSize(380,380); //sets the coordinate size of frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes frame
        f.setLocationRelativeTo(null); //centers the frame on screen
        f.setVisible(true); //makes frame appear on screen
    }

}
