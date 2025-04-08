package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.hairs.Hairs;
import com.xworkz.lilyblossomstore.internal.hairs.CurlyHairs;

public class HairsRunner {
    public static void main(String[] args) {
        Hairs hairs = new CurlyHairs();
        hairs.grow();
        hairs.cut();
        hairs.wash();
        hairs.comb();
        hairs.style();

        System.out.println("-----------");

        CurlyHairs curlyHairs = new CurlyHairs();
        curlyHairs.grow();
        curlyHairs.cut();
        curlyHairs.wash();
        curlyHairs.comb();
        curlyHairs.style();
    }
}
