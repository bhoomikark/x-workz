
package com.xworkz.late.runner;

import com.xworkz.late.internal.qpackage.*;
import com.xworkz.late.external.qpackage.*;

public class SketchRunner {
    public static void main(String[] args) {
        Pencil pencil = new Art();
        Sketch sketch = new Sketch(pencil);
        sketch.create();
    }
}
