package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Holder;

public class HolderRunner {
    public static void main(String[] args) {
        Holder holder = new Holder("Plastic", 4, "Black");

        System.out.println("Holder to string: " + holder.toString());
    }
}
