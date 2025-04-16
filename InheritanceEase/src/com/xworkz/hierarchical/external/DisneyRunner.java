package com.xworkz.hierarchical.external;

import com.xworkz.hierarchical.internal.disneyland.Barbie;
import com.xworkz.hierarchical.internal.disneyland.MickeyMouse;

public class DisneyRunner {
    public static void main(String[] args) {
        MickeyMouse m = new MickeyMouse();
        m.showPlace();
        m.showCharacter();

        Barbie b = new Barbie();
        b.showPlace();
        b.showDoll();
    }
}
