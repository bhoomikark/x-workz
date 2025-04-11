package com.xworkz.swiggit.internal;

public class Tshirt {
    private String color;
    private String brand;
    private int size;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("ref is not null");
        if (obj != null) {
            System.out.println("ref is tshirt");
            if (obj instanceof Tshirt) {
                Tshirt tshirt1 = this;
                Tshirt tshirt2 = (Tshirt)obj;
                if (tshirt1.brand.equals(tshirt2.brand) && tshirt1.size==tshirt2.size && tshirt1.color.equals(tshirt2.color))
                {
                    System.out.println("both are same");
                    return true;
                }


            }
        }
        return false;
    }
}
