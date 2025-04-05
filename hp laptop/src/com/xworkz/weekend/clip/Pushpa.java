package com.xworkz.weekend.clip;

public class Pushpa {
    Clip clip;

    Pushpa(Clip clip) {
        System.out.println("use of clip in pushpa");
        this.clip = clip;
    }

    void useClip(Clip[] clip) {
        for (Clip clips : clip) {


            if (this.clip != null) {
                this.clip.color();
                this.clip.hold();
            } else {
                System.out.println("errors");
            }

        }
    }
}
