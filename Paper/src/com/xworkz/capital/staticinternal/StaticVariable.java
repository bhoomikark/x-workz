package com.xworkz.capital.staticinternal;

public class StaticVariable {
    static String fruitName;
    int totalNoOfFruits;
    public StaticVariable()
    {
        System.out.println("Running static variable Constructor");
    }
    static{
        System.out.println("Running static block");
        fruitName="Avacado";
    }
}
