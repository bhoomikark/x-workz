package com.xworkz.swiggit.internal;

public class TypeWriter {
    private int noOfTypeWriter;
    private boolean isThatTypeWriterWorking;
    private String typeWriterType;

    public TypeWriter(int noOfTypeWriter, boolean isThatTypeWriterWorking, String typeWriterType) {
        this.noOfTypeWriter = noOfTypeWriter;
        this.isThatTypeWriterWorking = isThatTypeWriterWorking;
        this.typeWriterType = typeWriterType;
        System.out.println("42. Running TypeWriter Constructor");
    }

    @Override
    public String toString() {
        return "No. of TypeWriters: " + noOfTypeWriter + ", Working: " + isThatTypeWriterWorking +
                ", TypeWriter Type: " + typeWriterType;
    }
    @Override
    public int hashCode() {
        return 120;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof TypeWriter) {
            TypeWriter typeWriter1 = this;
            TypeWriter typeWriter2 = (TypeWriter) obj;

            if (typeWriter1.noOfTypeWriter == typeWriter2.noOfTypeWriter &&
                    typeWriter1.isThatTypeWriterWorking == typeWriter2.isThatTypeWriterWorking &&
                    typeWriter1.typeWriterType.equals(typeWriter2.typeWriterType)) {
                return true;
            }
        }
        return false;
    }
}
