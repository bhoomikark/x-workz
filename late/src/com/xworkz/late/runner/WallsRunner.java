
package com.xworkz.late.runner;

import com.xworkz.late.internal.dpackage.*;
import com.xworkz.late.external.dpackage.*;

public class WallsRunner {
    public static void main(String[] args) {
        Toothpaste paste = new Toothbrush();
        Walls walls = new Walls(paste);
        walls.shine();
    }
}
