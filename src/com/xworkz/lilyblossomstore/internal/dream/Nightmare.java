package com.xworkz.lilyblossomstore.internal.dream;

public class Nightmare extends Dream {
    public Nightmare() {

        System.out.println("Nightmares cause fear...");
    }

    @Override
    public void duration() {
        System.out.println("Child Class");
        System.out.println("Nightmares can feel longer than they are...");
    }

    @Override
    public void meaning() {
        System.out.println("Child Class");
        System.out.println("Nightmares often reflect stress or trauma...");
    }

    @Override
    public void remember() {
        System.out.println("Child Class");
        System.out.println("Nightmares are more likely to be remembered...");
    }

    @Override
    public void influence() {
        System.out.println("Child Class");
        System.out.println("Nightmares can strongly affect mood and sleep...");
    }
}
