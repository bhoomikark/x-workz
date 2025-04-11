package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Fruit;

public class FruitRunner {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("Apple", 6, false);
        System.out.println("Fruit to string: " + fruit.toString());
        System.out.println("Fruit HashCode: " + fruit.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(fruit));
    }
}
