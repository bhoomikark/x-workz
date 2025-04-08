package com.xworkz.capital.staticinternal;

import java.sql.SQLOutput;

public class StaticRunner {
    public static void main(String[] args)
    {
        System.out.println("Static Block: "+StaticVariable.fruitName);
        StaticVariable staticVariable=new StaticVariable();
        staticVariable.totalNoOfFruits=10;
        StaticVariable staticVariable1=new StaticVariable();
    }

}
