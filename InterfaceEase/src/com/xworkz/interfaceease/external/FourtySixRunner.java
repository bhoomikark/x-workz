package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fourtysix.*;

public class FourtySixRunner {
    public static void main(String[] args) {
        Cook c = new Chef();
        c.prepare();
        c.cook();
        c.serve();
        c.bringIngredients();
    }
}
