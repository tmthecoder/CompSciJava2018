package com.tejasmehta;

public class Chamber {
    String inCave = "";
    Chamber(String caveInit) {
        chamberCreate(caveInit);
    }
    private void chamberCreate(String caveInit) {
        switch (caveInit) {
            case "wampus":
                inCave = "wampus";
                break;
            case "bat":
                inCave = "bat";
                break;
            case "mouth":
                inCave = "mouth";
                break;
            case "player":
                inCave = "player";
                break;
            case "pit":
                inCave = "pit";
                break;
            default:
                inCave = "nothing";
        }
    }

    @Override
    public String toString() {
        return inCave;
    }
}
