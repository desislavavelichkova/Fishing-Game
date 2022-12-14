package main.java;

import java.util.ArrayList;
import java.util.List;

public class Pond {
    List<Fish> capacity = new ArrayList<>();
    String state;

    public Pond() {
        this.state = this.getState(this.capacity.size());
    }

    String getState(int fishNumber) {
        String state = null;
        if (fishNumber < 5) {
            state = "poor";
        } else if (fishNumber > 5 && fishNumber < 10) {
            state = "normal";
        } else if (fishNumber > 10) {
            state = "rich";
        } else {
            System.out.println("Error: Fish number not defined.");
        }
        return state;
    }

    public void obtainFish(Fish fish) {
        this.capacity.add(fish);
    }

    public void lostFish() {
        this.capacity.remove(0);
    }

    public void showCapacity() {
        System.out.println(this.capacity.size());
    }

    public void showState() {
        System.out.println(this.state);
    }
}