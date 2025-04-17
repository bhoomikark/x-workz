package com.xworkz.interfaceease.internal.fifth;

public class Lizard implements Reptile {
    @Override
    public void crawl() {
        System.out.println("Lizard is crawling on the wall.");
    }

    @Override
    public void shedSkin() {
        System.out.println("Lizard is shedding its skin.");
    }

    @Override
    public void makeSound() {
        System.out.println("Lizard makes a chirping sound.");
    }
}