package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.kurta.Kurta;
import com.xworkz.lilyblossomstore.internal.kurta.DesignerKurta;

public class KurtaRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        Kurta kurta1 = new Kurta();
        kurta1.wear();
        kurta1.wash();
        kurta1.iron();
        kurta1.fold();
        kurta1.design();

        Kurta kurta = new DesignerKurta();
        kurta.wear();
        kurta.wash();
        kurta.iron();
        kurta.fold();
        kurta.design();

        System.out.println("-----------");

        DesignerKurta designerKurta = new DesignerKurta();
        designerKurta.wear();
        designerKurta.wash();
        designerKurta.iron();
        designerKurta.fold();
        designerKurta.design();
    }
}

