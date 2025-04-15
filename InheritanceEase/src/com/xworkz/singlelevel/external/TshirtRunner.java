package com.xworkz.singlelevel.external;

import com.xworkz.singlelevel.internal.tshirt.CompanyTshirt;

public class TshirtRunner {
    public static void main(String[] args) {
        CompanyTshirt companyTshirt = new CompanyTshirt();
        companyTshirt.remove();
        companyTshirt.wear();
    }
}
