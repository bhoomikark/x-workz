package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Sunlight;

public class SunlightRunner {
    public static void main(String[] args) {
        Sunlight sunlight = new Sunlight(true, "500 nm", 5.8e14);
        System.out.println("Sunlight to string: " + sunlight.toString());
        System.out.println("Overridden HashCode: " + sunlight.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(sunlight));
    }
    }

