
package com.xworkz.late.runner;

import com.xworkz.late.internal.ppackage.*;
import com.xworkz.late.external.ppackage.*;

public class PeopleRunner {
    public static void main(String[] args) {
        Metro metro = new MetropolitanCities();
        People people = new People(metro);
        people.commute();
    }
}
