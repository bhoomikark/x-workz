package com.xworkz.lilyblossomstore.internal.aimodel;

import com.xworkz.lilyblossomstore.internal.aerialvehicle.Drone;

public class AIMLModel {
    public void learn(AIModel model)
    {
        System.out.println("The model learns new network");
        System.out.println("=============================");
        model.optimize();
        model.predict();
        model.train();
        model.validate();
        if(model instanceof NeuralNetworkModel)
        {
            System.out.println("unmanned model is AIModel");
           NeuralNetworkModel neuralnetwork=(NeuralNetworkModel)model;
           neuralnetwork.test();
        }

    }
}
