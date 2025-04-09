package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Flashlight;

public class FlashlightRunner {
    public static void main(String[] args) {
        Flashlight light = new Flashlight("LED", 8, true);
        System.out.println(light);
    }
}
