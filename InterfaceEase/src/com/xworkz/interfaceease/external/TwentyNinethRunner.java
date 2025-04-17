package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.twentynine.*;

public class TwentyNinethRunner {
    public static void main(String[] args) {
        LibraryManagement library = new PublicLibrary();
        library.returnBook();
        library.searchBook();
        library.viewSettings();
    }
}
