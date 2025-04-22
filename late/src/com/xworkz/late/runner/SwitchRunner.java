package com.xworkz.late.runner;

import com.xworkz.late.internal.bpackage.*;
import com.xworkz.late.external.bpackage.*;

public class SwitchRunner {
    public static void main(String[] args) {
        Wire wire = new FanImpl();
        Switch sw = new Switch(wire);
        sw.toggle();
    }
}