package com.xworkz.swiggit.internal;

public class Whitener {
    private String whitenerBrand;
    private String formType;
    private boolean isRefillable;

    public Whitener(String whitenerBrand, String formType, boolean isRefillable) {
        this.whitenerBrand = whitenerBrand;
        this.formType = formType;
        this.isRefillable = isRefillable;
        System.out.println("85. Running Whitener Constructor");
    }
@Override
    public String toString() {
        return "Brand: " + whitenerBrand + ", Form: " + formType + ", Refillable: " + isRefillable;
    }
    @Override
    public int hashCode() {
        return 789;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Whitener) {
            Whitener whitener1 = this;
            Whitener whitener2 = (Whitener) obj;
            return whitener1.whitenerBrand.equals(whitener2.whitenerBrand) &&
                    whitener1.formType.equals(whitener2.formType) &&
                    whitener1.isRefillable == whitener2.isRefillable;
        }
        return false;
    }
}
