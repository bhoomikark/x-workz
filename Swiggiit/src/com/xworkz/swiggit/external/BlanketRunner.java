package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Blanket;

public class BlanketRunner {
    public static void main(String[] args) {
        Blanket blanket = new Blanket("Maroon", "Woolen", 2);
        System.out.println("Blanket to string: " + blanket.toString());
    }
}
