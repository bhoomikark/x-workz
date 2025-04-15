package com.xworkz.multilevel.external;

import com.xworkz.multilevel.internal.cake.Servants;

public class CakeRunner {
    public static void main(String[] args) {
        Servants obj = new Servants();
        obj.name();
        obj.bake();
        obj.serve();
    }
}
