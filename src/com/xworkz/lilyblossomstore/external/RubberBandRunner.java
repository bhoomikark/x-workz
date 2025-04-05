package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.rubberband.RubberBand;
import com.xworkz.lilyblossomstore.internal.rubberband.ElasticRubberBand;

public class RubberBandRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        RubberBand rubberBand1 = new RubberBand();
        rubberBand1.stretch();
        rubberBand1.hold();
        rubberBand1.breakIfOverstretched();
        rubberBand1.shrink();
        rubberBand1.twist();

        RubberBand rubberBand = new ElasticRubberBand();
        rubberBand.stretch();
        rubberBand.hold();
        rubberBand.breakIfOverstretched();
        rubberBand.shrink();
        rubberBand.twist();

        System.out.println("-----------");

        System.out.println("Using child type reference:");
        ElasticRubberBand elasticRubberBand = new ElasticRubberBand();
        elasticRubberBand.stretch();
        elasticRubberBand.hold();
        elasticRubberBand.breakIfOverstretched();
        elasticRubberBand.shrink();
        elasticRubberBand.twist();
    }
}
