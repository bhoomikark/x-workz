package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.window.Window;
import com.xworkz.lilyblossomstore.internal.window.GlassWindow;

public class WindowRunner {
    public static void main(String[] args) {
        Window window = new GlassWindow();
        window.open();
        window.close();
        window.clean();
        window.lock();
        window.unlock();

        System.out.println("-----------");

        GlassWindow glassWindow = new GlassWindow();
        glassWindow.open();
        glassWindow.close();
        glassWindow.clean();
        glassWindow.lock();
        glassWindow.unlock();
    }
}
