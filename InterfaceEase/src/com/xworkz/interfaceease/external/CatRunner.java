package com.xworkz.interfaceease.external;
import com.xworkz.interfaceease.internal.second.*;


public class CatRunner {
    public static void main(String[] args) {
        System.out.println("2.Running interface Domestic animal reference from Dog class");
        DomesticAnimal domesticAnimal=new Dog();
        domesticAnimal.eat();
        domesticAnimal.sleep();
        domesticAnimal.wake();
        domesticAnimal.pee();
        Mammal mammal2=new Deer();
        mammal2.feedYoung();
        mammal2.giveBirth();
        mammal2.groom();
        mammal2.care();
        System.out.println("=================================");
        System.out.println("2 copies from 2 new Classes");
        DomesticAnimal domesticAnimal1=new Cat();
        domesticAnimal1.wake();
        domesticAnimal1.eat();
        domesticAnimal1.sleep();
        Mammal mammal=new Cat();
        mammal.feedYoung();
        mammal.giveBirth();
        mammal.groom();
        DomesticAnimal domesticAnimal2=new Rabbit();
        domesticAnimal2.wake();
        domesticAnimal2.eat();
        domesticAnimal2.sleep();
        Mammal mammal1=new Rabbit();
        mammal1.feedYoung();
        mammal1.giveBirth();
        mammal1.groom();


    }
}
