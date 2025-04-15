package com.xworkz.multilevel.external;

import com.xworkz.multilevel.internal.desert.Cookies;

public class DesertRunner {
    public static void main(String[] args) {
        Cookies obj = new Cookies();
        obj.serve();
        obj.flavorInfo();
        obj.topping();
    }
}
