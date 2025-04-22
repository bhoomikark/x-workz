package com.xworkz.late.runner;

import com.xworkz.late.external.*;
import com.xworkz.late.internal.*;

public class ICCRunner {
    public static void main(String[] args) {
        ICC icc=new IndianCricketTeamICCImpl();
        BCCI bcci=new BCCI(icc);
        bcci.play();
    }
}
