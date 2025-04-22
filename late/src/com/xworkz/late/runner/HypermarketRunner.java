// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.aapackage.*;
import com.xworkz.late.external.aapackage.*;

public class HypermarketRunner {
    public static void main(String[] args) {
        Target target = new Hypermarkets();
        People people = new People(target);
        people.visit();
    }
}
