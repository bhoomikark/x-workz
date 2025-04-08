package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.animal.Animal;
import com.xworkz.lilyblossomstore.internal.animal.Dog;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.move();
        animal.hunt();
        animal.eat();
        animal.sleep();
        animal.makeSound();

        System.out.println("-----------");
        Dog dog=new Dog();
        dog.move();
        dog.hunt();
        dog.eat();
        dog.sleep();
        dog.makeSound();

    }
}
