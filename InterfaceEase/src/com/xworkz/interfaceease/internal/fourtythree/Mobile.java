package com.xworkz.interfaceease.internal.fourtythree;

public interface Mobile {
    void call();
    void message();
    void browse();
default void makeNotes()
{
    System.out.println("make notes -- default");
}

}
