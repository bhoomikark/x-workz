package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Barbie;

public class BarbieRunner {
    public static void main(String[] args) {
        Barbie barbie = new Barbie("Barbie: The Princess & The Popstar", "Cartoon Network", false);
        System.out.println("Barbie to string: " + barbie.toString());
        System.out.println("Barbie HashCode: " + barbie.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(barbie));
    }
}
