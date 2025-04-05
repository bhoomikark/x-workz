package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.keyboard.Keyboard;
import com.xworkz.lilyblossomstore.internal.keyboard.MechanicalKeyboard;

public class KeyboardRunner {
    public static void main(String[] args) {
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
