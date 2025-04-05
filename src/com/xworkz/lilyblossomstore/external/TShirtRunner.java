package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.tshirt.TShirt;
import com.xworkz.lilyblossomstore.internal.tshirt.PoloTShirt;

public class TShirtRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        TShirt tshirt1 = new TShirt();
        tshirt1.wear();
        tshirt1.remove();
        tshirt1.wash();
        tshirt1.iron();
        tshirt1.fold();

        TShirt tshirt = new PoloTShirt();
        tshirt.wear();
        tshirt.remove();
        tshirt.wash();
        tshirt.iron();
        tshirt.fold();

        System.out.println("-----------");

        PoloTShirt poloTShirt = new PoloTShirt();
        poloTShirt.wear();
        poloTShirt.remove();
        poloTShirt.wash();
        poloTShirt.iron();
        poloTShirt.fold();
    }
}
