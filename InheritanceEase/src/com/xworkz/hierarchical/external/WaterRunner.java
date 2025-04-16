package com.xworkz.hierarchical.external;

import com.xworkz.hierarchical.internal.water.Boat;
import com.xworkz.hierarchical.internal.water.Fish;

public class WaterRunner {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.show();
        fish.swim();

        Boat boat = new Boat();
        boat.show();
        boat.ride();
    }
}
