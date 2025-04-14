package com.xworkz.swiggit.internal;

public class Pipe {
    private String pipeType;
    private int pipeNo;
    private String pipeBrand;

    public Pipe(String pipeType, int pipeNo, String pipeBrand) {
        this.pipeType = pipeType;
        this.pipeNo = pipeNo;
        this.pipeBrand = pipeBrand;
        System.out.println("44. Running Pipe Constructor");
    }

    @Override
    public String toString() {
        return "Pipe Type: " + pipeType + ", Pipe No: " + pipeNo + ", Pipe Brand: " + pipeBrand;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 555;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pipe) {
            Pipe otherPipe = (Pipe) obj;
            return this.pipeType.equals(otherPipe.pipeType) &&
                    this.pipeNo == otherPipe.pipeNo &&
                    this.pipeBrand.equals(otherPipe.pipeBrand);
        }
        return false;
    }
}
