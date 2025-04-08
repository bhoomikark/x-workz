package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.bangle.Bangle;
import com.xworkz.lilyblossomstore.internal.bangle.GoldBangle;

public class BangleRunner {
    public static void main(String[] args) {
        System.out.println("Using parent type reference:");
        Bangle bangle = new GoldBangle();
        bangle.wear();
        bangle.remove();
        bangle.clean();
        bangle.store();
        bangle.shine();

        System.out.println("-----------");

        System.out.println("Using child type reference:");
        GoldBangle goldBangle = new GoldBangle();
        goldBangle.wear();
        goldBangle.remove();
        goldBangle.clean();
        goldBangle.store();
        goldBangle.shine();
    }
}
