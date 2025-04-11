package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella = new Umbrella("Automatic", "Blue", true);
        System.out.println(umbrella);
        System.out.println("Overridden HashCode: " + umbrella.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(umbrella));
    }
}
