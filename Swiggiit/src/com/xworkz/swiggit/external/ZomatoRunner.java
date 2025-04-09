package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Zomato;

public class ZomatoRunner {
    public static void main(String[] args) {
        Zomato zomato = new Zomato(true, 3, "Pizza, Burger, Coke");
        System.out.println("Zomato to string: " + zomato.toString());
    }
}
