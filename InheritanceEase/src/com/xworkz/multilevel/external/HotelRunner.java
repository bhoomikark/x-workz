package com.xworkz.multilevel.external;

import com.xworkz.multilevel.internal.hotel.HotelCook;

public class HotelRunner {
    public static void main(String[] args) {
        HotelCook obj = new HotelCook();
        obj.manage();
        obj.clean();
        obj.cook();
    }
}
