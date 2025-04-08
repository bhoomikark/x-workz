package com.xworkz.lilyblossomstore.internal.potion;

public class HealingPotion extends Potion {
    public HealingPotion() {
        super();
        System.out.println("Healing potion restores health...");
    }

    @Override
    public void taste() {
        System.out.println("Child class");
        System.out.println("HealingPotion tastes like sweet berries...");
    }

    @Override
    public void effect() {
        System.out.println("Child class");
        System.out.println("HealingPotion instantly recovers health...");
    }

    @Override
    public void duration() {
        System.out.println("Child class");
        System.out.println("HealingPotion lasts for a short duration...");
    }

    @Override
    public void ingredients() {
        System.out.println("Child class");
        System.out.println("HealingPotion is made with healing herbs and enchanted water...");
    }
    public void boostRecovery() {
        System.out.println("Healing Potion boosts recovery speed.");
    }
}
