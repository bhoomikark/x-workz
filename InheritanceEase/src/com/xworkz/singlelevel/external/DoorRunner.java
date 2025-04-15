package com.xworkz.singlelevel.external;

import com.xworkz.singlelevel.internal.door.FibreDoor;

public class DoorRunner {
    public static void main(String[] args) {
        FibreDoor fibreDoor=new FibreDoor();
        fibreDoor.Open();
        fibreDoor.close();
    }

}
