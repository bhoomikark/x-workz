package com.xworkz.interfaceease.internal.fifth;

public class Viper implements Reptile, Venomous {
    @Override
    public void crawl() {
        System.out.println("Viper is slithering quickly.");
    }

    @Override
    public void shedSkin() {
        System.out.println("Viper is shedding its skin.");
    }

    @Override
    public void makeSound() {
        System.out.println("Viper hisses loudly.");
    }

    @Override
    public void bite() {
        System.out.println("Viper bites its prey.");
    }

    @Override
    public void injectVenom() {
        System.out.println("Viper injects venom.");
    }
}