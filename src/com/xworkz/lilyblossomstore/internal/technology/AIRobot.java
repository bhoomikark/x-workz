package com.xworkz.lilyblossomstore.internal.technology;

public class AIRobot {
    public void interactWithRobot(Robot robot) {
        System.out.println("\nInteracting with robot...");

        robot.powerOn();
        robot.performTask();
        robot.recharge();
        robot.communicate();
        robot.shutdown();

        if (robot instanceof HumanoidRobot) {
            System.out.println("Casting Robot to HumanoidRobot to access specific behavior...");
            HumanoidRobot humanBot = (HumanoidRobot) robot;
            humanBot.walkLikeHuman();
        }
    }
}
