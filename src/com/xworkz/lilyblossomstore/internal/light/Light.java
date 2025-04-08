package com.xworkz.lilyblossomstore.internal.light;

public class Light extends LightSourcee {
    public Light() {
        super();
        System.out.println("Running Light Constructor - Child class");
    }

    @Override
    public void lightColor() {
        System.out.println("The color of light is White - Child class");
    }

    @Override
    public void lightType() {
        System.out.println("The type of light is artificial light - Child class");
    }

    @Override
    public void lightMaterial() {
        System.out.println("The light material used is copper - Child class");
    }

    @Override
    public void material() {
        System.out.println("The material is bulb - Child class");
    }

    @Override
    public void lightSource() {
        System.out.println("The source is ... - Child class");
    }
    public void brightnessLevel() {
        System.out.println("Light: Brightness can be adjusted.");
    }
}
