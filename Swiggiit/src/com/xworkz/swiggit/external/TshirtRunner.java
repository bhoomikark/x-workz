package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Tshirt;

public class TshirtRunner {
    public static void main(String[] args) {
        Tshirt tshirt1=new Tshirt();
        tshirt1.setBrand("Puma");
        tshirt1.setColor("Black");
        tshirt1.setSize(28);

        Tshirt tshirt2=new Tshirt();
        tshirt2.setBrand("AllenSolly");
        tshirt2.setSize(25);
        tshirt2.setColor("blue");


        System.out.println("checking same location: "+(tshirt1==tshirt2));
        boolean same=tshirt2.equals("Arrow");
        System.out.println("tshirt1 is same as tshirt2: "+same);
    }
}
