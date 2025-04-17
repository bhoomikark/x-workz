package com.xworkz.interfaceease.internal.twentyeight;

public interface CarRentalService {
    void rentCar();
    void returnCar();
    void extendRentalPeriod();
    default void viewPriceToREnt()
    {
        System.out.println("view price rent -- default");
    }
}
