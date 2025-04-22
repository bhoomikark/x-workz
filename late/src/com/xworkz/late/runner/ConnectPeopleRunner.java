
package com.xworkz.late.runner;

import com.xworkz.late.internal.tpackage.*;
import com.xworkz.late.external.tpackage.*;

public class ConnectPeopleRunner {
    public static void main(String[] args) {
        Bridge bridge = new TwoRoads();
        ConnectPeople connect = new ConnectPeople(bridge);
        connect.useBridge();
    }
}
