package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Barbie;

public class BarbieRunner {
    public static void main(String[] args) {
        Barbie barbie = new Barbie("Barbie: The Princess & The Popstar", "Cartoon Network", false);
        System.out.println("Barbie to string: " + barbie.toString());
        System.out.println("Barbie HashCode: " + barbie.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(barbie));
        Barbie barbie1 = new Barbie("Barbie: Mermaidia", "Disney", true);
        Barbie barbie2 = new Barbie("Barbie: Fairytopia", "Nick", true);
        System.out.println("Are at same location or not: " + (barbie1 == barbie2));
        boolean value = barbie2.equals(barbie1);
        System.out.println("Are both barbies same? " + value);
    }
}
