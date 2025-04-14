package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Zomato;

public class ZomatoRunner {
    public static void main(String[] args) {
        Zomato zomato = new Zomato(true, 3, "Pizza, Burger, Coke");
        System.out.println("Zomato to string: " + zomato.toString());
        System.out.println("Overridden HashCode: " + zomato.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(zomato));
        Zomato zomato1 = new Zomato(true, 3, "Pizza, Burger, Coke");
        Zomato zomato2 = new Zomato(true, 3, "Pizza, Burger, Coke");
        Zomato zomato3 = new Zomato(false, 2, "Pasta, Soda");

        System.out.println("zomato1.equals(zomato2)? " + zomato1.equals(zomato2));
        System.out.println("zomato1.equals(zomato3)? " + zomato1.equals(zomato3));
    }
}
