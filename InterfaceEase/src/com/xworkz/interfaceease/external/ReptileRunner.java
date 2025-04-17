package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fifth.*;

public class ReptileRunner {
    public static void main(String[] args) {
        System.out.println("5.Running interface Reptile reference from Snake class");
        Venomous snake = new Snake();
        snake.bite();
        snake.injectVenom();
        Reptile reptileSnake = (Reptile) snake;
        reptileSnake.crawl();
        reptileSnake.shedSkin();
        reptileSnake.makeSound();
        Venomous viper2 = new Scorpion();
        viper2.bite();
        viper2.injectVenom();
        viper2.venom();
        System.out.println("=================================");

        System.out.println("Running interface Reptile reference from Viper class");
        Venomous viper = new Viper();
        viper.bite();
        viper.injectVenom();
        Reptile reptileViper = (Reptile) viper;
        reptileViper.crawl();
        reptileViper.shedSkin();
        reptileViper.makeSound();
        System.out.println("=================================");

        System.out.println("Running interface Reptile reference from Lizard class");
        Reptile lizard = new Lizard();
        lizard.crawl();
        lizard.shedSkin();
        lizard.makeSound();
        lizard.sleep();
        System.out.println("=================================");
    }
}