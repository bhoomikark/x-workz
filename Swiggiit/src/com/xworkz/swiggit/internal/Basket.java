package com.xworkz.swiggit.internal;

public class Basket {
    private String basketType;
    private String basketMadeUpOf;
    private String basketColor;

    public Basket(String basketType, String basketMadeUpOf, String basketColor) {
        this.basketType = basketType;
        this.basketMadeUpOf = basketMadeUpOf;
        this.basketColor = basketColor;
        System.out.println("74. Running Basket Constructor");
    }
@Override
    public String toString() {
        return "Type: " + basketType + ", Made Of: " + basketMadeUpOf + ", Color: " + basketColor;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 222;
    }
    public String getBasketType() {
        return basketType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Basket) {
                System.out.println("Basket is reference of object");
                Basket basket1 = this;
                Basket basket2 = (Basket) obj;
                if (basket1.basketType.equals(basket2.basketType)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
