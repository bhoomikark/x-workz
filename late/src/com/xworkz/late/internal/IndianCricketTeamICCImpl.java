package com.xworkz.late.internal;

public class IndianCricketTeamICCImpl implements ICC{
    public  IndianCricketTeamICCImpl()
    {
        super();
        System.out.println("no arg constructor");
    }
    @Override
    public void fairPlay() {

        System.out.println("Running IndiancricketImpl -- Override fairplay");
    }
}
