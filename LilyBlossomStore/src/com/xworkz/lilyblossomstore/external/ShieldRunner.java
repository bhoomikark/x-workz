package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.shield.Shield;
import com.xworkz.lilyblossomstore.internal.shield.ArmorShield;

public class ShieldRunner {
    public static void main(String[] args) {
        Shield shield = new ArmorShield();
        shield.block();
        shield.reflect();
        shield.absorbImpact();
        shield.repair();
        shield.enhance();

        System.out.println("-----------");

        ArmorShield armorShield = new ArmorShield();
        armorShield.block();
        armorShield.reflect();
        armorShield.absorbImpact();
        armorShield.repair();
        armorShield.enhance();
    }
}
