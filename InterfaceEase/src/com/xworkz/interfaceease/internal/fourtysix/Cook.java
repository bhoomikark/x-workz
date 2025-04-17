package com.xworkz.interfaceease.internal.fourtysix;

public interface Cook {
    void prepare();
    void cook();
    void serve();
    default void bringIngredients()
    {
        System.out.println("Bring Ingredients --default");
    }
}
