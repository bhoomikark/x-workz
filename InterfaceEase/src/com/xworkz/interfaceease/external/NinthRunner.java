package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.ninth.*;
import com.xworkz.interfaceease.internal.ninth.Readable;

public class NinthRunner {
    public static void main(String[] args) {
        System.out.println("Running Interface readable from book reader ");
        Readable readable = new BookReader();
        readable.openDocument();
        readable.readContent();
        readable.closeDocument();
        Writable writable2 = new Notes();
        writable2.createDocument();
        writable2.writeContent();
        writable2.saveDocument();
        System.out.println("=================================================");
        System.out.println("2 Copies from 2 subclasses");
        Readable readable1 = new Editor();
        readable1.openDocument();
        readable1.readContent();
        readable1.closeDocument();
        Writable writable = new Editor();
        writable.createDocument();
        writable.writeContent();
        writable.saveDocument();
        Readable readable2 = new Editor();
        readable2.openDocument();
        readable2.readContent();
        readable2.closeDocument();
        Writable writable1 = new Editor();
        writable1.createDocument();
        writable1.writeContent();
        writable1.saveDocument();
    }


}
