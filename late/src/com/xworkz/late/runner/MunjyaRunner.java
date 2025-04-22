// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.ffpackage.*;
import com.xworkz.late.external.ffpackage.*;

public class MunjyaRunner {
    public static void main(String[] args) {
        Danger d = new HorrorMovies();
        Munjya munjya = new Munjya(d);
        munjya.haunt();
    }
}
