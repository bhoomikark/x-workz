package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.tshirt.TShirt;
import com.xworkz.lilyblossomstore.internal.tshirt.PoloTShirt;

public class TShirtRunner {
    public static void main(String[] args) {
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
