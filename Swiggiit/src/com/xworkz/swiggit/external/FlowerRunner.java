package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Flower;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower flower = new Flower("Rose", "Perennial", "Inflorescence");
        System.out.println("Flower to string: " + flower.toString());
        System.out.println("Flower HashCode: " + flower.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(flower));
        Flower flower1 = new Flower("Rose", "Perennial", "Inflorescence");
        Flower flower2 = new Flower("Rose", "Annual", "Solitary");
        boolean result = flower1.equals(flower2);
        System.out.println("Are both flowers equal? " + result);
    }
}
