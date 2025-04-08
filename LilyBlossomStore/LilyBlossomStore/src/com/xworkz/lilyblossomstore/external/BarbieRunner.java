package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.barbie.Barbie;
import com.xworkz.lilyblossomstore.internal.barbie.FashionDoll;

public class BarbieRunner {
    public static void main(String[] args) {
        System.out.println("Using parent type reference:");
        Barbie barbie = new FashionDoll();
        barbie.dressUp();
        barbie.combHair();
        barbie.play();
        barbie.changeShoes();
        barbie.sitDown();

        System.out.println("-----------");

        System.out.println("Using child type reference:");
        FashionDoll doll = new FashionDoll();
        doll.dressUp();
        doll.combHair();
        doll.play();
        doll.changeShoes();
        doll.sitDown();
    }
}
