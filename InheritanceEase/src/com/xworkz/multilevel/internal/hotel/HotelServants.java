package com.xworkz.multilevel.internal.hotel;

public class HotelServants extends HotelOwner {
    public int staffCount = 10;

    public void clean() {
        System.out.println("Servants available: " + staffCount);
    }
}