package com.tejasmehta;

import info.gridworld.actor.Bug;

import java.awt.*;

public class SpiralBug extends Bug {
    int sideMove = 5;
    int steps = 0;

    public SpiralBug(int length) {
        this.setColor(Color.GRAY);
        sideMove = length;
    }

    public void setSideLength(int sideLength) {
        sideMove = sideLength;
    }
    @Override
    public void act() {

        if (steps < sideMove && this.canMove()) {
            this.move();
            steps++;
        }else {
            turn();
            turn();
            sideMove++;
            steps = 0;
        }

    }
}
