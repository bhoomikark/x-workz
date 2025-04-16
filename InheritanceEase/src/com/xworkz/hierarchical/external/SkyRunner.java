package com.xworkz.hierarchical.external;

import com.xworkz.hierarchical.internal.sky.Aeroplane;
import com.xworkz.hierarchical.internal.sky.Birds;

public class SkyRunner {
    public static void main(String[] args) {
        Birds bird = new Birds();
        bird.status();
        bird.fly();

        Aeroplane plane = new Aeroplane();
        plane.status();
        plane.flyHigh();
    }
}
