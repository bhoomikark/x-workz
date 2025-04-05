package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.keyboard.Keyboard;
import com.xworkz.lilyblossomstore.internal.keyboard.MechanicalKeyboard;

public class KeyboardRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        Keyboard keyboard1 = new Keyboard();
        keyboard1.type();
        keyboard1.connect();
        keyboard1.pressKey();
        keyboard1.backlight();
        keyboard1.detach();

        Keyboard keyboard = new MechanicalKeyboard();
        keyboard.type();
        keyboard.connect();
        keyboard.pressKey();
        keyboard.backlight();
        keyboard.detach();

        System.out.println("-----------");

        MechanicalKeyboard mechanicalKeyboard = new MechanicalKeyboard();
        mechanicalKeyboard.type();
        mechanicalKeyboard.connect();
        mechanicalKeyboard.pressKey();
        mechanicalKeyboard.backlight();
        mechanicalKeyboard.detach();
    }
}
