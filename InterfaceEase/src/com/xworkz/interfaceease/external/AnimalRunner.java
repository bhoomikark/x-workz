package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.third.WildAnimal;
import com.xworkz.interfaceease.internal.third.AquaticAnimal;
import com.xworkz.interfaceease.internal.third.Lion;
import com.xworkz.interfaceease.internal.third.Shark;
import com.xworkz.interfaceease.internal.third.Dolphin;

public class AnimalRunner {
    public static void main(String[] args) {
        System.out.println("3");
        WildAnimal lion = new Lion();
        System.out.println("Lion:");
        lion.hunt();
        lion.roam();
        lion.makeSound();
        System.out.println();

        AquaticAnimal shark = new Shark();
        System.out.println("Shark:");
        shark.swim();
        shark.dive();
        shark.breatheUnderwater();

        WildAnimal wildShark = (WildAnimal) shark;
        wildShark.hunt();
        wildShark.roam();
        wildShark.makeSound();
        System.out.println();

        AquaticAnimal dolphin = new Dolphin();
        System.out.println("Dolphin:");
        dolphin.swim();
        dolphin.dive();
        dolphin.breatheUnderwater();

        WildAnimal wildDolphin = (WildAnimal) dolphin;
        wildDolphin.hunt();
        wildDolphin.roam();
        wildDolphin.makeSound();
    }
}