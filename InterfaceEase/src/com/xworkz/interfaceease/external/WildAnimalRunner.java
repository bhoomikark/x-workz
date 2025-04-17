package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fourth.*;

public class WildAnimalRunner {
    public static void main(String[] args) {
        System.out.println("4. Running interface FlyingAnimal reference from Eagle class");
        FlyingAnimal eagle = new Eagle();
        eagle.fly();
        eagle.land();
        eagle.makeSound();
        eagle.sleepingHours();
        NocturnalAnimal nocturnal = new Leopard();
        nocturnal.huntAtNight();
        nocturnal.sleepDuringDay();
        nocturnal.makeSound();
        nocturnal.attack();
        System.out.println("=================================");

        System.out.println("Running interface NocturnalAnimal reference from Owl class");
        NocturnalAnimal nocturnalOwl = new Owl();
        nocturnalOwl.huntAtNight();
        nocturnalOwl.sleepDuringDay();
        nocturnalOwl.makeSound();
        FlyingAnimal owl = new Owl();
        owl.fly();
        owl.land();
        owl.makeSound();
        System.out.println("=================================");

        System.out.println("Running interface FlyingAnimal reference from Bat class");
        FlyingAnimal bat = new Bat();
        bat.fly();
        bat.land();
        bat.makeSound();
        NocturnalAnimal nocturnalBat = new Bat();
        nocturnalBat.huntAtNight();
        nocturnalBat.sleepDuringDay();
        nocturnalBat.makeSound();
    }
}