package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.cover.Cover;
import com.xworkz.lilyblossomstore.internal.cover.MobileCover;

public class CoverRunner {
    public static void main(String[] args) {
        Cover cover = new MobileCover();
        cover.protect();
        cover.remove();
        cover.clean();
        cover.fold();
        cover.replace();

        System.out.println("-----------");

        MobileCover mobileCover = new MobileCover();
        mobileCover.protect();
        mobileCover.remove();
        mobileCover.clean();
        mobileCover.fold();
        mobileCover.replace();
    }
}
