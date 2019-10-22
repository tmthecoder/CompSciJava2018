package com.tejasmehta;

import info.gridworld.actor.Bug;

import java.awt.*;
import java.util.ArrayList;

public class DancingBug extends Bug {
    int sideMove = 0;
    int steps = 0;
    ArrayList<Integer> sequences;
    int moveState = 0;
    public DancingBug(int length, ArrayList<Integer> movements) {
        this.setColor(Color.GREEN);
        sideMove = length;
        sequences = movements;
    }

    @Override
    public void act() {
        if (steps < sideMove && this.canMove()) {
            this.move();
            steps++;
        }else {
            for(int i = 0; i < sequences.get(moveState); i++) {
                turn();
            }
            moveState++;
            if (moveState > (sequences.size()) - 1) {
                moveState = 0;
            }
            steps = 0;
        }
    }
}
