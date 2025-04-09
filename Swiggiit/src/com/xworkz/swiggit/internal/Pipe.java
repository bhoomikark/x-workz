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
}
