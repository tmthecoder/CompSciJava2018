/****
 * Name: Tejas Mehta
 * Date: April 29th, 2019
 * Lab Name: Lab9.2-Worksheet Pacman
 * Extra: Added a random for ghosts that show up
 */
package com.tejasmehta;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        JFrame frame = buildFrame();
        Random random = new Random();
        //Declare frame and random/img
        final BufferedImage image = ImageIO.read(new File("src/Pac-ManLogo.png"));

        JPanel pane = new JPanel() {
            //Make new panel
            @Override
            protected void paintComponent(Graphics g) {
                //Paint function
                super.paintComponent(g);
                setBackground(Color.BLACK);
                //Draw logo
                g.drawImage(image, 0, 0, null);
                for(int i = 0; i < 4; i++) {
                    //Loop to draw each ghost
                    try {
                        final BufferedImage image = ImageIO.read(new File("src/ghost_" + (i+1) +".png"));
                        g.drawImage(image, 100*i, 250, null);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    //Draw the board, and then each random ghost/pacman
                    final BufferedImage board = ImageIO.read(new File("src/board.jpg"));
                    g.drawImage(board, 0, 400, null);
                    g.drawImage(ImageIO.read(new File("src/ghost_" + (random.nextInt(4) + 1) + ".png")), 0, 400, null);
                    g.drawImage(ImageIO.read(new File("src/pacman.png")), 378, 778, null);
                    g.drawImage(ImageIO.read(new File("src/ghost_" + (random.nextInt(4) + 1) + ".png")), 252, 400, null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        frame.add(pane);
    }
    private static JFrame buildFrame() {
        //Build frame, declare frame, size and operation
        JFrame frame = new JFrame("Lab9.2");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(630, 1000);
        frame.setVisible(true);
        return frame;
    }
}
