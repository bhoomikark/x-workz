package com.xworkz.multilevel.external;

import com.xworkz.multilevel.internal.pg.PgGirls;

public class PGRunner {
    public static void main(String[] args) {
        PgGirls obj = new PgGirls();
        obj.register();
        obj.allocateRoom();
        obj.facility();
    }
}
