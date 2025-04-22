
package com.xworkz.late.runner;

import com.xworkz.late.internal.vpackage.*;
import com.xworkz.late.external.vpackage.*;

public class HandbagsRunner {
    public static void main(String[] args) {
        Clips clips = new Dress();
        Handbags bags = new Handbags(clips);
        bags.secure();
    }
}
