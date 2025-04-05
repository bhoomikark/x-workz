package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.towel.Towel;
import com.xworkz.lilyblossomstore.internal.towel.BathTowel;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel = new BathTowel();
        towel.absorbWater();
        towel.dry();
        towel.wash();
        towel.fold();
        towel.hang();

        System.out.println("-----------");

        BathTowel bathTowel = new BathTowel();
        bathTowel.absorbWater();
        bathTowel.dry();
        bathTowel.wash();
        bathTowel.fold();
        bathTowel.hang();
    }
}
