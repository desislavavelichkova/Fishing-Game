package Fishes;

import Fishes.Fish;

public class SheatFish extends Fish {
    private int whisckerLength;

    public SheatFish(int weight, int whisckerLength) {
        super(weight);
        this.whisckerLength = whisckerLength;
    }

    public int getWhisckerLength() {
        return whisckerLength;
    }

    public void setWhisckerLength(int whisckerLength) {
        this.whisckerLength = whisckerLength;
    }


    @Override
    public String FishInfo() {
        return new StringBuilder().append(super.FishInfo()).append(" and ").append(this.whisckerLength).append("cm.!").toString();
    }
}