// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.rpackage.*;
import com.xworkz.late.external.rpackage.*;

public class JeansRunner {
    public static void main(String[] args) {
        DenimThread thread = new DenimGarments();
        Jeans jeans = new Jeans(thread);
        jeans.wear();
    }
}
