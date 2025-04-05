package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.eyeliner.Eyeliner;
import com.xworkz.lilyblossomstore.internal.eyeliner.LiquidEyeliner;

public class EyelinerRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        Eyeliner eyeliner1 = new Eyeliner();
        eyeliner1.apply();
        eyeliner1.remove();
        eyeliner1.smudge();
        eyeliner1.dry();
        eyeliner1.longLasting();

        Eyeliner eyeliner = new LiquidEyeliner();
        eyeliner.apply();
        eyeliner.remove();
        eyeliner.smudge();
        eyeliner.dry();
        eyeliner.longLasting();

        System.out.println("-----------");

        LiquidEyeliner liquidEyeliner = new LiquidEyeliner();
        liquidEyeliner.apply();
        liquidEyeliner.remove();
        liquidEyeliner.smudge();
        liquidEyeliner.dry();
        liquidEyeliner.longLasting();
    }
}
