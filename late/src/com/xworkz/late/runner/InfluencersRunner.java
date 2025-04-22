
package com.xworkz.late.runner;

import com.xworkz.late.internal.xpackage.*;
import com.xworkz.late.external.xpackage.*;

public class InfluencersRunner {
    public static void main(String[] args) {
        Instagram insta = new Users();
        Influencers influencers = new Influencers(insta);
        influencers.engage();
    }
}
