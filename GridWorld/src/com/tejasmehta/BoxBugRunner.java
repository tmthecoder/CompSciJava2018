package com.tejasmehta;

import info.gridworld.actor.ActorWorld;

public class BoxBugRunner {

    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        //world.add(new Bug());
        //world.add(new Rock());
        world.add(new BoxBug(5));
        world.show();
    }
}
