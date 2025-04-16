package com.xworkz.hierarchical.external;

import com.xworkz.hierarchical.internal.cartoon.Doremon;
import com.xworkz.hierarchical.internal.cartoon.TomAndJerry;

public class CartoonRunner {
    public static void main(String[] args) {
        TomAndJerry t = new TomAndJerry();
        t.showOrigin();
        t.comedy();

        Doremon d = new Doremon();
        d.showOrigin();
        d.showGadget();
    }
}
