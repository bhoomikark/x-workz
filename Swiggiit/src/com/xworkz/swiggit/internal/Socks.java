package com.xworkz.swiggit.internal;

public class Socks {
    private String socksColor;
    private int noOfSocksBought;
    private String socksMaterialUsed;

    public Socks(String socksColor, int noOfSocksBought, String socksMaterialUsed) {
        this.socksColor = socksColor;
        this.noOfSocksBought = noOfSocksBought;
        this.socksMaterialUsed = socksMaterialUsed;
        System.out.println("64. Running Socks Constructor");
    }

    @Override
    public String toString() {
        return "Socks Color: " + socksColor + ", Number of Socks Bought: " + noOfSocksBought + ", Material Used: " + socksMaterialUsed;
    }
}
