package com.tejasmehta;

import info.gridworld.actor.Bug;

import java.awt.*;

public class ZBug extends Bug {
    int sideMove = 5;
    int steps = 0;
    boolean first = true;
    boolean firstSecond = true;
    boolean firstSecondThird = true;
    boolean moveOnce = true;
    public ZBug(int length){
        this.setColor(Color.CYAN);
        this.setDirection(90);
        sideMove = length;
    }
    public void setSideLength(int sideLength) {
        sideMove = sideLength;
    }

    @Override
    public void act() {
        if (firstSecond) {
            if (steps < sideMove && this.canMove()) {
                this.move();
                steps++;
                if (!firstSecondThird && (steps + 1) == sideMove) {
                    if (moveOnce) {
                        this.move();
                        moveOnce = false;
                    }
                    firstSecond = false;
                }
            } else {
                if (first) {
                    turn();
                    turn();
                    turn();
                    first = false;
                } else {
                    this.setDirection(90);
                    firstSecondThird = false;
                }
                steps = 0;
            }
        }
    }
}
