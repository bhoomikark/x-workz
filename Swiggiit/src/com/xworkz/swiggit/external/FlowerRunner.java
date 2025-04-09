package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Flower;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower flower = new Flower("Rose", "Perennial", "Inflorescence");
        System.out.println("Flower to string: " + flower.toString());
    }
}
