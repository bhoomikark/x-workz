package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.typewriter.Typewriter;
import com.xworkz.lilyblossomstore.internal.typewriter.ElectricTypewriter;

public class TypewriterRunner {
    public static void main(String[] args) {
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
