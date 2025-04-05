package com.xworkz.lilyblossomstore.internal.fruit;

public class Mango extends Fruit {
    public Mango() {
        super();

        System.out.println("Running Mango Constructor in Mango class");
    }

    @Override
    public void grow() {
        System.out.println("Child Class");
        System.out.println("Mango is growing on the tree");
    }

    @Override
    public void ripen() {
        System.out.println("Child Class");
        System.out.println("Mango is ripening and turning yellow");
    }

    @Override
    public void eat() {
        System.out.println("Child Class");
        System.out.println("Eating the sweet mango");
    }

    @Override
    public void getTaste() {
        System.out.println("Child Class");
        System.out.println("Mango tastes sweet and juicy");
    }

    @Override
    public void getNutrition() {
        System.out.println("Child Class");
        System.out.println("Mango is rich in vitamins A and C");
    }
}
