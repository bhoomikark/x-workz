package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Screen;

public class ScreenRunner {
    public static void main(String[] args) {
        Screen screen = new Screen("LED", "Glass", "Rectangle");
        System.out.println("Screen to string: " + screen.toString());
        System.out.println("Overridden HashCode: " + screen.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(screen));
    }
}
