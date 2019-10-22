package com.tejasmehta;

import info.gridworld.actor.Bug;

import java.awt.*;

public class CircleBug extends Bug {
    int sideMove = 5;
    int steps = 0;

    public CircleBug(int length) {
        this.setColor(Color.GREEN);
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
            steps = 0;
        }
    }
}
