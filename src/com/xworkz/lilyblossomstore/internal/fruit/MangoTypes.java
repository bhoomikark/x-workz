package com.xworkz.lilyblossomstore.internal.fruit;

public class MangoTypes {
    public void Type(Fruit fruit) {
        System.out.println("\nInside MangoTypes class");

        fruit.grow();
        fruit.ripen();
        fruit.eat();
        fruit.getTaste();
        fruit.getNutrition();

        if (fruit instanceof Mango) {
            System.out.println("Casting Fruit to Mango to access mangoType method...");
            Mango mango = (Mango) fruit;
            mango.mangoType();
        }
    }
}
