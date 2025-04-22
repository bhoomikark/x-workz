
package com.xworkz.late.runner;

import com.xworkz.late.internal.ypackage.*;
import com.xworkz.late.external.ypackage.*;

public class PersonRunner {
    public static void main(String[] args) {
        YouTube yt = new Vloggers();
        Person person = new Person(yt);
        person.watch();
    }
}
