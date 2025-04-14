package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella = new Umbrella("Automatic", "Blue", true);
        System.out.println(umbrella);
        System.out.println("Overridden HashCode: " + umbrella.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(umbrella));
        Umbrella umbrella1 = new Umbrella("Automatic", "Blue", true);
        Umbrella umbrella2 = new Umbrella("Manual", "Red", false);


        System.out.println("umbrella.equals(umbrella1)? " + umbrella.equals(umbrella1));
        System.out.println("umbrella.equals(umbrella2)? " + umbrella.equals(umbrella2));
    }
}
