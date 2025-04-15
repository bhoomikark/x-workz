package com.xworkz.rkbuilding.shape.internal;

public class Circle extends Shape{
    public Circle(String color,boolean isFilled, double borderThickness)
    {

       super(color, isFilled, borderThickness);
        System.out.println("Running Paramterised Constructor");
        System.out.println("We will see Circle Properties");
        System.out.println("Circle color is: "+this.color);
        System.out.println("Circle isFilled with color or not: "+this.isFilled);
        System.out.println("Circle borderThickeness is: "+this.borderThickness);
    }

}
