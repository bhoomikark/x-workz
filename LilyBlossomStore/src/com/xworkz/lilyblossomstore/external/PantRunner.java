package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.pant.Pant;
import com.xworkz.lilyblossomstore.internal.pant.Jeans;

public class PantRunner {
    public static void main(String[] args) {
        System.out.println("Using parent type reference:");
        Pant pant = new Jeans();
        pant.wear();
        pant.remove();
        pant.wash();
        pant.fold();
        pant.iron();

        System.out.println("-----------");

        System.out.println("Using child type reference:");
        Jeans jeans = new Jeans();
        jeans.wear();
        jeans.remove();
        jeans.wash();
        jeans.fold();
        jeans.iron();
    }
}
