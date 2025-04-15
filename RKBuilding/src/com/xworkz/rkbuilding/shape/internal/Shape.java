package com.xworkz.rkbuilding.shape.internal;

public abstract class Shape {
    String color;
    boolean isFilled;
    double borderThickness;
    public Shape(String color,boolean isFilled,double borderThickness)
    {
        this.color=color;
        this.isFilled=isFilled;
        this.borderThickness=borderThickness;
    }

}
