package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.sticker.Sticker;
import com.xworkz.lilyblossomstore.internal.sticker.VinylSticker;

public class StickerRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        Sticker sticker1 = new Sticker();
        sticker1.peel();
        sticker1.stick();
        sticker1.remove();
        sticker1.print();
        sticker1.decorate();

        Sticker sticker = new VinylSticker();
        sticker.peel();
        sticker.stick();
        sticker.remove();
        sticker.print();
        sticker.decorate();

        System.out.println("-----------");

        VinylSticker vinylSticker = new VinylSticker();
        vinylSticker.peel();
        vinylSticker.stick();
        vinylSticker.remove();
        vinylSticker.print();
        vinylSticker.decorate();
    }
}
