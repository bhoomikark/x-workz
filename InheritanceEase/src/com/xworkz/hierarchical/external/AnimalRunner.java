package com.xworkz.hierarchical.external;

import com.xworkz.hierarchical.internal.animal.Lion;
import com.xworkz.hierarchical.internal.animal.Tiger;

public class AnimalRunner {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.show();
        lion.sound();

        Tiger tiger = new Tiger();
        tiger.show();
        tiger.power();
    }
}
