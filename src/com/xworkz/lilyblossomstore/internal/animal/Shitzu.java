package com.xworkz.lilyblossomstore.internal.animal;

public class Shitzu {
    public void DogBreed(Animal animal1)
    {
        System.out.println("Shitzu is a breed ");
        animal1.eat();
        animal1.sleep();
        animal1.hunt();
        animal1.move();
        animal1.makeSound();
        if(animal1 instanceof Dog)
        {
            System.out.println("casting");
            Dog dog=(Dog)animal1;
            dog.bark();
        }
    }
}
