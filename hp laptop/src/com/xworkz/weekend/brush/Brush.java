package com.xworkz.weekend.brush;

public class Brush {
    enum color{Blue,Red,White}
    color getColor()
    {
        return color.Blue;
    }
    void clean()
    {
        System.out.println("THE BRUSH IS QUITE OLD");
    }
    void scrub()
    {
        System.out.println("Running scrub in Brush");

    }
}
