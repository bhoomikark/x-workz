package com.xworkz.swiggit.internal;

public class JeansPant {
    private String jeansPantType;
    private String jeansPantMadeUpOf;
    private String jeansPantColor;

    public JeansPant(String jeansPantType, String jeansPantMadeUpOf, String jeansPantColor) {
        this.jeansPantType = jeansPantType;
        this.jeansPantMadeUpOf = jeansPantMadeUpOf;
        this.jeansPantColor = jeansPantColor;
        System.out.println("71. Running JeansPant Constructor");
    }
@Override
    public String toString() {
        return "Type: " + jeansPantType + ", Material: " + jeansPantMadeUpOf + ", Color: " + jeansPantColor;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 505;
    }
}
