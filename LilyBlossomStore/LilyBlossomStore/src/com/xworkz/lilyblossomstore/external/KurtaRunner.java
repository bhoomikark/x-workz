package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.kurta.Kurta;
import com.xworkz.lilyblossomstore.internal.kurta.DesignerKurta;

public class KurtaRunner {
    public static void main(String[] args) {
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

