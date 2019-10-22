/****
 * Name: Tejas Mehta
 * Date: May 13th, 2019
 * Lab Name: Lab9.5-Repetitive Drawings
 * Extra: Randomized Shell Color
 */
package com.tejasmehta;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main extends JPanel{

    public static void main(String[] args) {
	// write your code here
        Main p = new Main();
        JFrame f = new JFrame();
        f.setSize(600, 600);
        f.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        f.add(p);
        f.setVisible(true);
    }
    @Override
    protected void paintComponent(Graphics g) {
        setBackground(Color.BLACK);
        g.setColor(Color.BLUE);
        //Draw RectRepetitive
        DrawRepRect(50, 50, 100, 40, g);
        //Draw caterpillar
        DrawCaterpillar(250, 50, 100, 100, g);
        //Draw Shell
        DrawShell(50, 250, 100, 100, g);
        //Draw Tree
        DrawTree(450, 250, 20, 20, g);

    }
    //Draw a repeating rectangle
    private void DrawRepRect(int x, int y, int width, int height, Graphics g) {
        for (int i = 1; i <= 5; i++) {
            //Set color for edge and fill
            g.setColor(Color.BLUE);
            g.fillRect(x, y, width, height);
            g.setColor(Color.WHITE);
            g.drawRect(x, y, width, height);
            //Increment
            x += 10;
            y += 10;
        }
        g.drawString("Repetitive Rectangles", x-50, y+50);
    }
    //To draw caterpillar
    private void DrawCaterpillar(int x, int y, int width, int height, Graphics g) {
        for(int i = 1; i <= 7; i++) {
            //Set colors for repeat
            g.setColor(Color.ORANGE);
            g.fillOval(x, y, width, height);
            g.setColor(Color.WHITE);
            g.drawOval(x, y, width, height);
            x+=20;
        }
        //Draw eyes
        g.setColor(Color.BLUE);
        g.fillOval(x+10, y+20, 20, 20);
        g.fillOval(x+40, y+20, 20, 20);
        //Draw mouth
        g.setColor(Color.RED);
        g.fillOval(x+10, y+50, 50, 20);
        g.setColor(Color.WHITE);
        g.drawString("Caterpillar", x-30, y+120);
    }
    //Draw shell
    private void DrawShell(int x, int y, int width, int height, Graphics g) {
        Random random = new Random();
        //Get random and color array
        Color[] colors = {Color.BLUE, Color.WHITE, Color.ORANGE, Color.RED, Color.CYAN, Color.GREEN, Color.DARK_GRAY, Color.PINK, Color.MAGENTA};
        for(int i = 1; i <= 5; i++) {
            //Set color random and draw
            g.setColor(colors[random.nextInt(9)]);
            g.fillOval(x, y, width, height);
            g.setColor(colors[random.nextInt(9)]);
            g.drawOval(x, y, width, height);
            x+=20;
            y+=20;
            //Increment to smaller
            width*=0.75;
            height*=0.75;
        }
        g.drawString("Shell", x-50, y+30);
    }
    //Draw tree
    private void DrawTree(int x, int y, int width, int height, Graphics g) {
        //init values for triangle
        int[] triX = {x-50, x, x+50};
        int[] triY = {y+100, y, y+100};
        for(int i = 1; i <= 5; i++) {
            g.setColor(Color.GREEN);
            g.drawPolygon(triX, triY, 3);
            //Draw andd increment
            for(int j = 0; j < triY.length; j++) {
                triY[j]+=20;
            }
        }
        //Custom color and branch
        g.setColor(new Color(210, 105, 30));
        g.fillRect(x-10, y+180, 20, 40);
        g.setColor(Color.WHITE);
        g.drawString("Tree", x-10, y+250);
    }
}
