package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.thirtyone.*;

public class ThirtyoneRunner {
    public static void main(String[] args) {
        ContentManagement content = new BlogContentManagement();
        content.createContent();
        content.publishContent();
        content.deleteContent();
    }
}
