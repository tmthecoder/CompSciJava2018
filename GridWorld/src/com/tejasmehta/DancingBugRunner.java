package com.tejasmehta;

import info.gridworld.actor.ActorWorld;

import java.util.ArrayList;

public class DancingBugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        //world.add(new Bug());
        //world.add(new Rock());
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(2);
        sequence.add(3);
        sequence.add(4);
        sequence.add(5);
        sequence.add(6);
        sequence.add(42);
        sequence.add(27);
        sequence.add(69);
        sequence.add(2);
        sequence.add(3);
        world.add(new DancingBug(5, sequence));
        world.show();
    }
}
