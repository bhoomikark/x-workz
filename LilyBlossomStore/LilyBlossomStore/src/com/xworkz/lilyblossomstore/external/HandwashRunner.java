package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.handwash.Handwash;
import com.xworkz.lilyblossomstore.internal.handwash.HerbalHandwash;

public class HandwashRunner {
    public static void main(String[] args) {
        System.out.println("Using parent type reference:");
        Handwash handwash = new HerbalHandwash();
        handwash.pour();
        handwash.use();
        handwash.rinse();
        handwash.cleanHands();

        System.out.println("-----------");

        System.out.println("Using child type reference:");
        HerbalHandwash herbalHandwash = new HerbalHandwash();
        herbalHandwash.pour();
        herbalHandwash.use();
        herbalHandwash.rinse();
        herbalHandwash.cleanHands();
    }
}
