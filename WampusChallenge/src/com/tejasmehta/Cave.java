package com.tejasmehta;

import java.util.Arrays;
import java.util.Random;

public class Cave {
    //4x5 2D array for chambers
    int playR;
    int playC;
    Chamber[][] chambers = new Chamber[4][5];
    int[] nums = new int[7];
    //String to pass init to Chamber
    String[] vals = {"wampus", "bat", "bat", "bat", "mouth", "player", "pit"};
    Cave() {
        caveCreate();
    }
    private void caveCreate() {
        //gen random nums for location of each item(wampus is 1st num, bats: 2, 3, and 4, mouth is 5, player is 6, pit is 7;
        nums = new Random().ints(0, 20).distinct().limit(7).toArray();
        //gen blank chamber
        for (int i = 0; i < chambers.length; i++) {
            for(int j = 0; j < chambers[i].length; j++) {
                chambers[i][j] = new Chamber("nothing");
            }
        }
        //Remake areas with special vals
        for(int i = 0; i < nums.length; i++) {
            int row = nums[i]/5;
            int column = nums[i]%5;
            chambers[row][column] = new Chamber(vals[i]);
            if (i == 5) {
                playR = row;
                playC = column;
            }
        }
    }
    //Print cave
    @Override
    public String toString() {
        return Arrays.deepToString(chambers).replace("], ", "]\n").replace("[[", "[").replace("]]", "]");
    }
}
