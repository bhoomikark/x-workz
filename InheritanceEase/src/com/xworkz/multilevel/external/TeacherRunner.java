package com.xworkz.multilevel.external;

import com.xworkz.multilevel.internal.teacher.ChildrenDomain;

public class TeacherRunner {
    public static void main(String[] args) {
        ChildrenDomain obj = new ChildrenDomain();
        obj.teach();
        obj.play();
        obj.domainInfo();
    }
}
