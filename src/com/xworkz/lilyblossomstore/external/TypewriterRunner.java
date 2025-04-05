package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.typewriter.Typewriter;
import com.xworkz.lilyblossomstore.internal.typewriter.ElectricTypewriter;

public class TypewriterRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        Typewriter typewriter1 = new Typewriter();
        typewriter1.type();
        typewriter1.insertPaper();
        typewriter1.removePaper();
        typewriter1.changeRibbon();
        typewriter1.adjustMargin();

        Typewriter typewriter = new ElectricTypewriter();
        typewriter.type();
        typewriter.insertPaper();
        typewriter.removePaper();
        typewriter.changeRibbon();
        typewriter.adjustMargin();

        System.out.println("-----------");

        ElectricTypewriter electricTypewriter = new ElectricTypewriter();
        electricTypewriter.type();
        electricTypewriter.insertPaper();
        electricTypewriter.removePaper();
        electricTypewriter.changeRibbon();
        electricTypewriter.adjustMargin();
    }
}
