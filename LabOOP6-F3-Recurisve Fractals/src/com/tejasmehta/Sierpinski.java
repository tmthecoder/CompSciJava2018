/****
 * Name: Tejas Mehta
 * Date:
 */
package com.tejasmehta;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Sierpinski extends JPanel {
    //Creation
    Sierpinski(Dimension dimension) {
        //set size
        setSize(dimension);
        setPreferredSize(dimension);
    }
    //paint function
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        //create graphics, and make points for init paint
        Dimension d = getSize();
        Point a = between(new Point(0, 0), new Point(d.width, 0));
        Point b = new Point(d.width, d.height);
        Point c = new Point(0, d.height);
        //call draw
        drawTriangle(g2, a, b, c);
    }
    private void drawTriangle(Graphics2D g, Point a, Point b, Point c) {
        //draw 3 lines via points
        g.drawLine(a.x, a.y, b.x, b.y);
        g.drawLine(b.x, b.y, c.x, c.y);
        g.drawLine(c.x, c.y, a.x, a.y);
        if(a.distance(b.x, b.y) < 2.0) {
            return;
        }
        //get point ab, bc, ca
        Point ab = between(a, b);
        Point bc = between(b, c);
        Point ca = between(c, a);
        //call 3 recursive draws, making them smaller
        drawTriangle(g, a, ab, ca);
        drawTriangle(g, ab, b, bc);
        drawTriangle(g, c, ca, bc);
    }
    //draw
    private Point between(Point a, Point b) {
        //makes point smaller, for smaller triangles inside.
        return new Point((a.x + b.x) / 2, (a.y + b.y) / 2);
    }
}
