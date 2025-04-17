package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.twentyeight.*;

public class TwentyeighthRunner {
    public static void main(String[] args) {
        CarRentalService rental = new LuxuryCarRental();
        rental.rentCar();
        rental.returnCar();
        rental.extendRentalPeriod();
    }
}
