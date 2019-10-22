package com.tejasmehta;

import info.gridworld.actor.Bug;

import java.awt.*;

public class BoxBug extends Bug {
    int sideMove = 5;
    int steps = 0;

    public BoxBug(int sideLength) {
        this.setColor(Color.BLUE);
        sideMove = sideLength;
    }

    public void setSideLength(int sideLength) {
        sideMove = sideLength;
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void act() {

        if (steps < sideMove && this.canMove()) {
            this.move();
            steps++;
        }else {
            turn();
            turn();
            steps = 0;
        }

    }
}
