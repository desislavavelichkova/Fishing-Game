import Fishes.Fish;

import java.util.ArrayList;


public class Pond {

    private String state;
    private int power;
    ArrayList<Fish> fishes;

    public Pond() {
        this.fishes = new ArrayList<>();
        this.state = state;
        this.power = power;
    }

    public void ShowState() {
        if (fishes.size() >= 0 && fishes.size() < 5) {
            state = "poor";
        } else if (fishes.size() >= 5 && fishes.size() <= 10) {
            state = "normal";
        } else if (fishes.size() > 10) {
            state = "rich";
        }
        System.out.println("The state of the pond is " + state + ".");
    }

    public int getPower() {
        if (power < 0) {
            power = 0;
        }
        return power;
    }

    public void ShowCapacity() {

        System.out.println("Fishes in the pond: " + this.fishes.size());
    }

    public void lostFish() {
        if (fishes.size() == 0) {
            System.out.println("*****The pond is empty!*****");
        }
        else {
            this.power -= 2;
            fishes.remove(fishes.size() - 1);
            System.out.println("*****You catch the fish.*****");
        }
    }

    public void obtainFish(Fish fish) {

        if (!fishes.contains(fish)) {
            fishes.add(fish);
            this.power++;

            System.out.println("*****You add a new fish in your pond!*****");
        } else {
            System.out.println("The fish exists in the pond.");
        }
    }

}
