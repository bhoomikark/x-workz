package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.animal.Animal;
import com.xworkz.lilyblossomstore.internal.animal.Dog;
import com.xworkz.lilyblossomstore.internal.animal.Shitzu;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal1=new Animal();
        animal1.move();
        animal1.hunt();
        animal1.eat();
        animal1.sleep();
        animal1.makeSound();

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

        System.out.println("Casting");
        Shitzu shitzu=new Shitzu();
        shitzu.DogBreed(animal1);
        shitzu.DogBreed(animal);
        shitzu.DogBreed(dog);

    }
}
