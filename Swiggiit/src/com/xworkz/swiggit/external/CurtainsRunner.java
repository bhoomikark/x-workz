package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Curtains;

public class CurtainsRunner {
    public static void main(String[] args) {
        Curtains curtains = new Curtains("Blackout", 799.50, "Maroon");
        System.out.println(curtains);
    }
}
