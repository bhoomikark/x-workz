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
    @Override
    public int hashCode() {
        return 104;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Socks) {
                System.out.println("Socks is reference of object");
                Socks socks1 = this;
                Socks socks2 = (Socks) obj;

                if (socks1.socksColor.equals(socks2.socksColor) &&
                        socks1.socksMaterialUsed.equals(socks2.socksMaterialUsed)) {
                    System.out.println("Both socks are same (based on color and material)");
                    return true;
                }
            }
        }
        return false;
    }
}
