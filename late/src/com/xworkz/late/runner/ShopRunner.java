// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.iipackage.*;
import com.xworkz.late.external.iipackage.*;

public class ShopRunner {
    public static void main(String[] args) {
        Payment pay = new PaymentImpl();
        Shop shop = new Shop(pay);
        shop.checkout();
    }
}
