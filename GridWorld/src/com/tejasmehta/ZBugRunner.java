package com.tejasmehta;

import info.gridworld.actor.ActorWorld;

public class ZBugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        //world.add(new Bug());
        //world.add(new Rock());
        world.add(new ZBug(5));
        world.show();
    }
}
