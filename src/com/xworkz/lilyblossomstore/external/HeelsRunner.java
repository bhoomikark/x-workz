package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.heels.Heels;
import com.xworkz.lilyblossomstore.internal.heels.HighHeels;

public class HeelsRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        Heels heels1 = new Heels();
        heels1.wear();
        heels1.remove();
        heels1.clean();
        heels1.adjustStrap();
        heels1.walk();

        System.out.println("Using parent type reference:");
        Heels heels = new HighHeels();
        heels.wear();
        heels.remove();
        heels.clean();
        heels.adjustStrap();
        heels.walk();

        System.out.println("-----------");

        System.out.println("Using child type reference:");
        HighHeels highHeels = new HighHeels();
        highHeels.wear();
        highHeels.remove();
        highHeels.clean();
        highHeels.adjustStrap();
        highHeels.walk();
    }
}
