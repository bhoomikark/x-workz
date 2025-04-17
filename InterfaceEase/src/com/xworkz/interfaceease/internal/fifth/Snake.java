package com.xworkz.interfaceease.internal.fifth;

public class Snake implements Reptile, Venomous {
    @Override
    public void crawl() {
        System.out.println("Snake is crawling silently.");
    }

    @Override
    public void shedSkin() {
        System.out.println("Snake is shedding its skin.");
    }

    @Override
    public void makeSound() {
        System.out.println("Snake hisses.");
    }

    @Override
    public void bite() {
        System.out.println("Snake bites its prey.");
    }

    @Override
    public void injectVenom() {
        System.out.println("Snake injects venom.");
    }
}