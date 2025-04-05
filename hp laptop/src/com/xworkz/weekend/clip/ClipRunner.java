package com.xworkz.weekend.clip;

public class ClipRunner {
    public static void main(String[] args)
    {
        Clip[] clip=new Clip[6];
        for(int i=0;i<clip.length;i++)
        {
            clip[i]=new Clip();
        }
        Pushpa pushpa=new Pushpa(clip[4]);
        pushpa.useClip(clip);
    }
}
