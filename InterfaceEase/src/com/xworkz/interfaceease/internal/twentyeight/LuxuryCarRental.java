package com.xworkz.interfaceease.internal.twentyeight;

public class LuxuryCarRental implements CarRentalService {
    @Override
    public void rentCar() {
        System.out.println("Renting a luxury car.");
    }

    @Override
    public void returnCar() {
        System.out.println("Returning the luxury car.");
    }

    @Override
    public void extendRentalPeriod() {
        System.out.println("Extending the rental period for the luxury car.");
    }
@Override
    public void viewPriceToREnt()
    {
        System.out.println("view price rent -- luxury car rental");
    }
}

