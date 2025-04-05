package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.hairs.Hairs;
import com.xworkz.lilyblossomstore.internal.hairs.CurlyHairs;

public class HairsRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        Hairs hairs1 = new Hairs();
        hairs1.grow();
        hairs1.cut();
        hairs1.wash();
        hairs1.comb();
        hairs1.style();

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
