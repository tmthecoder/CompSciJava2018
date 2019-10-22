/****
 * Name: Tejas Mehta
 * Date: May 13th, 2019
 * Lab Name: Lab9.6-Worksheet Animation Arrow
 * Extra: Animated the arrow's color to change each time.
 */
package com.tejasmehta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JPanel implements ActionListener {
	Timer time = new Timer(5, this);
	//Set init timer & vars
	int x=35, speed = 3;
    public static void main(String[] args) {
    	//Init frame and pane to it
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
		super.paintComponent(g);
		//Set x & y values for animated arrows
		int[] xVals = {x, x+60, x+60, x+80, x+60, x+60, x};
		int[] yVals = {40, 40, 20, 60, 100, 80, 80};
		//Set color
		Color[] colors = {Color.BLUE, Color.WHITE, Color.ORANGE, Color.RED, Color.CYAN, Color.GREEN, Color.DARK_GRAY, Color.PINK, Color.MAGENTA};
		Random random = new Random();
		//Pick a random set color(called each animation frame)
		g.setColor(colors[random.nextInt(9)]);
		//Draw the shape
		g.fillPolygon(xVals, yVals, 7);
		g.setColor(Color.RED);
		//Now create the bug(2 sides)
		g.fillArc(x, 155, 50, 40, 15, 180);
		g.fillArc(x, 160, 50, 40, 50, -180);
		g.setColor(Color.BLACK);
		//Make all teh dots and the head
		g.fillOval(x+45, 157, 20, 20);
		g.fillOval(x+5, 165, 10, 10);
		g.fillOval(x+20, 160, 10, 10);
		g.fillOval(x+35, 170, 10, 10);
		g.fillOval(x+20, 185, 10, 10);
		//Draw 4 lines as the legs
		g.drawLine(x, 170, x-2, 165);
		g.drawLine(x+30, 155, x+30, 150);
		g.drawLine(x+30, 200, x+28, 205);
		g.drawLine(x+45, 190, x+46, 195);

		//Start animation
		time.start();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
    	//Animation controller, increment by speed & repaint
		if (x > 0 && x < 450) {
			x = x + speed;
			repaint();
		}
	}
}
