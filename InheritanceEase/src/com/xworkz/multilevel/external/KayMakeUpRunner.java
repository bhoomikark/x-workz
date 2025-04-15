package com.xworkz.multilevel.external;

import com.xworkz.multilevel.internal.makeup.Lipstick;

public class KayMakeUpRunner {
    public static void main(String[] args) {
        Lipstick obj = new Lipstick();
        obj.applyBase();
        obj.eyes();
        obj.applyLipstick();
    }
}
