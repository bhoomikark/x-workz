package com.xworkz.swiggit.internal;

public class Curtains {
    private String curtonType;
    private double curtonPrice;
    private String curtonColor;

    public Curtains(String curtonType, double curtonPrice, String curtonColor) {
        this.curtonType = curtonType;
        this.curtonPrice = curtonPrice;
        this.curtonColor = curtonColor;
        System.out.println("79. Running Curtains Constructor");
    }
@Override
    public String toString() {
        return "Type: " + curtonType + ", Price: ₹" + curtonPrice + ", Color: " + curtonColor;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 777;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Curtains) {
                System.out.println("Curtains is reference of object");
                Curtains c1 = this;
                Curtains c2 = (Curtains) obj;
                if (c1.curtonType.equals(c2.curtonType) ) {
                    System.out.println("Both curtains have same type and color");
                    return true;
                }
            }
        }
        return false;
    }
}
