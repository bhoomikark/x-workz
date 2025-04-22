// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.ccpackage.*;
import com.xworkz.late.external.ccpackage.*;

public class ChildrenRunner {
    public static void main(String[] args) {
        Cartoon cartoon = new Doremon();
        Children child = new Children(cartoon);
        child.watch();
    }
}
